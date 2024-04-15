import java.util.*;

public class TwoDarrayLargest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the array:");
        int row = sc.nextInt();
        System.out.println("Enter the column of the array:");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the element at row " + i + " and column " + j + ": ");
                array[i][j] = sc.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}
