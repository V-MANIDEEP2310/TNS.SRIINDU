package com.tnsif.java.day14;

import java.util.HashMap;

public class LambdaWithMap {
	

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("MANIDEEP", 59);
		hm.put("CHANDRA SHEKAR", 9);
		hm.put("SHIVA GANESH", 7);
		
		hm.forEach((key,value)->System.out.println("NAMES:"+key+"ROLL.NO:"+value));

	}

}
