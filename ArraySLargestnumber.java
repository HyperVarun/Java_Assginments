import java.util.*;

public class ArraySLargestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        int n = array.length;
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i - 1];
            }
        }
        System.out.println(max);
    }
}
