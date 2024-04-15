/*Question Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than its just left and just right neighbor.

Input 1: arr[] = {1,3,2,6,5}
Output 1: 6

Input 2:  arr[] = {1 4,7,3,2,6,5}
Output 1: 7*/

import java.util.*;

public class ArrayPeakNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int n = array.length;
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                if (array[i + 1] > max) {
                    max = array[i];
                }
                max = array[i];
            }

        }
        System.out.println(max);
    }

}
