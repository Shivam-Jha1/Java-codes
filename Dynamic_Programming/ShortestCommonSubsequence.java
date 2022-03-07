package Dynamic_Programming;
import java.util.*;

public class ShortestCommonSubsequence {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		
		int ans = lcs(str1,str2);
		System.out.println(ans);
		int myans = str1.length()+str2.length()-ans;
		
		System.out.println(myans);
		
		
	}

	private static int lcs(String str1, String str2) {

		
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
		return dp[0][0];
	}
}
