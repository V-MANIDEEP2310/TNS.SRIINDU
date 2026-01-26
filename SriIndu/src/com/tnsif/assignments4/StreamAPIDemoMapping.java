package com.tnsif.assignments4;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemoMapping {

	public static void main(String[] args) {
		
		//Stream API using Mapping
		//Examples :- ("MANIDEEP","CHANDRA SHEKAR","RISHI")
				List<String>names=Arrays.asList("Manideep","Chandra Shekar","Rishi");
				names.stream()
				.map(name->name.toUpperCase())
				.forEach(System.out::println);
	

	}

}
