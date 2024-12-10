package arrays;

import java.util.Arrays;
import java.util.Scanner;
/**
 * This class demonstrates various operations and concepts related to arrays in Java.
 * Arrays are a collection of elements of the same data type.
 */

public class ArrayPractice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Introduction to arrays
        System.out.println("An array is a collection of elements of the same data type.");

        // Declaring arrays
        // Syntax: data_type[] arrayName;
        int[] rollNumbers;  // Array of integers
        String[] names;     // Array of Strings
        double[] salaries;  // Array of doubles

        // Explanation of array memory allocation
        int[] arr; // Declaration of an integer array. At this stage, it is null by default.
        arr = new int[5]; // Memory allocation happens at runtime (dynamic memory allocation) in the heap.

        // Example of an array declaration and initialization
        int[] n = new int[5]; // Memory allocation for 'n' happens during runtime.
        int[] percentage = {12, 45, 67, 90, 60}; // Array initialization with predefined values.

        // Using a for loop to iterate through the array
        System.out.println("Executing a for loop on the 'percentage' array...");
        for (int i = 0; i < percentage.length; i++) {
            System.out.printf("percentage[%d] = %d%n", i, percentage[i]);
        }

        // Using a for-each loop to iterate through the array
        System.out.println("\nExecuting a for-each loop on the 'percentage' array...");
        for (int value : percentage) {
            System.out.printf("%d ", value);
        }

        // Taking user input to create and populate an array
        System.out.println("\n\nEnter the array values of your choice:");
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] choiceArray = new int[size]; // Dynamically allocating memory based on user input
        System.out.println("Start entering the array elements: ");
        for (int i = 0; i < choiceArray.length; i++) {
            System.out.printf("choiceArray[%d] = ", i);
            choiceArray[i] = in.nextInt();
        }

        // Displaying the user-created array
        System.out.println("The array you have entered is: " + Arrays.toString(choiceArray));


        // Closing the scanner to prevent resource leaks
        in.close();






    }


}