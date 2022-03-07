package Dynamic_Programming;

import java.util.*;

public class minCostPath {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the no of rows");
		int i = s.nextInt();
		System.out.println("Enter the no of columns");
		int j = s.nextInt();

		int arr[][] = new int[i][j];


		for(int m = 0;m<i;m++) {

			for(int n=0;n<j;n++) {
				System.out.println("Enter the element at "+m+"th row and "+n+"th column");
				arr[m][n] = s.nextInt();
			}
			System.out.println();
		}
		int ans = minCostpath(arr);
		
		System.out.println("The minimum cost will be "+ans);
	}

	private static int minCostpath(int[][] input) {

		int row = input.length;
		int col = input[0].length;

		int dp[][] = new int[row+1][col+1];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = Integer.MIN_VALUE;
			}
		}
		
		return minCostPath(input,0,0,row,col,dp);

	}

	public static int minCostPath(int[][] input,int i,int j,int row,int col,int[][] dp){

		if(i==row-1 && j == col-1) {
			return input[i][j];
		}

		if(i>=row || j>=col){
			return Integer.MAX_VALUE;
		}

		int ans1,ans2,ans3;
		
		if(dp[i+1][j]==Integer.MIN_VALUE) {
		ans1 = minCostPath(input,i+1,j,row,col,dp);
		dp[i+1][j] = ans1;
		}
		else {
			ans1 = dp[i+1][j];
		}

		if(dp[i][j+1]==Integer.MIN_VALUE) {
			ans2 = minCostPath(input,i,j+1,row,col,dp);
			dp[i][j+1] = ans2;
			}
			else {
				ans2 = dp[i][j+1];
			}

		if(dp[i+1][j+1]==Integer.MIN_VALUE) {
			ans3 = minCostPath(input,i+1,j+1,row,col,dp);
			dp[i+1][j+1] = ans3;
			}
			else {
				ans3 = dp[i+1][j+1];
			}

		int minCost = input[i][j] + Math.min(ans1,Math.min(ans2,ans3));

		return minCost;
	}
}