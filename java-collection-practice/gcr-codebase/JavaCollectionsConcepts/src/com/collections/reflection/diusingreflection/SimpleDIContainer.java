package com.collections.reflection.diusingreflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

//Step 4: Simple DI Container
class SimpleDIContainer {

 private Map<Class<?>, Object> instances = new HashMap<>();

 // Register a class instance
 public <T> void register(Class<T> clazz) throws Exception {
     T obj = clazz.getDeclaredConstructor().newInstance();
     instances.put(clazz, obj);
 }

 // Inject dependencies into target object
 public void injectDependencies(Object target) throws Exception {
     Class<?> cls = target.getClass();
     Field[] fields = cls.getDeclaredFields();

     for (Field field : fields) {
         if (field.isAnnotationPresent(Inject.class)) {
             Class<?> fieldType = field.getType();
             Object dependency = instances.get(fieldType);

             if (dependency == null) {
                 // Automatically create dependency if not registered
                 dependency = fieldType.getDeclaredConstructor().newInstance();
                 instances.put(fieldType, dependency);
             }

             field.setAccessible(true);
             field.set(target, dependency);
         }
     }
 }
}
