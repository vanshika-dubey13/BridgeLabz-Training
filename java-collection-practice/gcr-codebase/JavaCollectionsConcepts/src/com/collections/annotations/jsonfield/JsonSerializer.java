package com.collections.annotations.jsonfield;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/* =======================
   JSON Serializer
   ======================= */
class JsonSerializer {

    public static String toJson(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            Map<String, Object> jsonMap = new LinkedHashMap<>();

            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(JsonField.class)) {
                    field.setAccessible(true);

                    JsonField annotation = field.getAnnotation(JsonField.class);
                    String jsonKey = annotation.name();
                    Object value = field.get(obj);

                    jsonMap.put(jsonKey, value);
                }
            }

            return buildJson(jsonMap);

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static String buildJson(Map<String, Object> map) {
        StringBuilder json = new StringBuilder("{");

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            json.append("\"")
                .append(entry.getKey())
                .append("\":");

            Object value = entry.getValue();
            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }
            json.append(",");
        }

        // remove trailing comma
        if (json.length() > 1) {
            json.deleteCharAt(json.length() - 1);
        }

        json.append("}");
        return json.toString();
    }
}
