package Recursion;

import java.util.Scanner;

public class SumOf_N_NaturalNumber {
	public static void main(String[] args) {
		System.out.println("Enter the value of number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sum(n));
	}

	public static int sum(int n) {
//		int a = 1,add=0;
//		while(a<=n) {
//			add = add+a;
//			a++;
//		}
//		return add;
		if(n==0) {
			return 0;
		}
		int Xsum = sum(n-1);
		int add = Xsum + n;
		return add;
	}
}
