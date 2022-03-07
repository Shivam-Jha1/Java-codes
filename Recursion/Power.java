package Recursion;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		System.out.println("Enter the value of number");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		System.out.println(power(x,n));
	}

	public static int power(int x,int n) {
		
		if(n==0) {
			return 1;
		}
		int pow1 = power(x,n/2);
		int pow = pow1*pow1;
		if(n%2==1) {
			pow = x*pow;
		}
		return pow;
	
//		if(n==0) {
//			return 1;
//		}
//		int pow = power(x,n-1);
//		int ans = x*pow;
//		return ans;
		
		
//		int a = 1,pow=1;
//		while(a<=n) {
//			pow = pow*x;
//			a++;
//		}
//		return pow;
	}
}
