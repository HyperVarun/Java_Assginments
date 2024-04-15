//Write a program to print the sum of all the elements present on even indices in the given array.

import java.util.Scanner;

public class ArrayEvenSum {
    public static void main(String[] args) {

        // int arr[] = { 3, 20, 4, 6, 9 };
        // int arr[] = { 4, 3, 6, 7, 1 };
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Create an array of that size
        int[] array = new int[size];

        // Get the elements of the array from the user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        int n = array.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Sum of even index value is :" + sum);
    }

}
