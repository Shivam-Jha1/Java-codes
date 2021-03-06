package Dynamic_Programming;
import java.util.*;

public class editDistance {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter String 1 and String 2");
		String str1  = s.nextLine();
		String str2 = s.nextLine();

		steps(str1,str2);

	}

	private static void steps(String str1, String str2) {

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

		System.out.println(dp[dp.length-1][dp[0].length-1]);
	}
}
