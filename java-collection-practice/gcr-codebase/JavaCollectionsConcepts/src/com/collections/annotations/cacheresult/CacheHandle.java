package com.collections.annotations.cacheresult;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class CacheHandler implements InvocationHandler {

	private final Object target;
	private final Map<String, Object> cache = new HashMap<>();

	public CacheHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Method targetMethod =
				target.getClass().getMethod(method.getName(), method.getParameterTypes());

		if (targetMethod.isAnnotationPresent(CacheResult.class)) {
			
			String cacheKey = method.getName() + Arrays.toString(args);

			if (cache.containsKey(cacheKey)) {
				System.out.println("Returning cached result for " + cacheKey);
				return cache.get(cacheKey);
			}

          Object result = method.invoke(target, args);
          cache.put(cacheKey, result);
          return result;
      }

      return method.invoke(target, args);
  }
}
