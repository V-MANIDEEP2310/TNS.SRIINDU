package com.tnsif.assignments4;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemoSorting {
	public static void main(String [] args) {
		
		
		//Stream API using Sorting Collection
		//Examples :- (9,2,8,4,8,5)
		List<Integer>list=Arrays.asList(9,2,8,4,8,5);	
		list.stream()
		.sorted()
		.forEach(System.out::println);
	}

}
