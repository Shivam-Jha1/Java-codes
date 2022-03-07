package Dynamic_Programming;
import java.util.*;
public class knacpsack_0_1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = s.nextInt();
		System.out.println("Enter values");
		int[] v = new int[n];
		for(int i=0;i<n;i++) {
			v[i] = s.nextInt();
		}
		System.out.println("Enter the weights");
		int[] w = new int[n];
		for(int i=0;i<n;i++) {
			w[i] = s.nextInt();
		}
		System.out.println("Enter total weight");
		int W = s.nextInt();
		int ans = knapsack(w,v,n,W,0);
		System.out.println(ans);
	}

	private static int knapsack(int[] w, int[] v, int n, int W,int i) {
		
		if(W==0) {
			return 0;
		}
		if(i>=n) {
			return 0;
		}
		if(w[i]<=W) {
			return Math.max(v[i]+knapsack(w, v, n, W-w[i], i+1), knapsack(w, v, n, W, i+1));
		}
		else {
			return knapsack(w, v, n, W, i+1);
		}	
	}
}
