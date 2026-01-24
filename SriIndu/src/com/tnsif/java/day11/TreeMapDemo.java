package com.tnsif.java.day11;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

       
        TreeMap<Integer, String> map = new TreeMap<>();

        
        map.put(3, "C++");
        map.put(1, "Java");
        map.put(2, "Python");

        
        System.out.println("TreeMap elements: " + map);

        
        System.out.println("Value for key 2: " + map.get(2));

        
        map.remove(3);

     
        System.out.println("Contains key 1? " + map.containsKey(1));

   
        System.out.println("Using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}
