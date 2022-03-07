package Dynamic_Programming;

import java.util.Scanner;

public class minSquaretoRepresent {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] dp = new int[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i] = -1;
		}
	//	int ans = minSquare(n,dp);
		int ans = minSquare(n);
		System.out.println(ans);
	}

	private static int minSquare(int n) {

		int[] dp = new int[n+1];
		dp[0] = 0;
		for(int i=1;i<dp.length;i++) {
			
			int minAns = Integer.MAX_VALUE;
			for(int j=1;(j*j)<=i;j++) {
				int currAns = dp[(i-(j*j))];
				
				if(minAns>currAns) {
					minAns = currAns;
				}
			}
			dp[i] = minAns+1;
		}
		
		return dp[n];
	}

	private static int minSquare(int n,int[] dp) {

		if(n==0) {
			return 0;
		}

		int minans = Integer.MAX_VALUE;
		for(int i=1; (i*i)<=n; i++) {
			
			int currans;

			if(dp[n-(i*i)]==-1) {
				currans = minSquare(n-(i*i),dp);
				dp[n-(i*i)] = currans;
			}
			else {
				currans = dp[n-(i*i)];
			}
			
			if(minans>currans) {
				minans = currans;
			}
		}
		return minans+1;
	}
}
