package DynamicProgrammingCN;

public class DP2 {

	//MIN COST PATH PROBLEM

	import java.util.*;
	public class Solution {

		public static int minCostPath(int[][] input) {

			int row = input.length;
			int col = input[0].length;

			return minCostPath(input,0,0,row,col,0);

		}

		public static int minCostPath(int[][] input,int i,int j,int row,int col,int minCost){

			if(i==row-1 && j==col-1){
				return input[i][j];
			}

			if(i>=row || j>=col){
				return Integer.MAX_VALUE;
			}

			int ans1 = minCostPath(input,i+1,j,row,col,minCost);

			int ans2 = minCostPath(input,i,j+1,row,col,minCost);

			int ans3 = minCostPath(input,i+1,j+1,row,col,minCost);

			minCost = Math.min(ans1,Math.min(ans2,ans3));

			return input[i][j] + minCost;
		}
	}

	// LCS PROBLEM


	public class Solution {

		public static int lcs(String str1, String str2) {

			int[][] dp = new int[str1.length()+1][str2.length()+1];

			for(int i=0;i<dp.length;i++) {
				for(int j=0;j<dp[0].length;j++) {
					dp[i][j] = 0;
				}
			}
			for(int i=1;i<dp.length;i++) {
				for(int j=1;j<dp[0].length;j++) {

					if(str1.charAt(i-1)==str2.charAt(j-1)) {
						dp[i][j] = 1+dp[i-1][j-1];
					}
					else {
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
			return dp[dp.length-1][dp[0].length-1];
		}
	}

	//EDIT DISTANCE

	import java.util.*;
	public class Solution {

		public static int editDistance(String str1, String str2) {

			int[][] dp = new int[str1.length()+1][str2.length()+1];

			for(int i=0;i<dp.length;i++) {
				for(int j=0;j<dp[0].length;j++) {

					if(i==0) {
						dp[i][j] = j;
					}
					else if(j==0) {
						dp[i][j] = i;
					}

					else if(str1.charAt(i-1)==str2.charAt(j-1)) {

						dp[i][j] = dp[i-1][j-1];
					}

					else {
						dp[i][j] = 1+Math.min(dp[i][j-1] // insert
								, Math.min(dp[i-1][j]  //Remove
										, dp[i-1][j-1]));//Remove
					}
				}
			}

			return dp[dp.length-1][dp[0].length-1];
		}
	}

	// 0 1 KNACKPACK PROBLEM


	public class Solution {

		public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {

			int dp[][]=new int[n+1][maxWeight+1];
			for(int i =0;i<dp.length;i++)
			{
				for(int j = 0;j<dp[0].length;j++)
				{
					dp[i][j]=-1;
				}
			}

			return knap(weights,values,n,maxWeight,dp);
		}

		public static int knap(int weights[],int values[],int n,int W,int dp[][])
		{
			if(n==0 || W==0)
			{
				return 0;
			}

			else if(dp[n][W]!=-1)
			{
				return dp[n][W];
			}
			else if(weights[n-1]<=W)
			{
				int a = values[n-1]+knap(weights,values,n-1,W-weights[n-1],dp);
				int b = knap(weights,values,n-1,W,dp);

				dp[n][W]=Math.max(a,b);
				return Math.max(a,b);
			}
			else
			{
				dp[n][W]=knap(weights,values,n-1,W,dp);
				return knap(weights,values,n-1,W,dp);
			}
		}

	}

	//WAYS TO MAKE COIN CHANGE


	public class Solution {


		public static int countWaysToMakeChange(int coin[], int target){
			{
				int n = coin.length;
				int dp[][]=new int[n+1][target+1];

				for(int i =1;i<dp.length;i++)
				{
					dp[i][0]=1;
				}

				for(int i =1;i<dp.length;i++)
				{
					for(int j= 1;j<dp[0].length;j++)
					{
						if(coin[i-1]<=j)
						{
							dp[i][j]=dp[i-1][j]+dp[i][j-coin[i-1]];
						}
						else
						{
							dp[i][j]=dp[i-1][j];
						}
					}
				}

				return dp[n][target];
			}
		}
	}

	//MAXIMUM SQUARE MATRIX WITH ALL ZERO

	public static int findMaxSquareWithAllZeros(int[][] input){
		if(input.length==0)
			return 0;
		int r=input.length;
		int c=input[0].length;
		int[][] dp=new int[r][c];
		for(int i=0;i<r;i++){
			if(input[i][0]==0)
				dp[i][0]=1;
			else
				dp[i][0]=0;
		}
		for(int i=0;i<c;i++){
			if(input[0][i]==0)
				dp[0][i]=1;
			else
				dp[0][i]=0;
		}
		int max=Integer.MIN_VALUE;
		int ans;
		for(int i=1;i<r;i++){
			for(int j=1;j<c;j++){
				if(input[i][j]==1)
					dp[i][j]=0;
				else{
					ans=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
					dp[i][j]=ans;
					max=Math.max(max,ans);
				}
			}
		}
		return max;
	}
}

//SMALLEST SUPERSEQUENCE

public class Solution {

	public static int smallestSuperSequence(String str1, String str2) {

		int[][] dp = new int[str1.length()+1][str2.length()+1];
		
		for(int i=dp.length-2;i>=0;i--) {
			for(int j=dp[0].length-2;j>=0;j--) {
				
				char c1 = str1.charAt(i);
				char c2 = str2.charAt(j);
				
				if(c1==c2) {
					dp[i][j] = 1+dp[i+1][j+1];
				}
				else {
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		return str1.length()+str2.length()-dp[0][0];
	}
}


//MAGIC GRID

public class Solution{


    public static int getMinimumStrength(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n+1][m+1];

        for(int i=0;i<=n;++i){
            for(int j=0;j<=m;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[n][m-1] = 1;
        dp[n-1][m] = 1;

        for(int i=n-1;i>=0;--i){
            for(int j=m-1;j>=0;--j){

                int ans = Integer.min(dp[i+1][j],dp[i][j+1])-grid[i][j];
                dp[i][j] = (ans<=0)? 1 : ans;
            }
        }
        return dp[0][0];
    }
}

//

}
