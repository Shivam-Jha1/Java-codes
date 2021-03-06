package Dynamic_Programming;
import java.util.*;
public class printLCS {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();

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
		System.out.println(dp[dp.length-1][dp[0].length-1]);
	}
}
