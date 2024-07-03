// // Q1 Given an integr, find out the sum of its digits using recursi// Inputn=
// 1 // Output // Explanation 1+2+3+4 // Soluto

// // import java.util.Scanner;

// // public class SODProgram {

// // public static int SumofDigits(int n {
// // int r em=0;
// // if( nu m= {
// // return 0;
// // else {
// // r em= n um % 10+SumofDigits( n um/10);
// // }
// // return rem;
// //

// public static void main(String args {
// // Scanner sc=new Scanner(System.in);
// // System.out.println("Enter the number for sum of digits:");
// // int n um=sc.nextInt();
// // int s um=SumofDigits(num);
// // System.out.println("The sum of digits is : " +sum);
// // }

// // }

// // Q2 Gi
// en a num
// ern. Find
// he sum
// of natural numb
// rs til
// n but with
// // alternate signs.
// // That means i
// 5 then
// ou have to return 1-2+3-+
// 3 as your answ// Constraints 0=n=1e6
// // Input1 n = // Outpu 1 // Explanation 1-2+3-4+5-6+7-8+91 = // Input //
// Output // Soltu
// o
// // import java.util.Scanner;

// // public class AlternateSum {
// // public static void main(String args {
// // Scanner sc=new Scanner(System.in);
// // System.out.println("Enter the number for alternative sum series :");
// // int n um=sc.nextInt();
// // int res u lt=AlternativeSumFind(num);
// // System.out.println("Total number of sum in the series : " +result);
// // }

// // public static int AlternativeSumFind(int num) {

// // int res u lt=0;
// // if( nu m==0)
// // return 0;
// // if( n u m% 2==0)
// // res u lt=AlternativeSumFind( n um - 1)-num;
// // else
// // res u lt=AlternativeSumFind( n um - 1)+num;

// // return result;
// // }
// /

// // Q3 Pr
// nt the
// ax value of the ara [ 3,1, 3, 2, 5].
// // // Solution :
// // import java.util.Scanner;

// // public class MaxArray {
// // public sta c int finMaxValue(int arr [],int {
// // int m ax=arr[0];
// // i f( n= {
// // return arr[0];
// // else {
// // return Math.max(ar r [n- 1],finMaxValue(a r r ,n-1));
// // }
// // }

// // public static void main(String args {
// // Scanner sc=new Scanner(System.in);
// // System.out.println("Enter the size of the array:");
// // int size = sc.nextInt();
// // int[] array = new int[size];
// // for (int i = 0; i < size; i++) {
// // System.out.println("Enter element " + (i + 1) + ":");
// // array[i] = sc.nextInt();
// // }
// // int maxVa l ue=finMaxValue(arr ay,size);
// // System.out.println("The max value in the Array is : "+maxValue);
// // }
// /

// // Q4 F
// nd the
// um of
// he values of the aray [2, 3, 5, -0, 10].
// // Solution

// // import java.util.Scanner;

// // public class SumofArray {

// // public static void main(String args[]) {
// // Scanner sc = new Scanner(System.in);
// // System.out.println("Enter the size of the array:");
// // int size = sc.nextInt();
// // int[] array = new int[size];
// // for (int i = 0; i < size; i++) {
// // System.out.println("Enter element " + (i + 1) + ":");
// // array[i] = sc.nextInt();
// // }
// // int sum = findsumArray(array, 0);
// // System.out.println("Sum of the given array is : " + sum);

// // }

// // public static int findsumArray(int[] array, int index) {
// // int sum = 0;
// // if (index == array.length) {
// // return 0;
// // } else {
// // return array[index] + findsumArray(array, index + 1);
// // }

// // }
// /

// // Q5. Given a number n. Print if it is an armstrong number or not. An armst
// // ong number is a number if the sum
// // of every digit in that number raised to the power of total digits in that
// nu
// // ber is equal to the number.
// // Example 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an
// armstrong number. (Easy)
// // Input1 153
// // Output1 Yes
// // Input 2 134
// // Output2 No
// // Soltuion :
// // import java.util.Scanner;

// // public class ArmstrongNumber {

// // public static int countDigits(int number) {
// // if (number == 0) {
// // return 0;
// // }
// // return 1 + countDigits(number / 10);
// // }

// // public static int sumOfPower(int number, int power) {
// // if (number == 0) {
// // return 0;
// // }
// // int digit = number % 10;
// // return (int) Math.pow(digit, power) + sumOfPower(number / 10, power);
// // }

// // public static boolean isArmstrong(int number) {
// // int digits = countDigits(number);
// // int sum = sumOfPower(number, digits);
// // return sum == number;
// // }

// // public static void main(String[] args) {

// // Scanner sc=new Scanner(System.in);
// // System.out.println("Enter the number to check number is ArmStrong Number
// or not :");
// // int number = sc.nextInt();
// // if (isArmstrong(number)) {
// // System.out.println(number + " is an Armstrong number: " + true);
// // } else {
// // System.out.println(number + " is an Armstrong number: " + false);
// // }
// // }
// // }
