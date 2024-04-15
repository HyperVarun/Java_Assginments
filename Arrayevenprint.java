//Write a program to traverse over the elements of the array using for each loop and print all even elements.

import java.util.Scanner;

public class Arrayevenprint {
    public static void main(String[] args) {

        // int array[] = { 34, 21, 54, 65, 43 };
        // int array[] = { 4, 3, 6, 7, 1 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Even nmber in the array is :" + array[i]);
            }
        }
    }

}
