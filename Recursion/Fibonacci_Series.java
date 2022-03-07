package Recursion;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		System.out.println("Enter the value of number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	     System.out.println(fibonacci(n));
	}

	public static int fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		int fib1 = fibonacci(n-1);
		int fib2 = fibonacci(n-2);
		int output = fib1+fib2;
		return output;
	}
}
