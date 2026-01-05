package com.tnsif.assignments;



public class reverseString {

	public static void main(String[] args) {
		int i;
		String reversed="";
		String S = new String("MANIDEEP");
		 for(i=S.length()-1;i>=0;i--) {
			 reversed +=S.charAt(i);
		 }
		System.out.println(reversed);
	}

}
