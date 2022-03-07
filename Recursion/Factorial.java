package Recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the value of number");
		Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			System.out.println(fact(n));
		
	}

	private static int fact(int n) {
//		int a=2,factorial = 1;
//		while(a<=n) {
//			factorial = factorial*a;
//			a++;
//		}
//		System.out.println(factorial);
		if(n==0) {
			return 1;
		}
		int smallOutput = fact(n-1);
		int factorial = n*smallOutput;
		return factorial;
	}
}
