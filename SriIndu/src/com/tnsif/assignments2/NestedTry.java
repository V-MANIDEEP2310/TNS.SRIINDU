package com.tnsif.assignments2;

public class NestedTry {

    public static void main(String[] args) {

        try {
            // First try
            int a = 4;
            int b = 0;
            int c = a / b;
            System.out.println(c);

            try {
                // Second (nested) try
                int[] arr = {0, 1, 2, 3};
                System.out.println(arr[2]);
                System.out.println(arr[4]); // ArrayIndexOutOfBoundsException
            }
            
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("bye");
            }

        }
        catch (ArithmeticException e) {
            System.out.println("hiiii");
        }
    }
}
