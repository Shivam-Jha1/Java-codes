package Recursion;
import java.util.Scanner;
import java.math.*;
public class Geometric_Sum {
	public static void main(String[] args) {
		System.out.println("Enter the value of number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(GP(n));
	}

	public static double GP(int n) {
		if(n==0) {
			return 1.00000;
		}
		double a = GP(n-1);
		double ans = a+1/Math.pow(2,n);
		return ans;
	}

}
