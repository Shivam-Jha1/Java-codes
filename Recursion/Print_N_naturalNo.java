package Recursion;

import java.util.Scanner;

public class Print_N_naturalNo {
	public static void main(String[] args) {
		System.out.println("Enter the value of number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	     print(n);
	}

	public static void print(int n) {
		
		if(n==0) {
			return;
		}
		print(n-1);
		System.out.print(n+" ");
//		for(int i=1;i<=n;i++) {
//		System.out.print(i+" ");
//		}
	}
}
