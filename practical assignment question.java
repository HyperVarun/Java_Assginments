
// Question 1 WAP to demonstrate method overloading with 3 different parameters
import java.util.*;

class Program1
{
	public static void test(int n,int m,int k)
	{
		System.out.println("Argumets First " +n+ "," +m+ "," +k);
	}
	public static void test(int i,int j)
	{
		System.out.println("Arguments Second " +i+ "," +j);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Values for method overloading");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		test(a,b,c);
		test(a,b);
		
	}
}

// Question 2: WAP in java to create an object of an class which contains a
// method and call that class method in main method

class Test {
    public static void add() {
        System.out.println("Hello");
    }

}

class Program2 {
    public static void main(String args[]) {
        Test obj = new Test();
        obj.add();
    }
}

// Question 3 : WAP in java to calculate the sum of all elements in an intger
// array

class calc {
    public int add(int nums[]) {
        int result = 0;
        for (int n : nums) {
            result = result + n;
        }
        return result;
    }
}

class Program3 {
    public static void main(String args[]) {
        calc obj = new calc();
        int nums[] = { 5, 6, 4, 8 };
        int result = obj.add(nums);
        System.out.println(result);
    }

}

// Question 4: WAP in java to find the index specific element in an integer
// array?
import java.util.*;

class FindIndex {
    public int Index(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}

class Program4 {
    public static void main(String args[]) {
        FindIndex obj = new FindIndex();
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 5, 4, 6, 9 };
        System.out.print("Eneter the index value ");
        int element = sc.nextInt();
        int i = obj.Index(arr, element);
        if (i != -1) {
            System.out.println("The element is at index " + i);
        } else {
            System.out.println("The element is not in the array ");
        }
    }
}

// Question 5: WAP in java to print an entire array?

class Program5 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 5, 4, 6, 9 };
        for (int n : arr) {
            System.out.print(n);
        }

    }
}