package com.externalprog;
import java.util.HashMap;
import java.util.Map;


public class TypeCounter {

	    public static void main(String[] args) {
	        Object[] objects = {
	            "hello", 1, 2.5, true, 'a', new Integer(10), new Double(3.14),
	            new String("world"), new Boolean(false), new Character('b')
	        };

	        Map<Class<?>, Integer> typeCount = countTypes(objects);

	        for (Map.Entry<Class<?>, Integer> entry : typeCount.entrySet()) {
	            System.out.println(entry.getKey().getSimpleName() + ": " + entry.getValue());
	        }
	    }

	    public static Map<Class<?>, Integer> countTypes(Object[] objects) {
	        Map<Class<?>, Integer> typeCount = new HashMap<>();

	        for (Object obj : objects) {
	            Class<?> clazz = obj.getClass();
	            typeCount.put(clazz, typeCount.getOrDefault(clazz, 0) + 1);
	        }

	        return typeCount;
	    }
}
