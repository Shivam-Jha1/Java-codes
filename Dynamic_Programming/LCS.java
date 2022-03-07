package Dynamic_Programming;

import java.util.*;
public class LCS {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();

		//optimize approach
		int dp[][] = new int[str1.length()+1][str2.length()+1];
		for(int i=dp.length-2;i>=0;i--) {
			for(int j=dp[0].length-2;j>=0;j--) {
				char c1 = str1.charAt(i);
				char c2 = str2.charAt(j);
				
				if(c1==c2) {
					dp[i][j] = 1+dp[i+1][j+1];
				}
				else {
					dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
				}
			}
		}
		System.out.println(dp[0][0]);
	}
}
	/*int ans = lcs(str1,str2,0,0);
	System.out.println(ans);

}

private static int lcs(String str1, String str2, int i, int j) {

	int myAns;

	if(i==str1.length() || j == str2.length()) {
		return 0;
	}

	if(str1.charAt(i)==str2.charAt(j)) {

		int smallAns = lcs(str1,str2,i+1,j+1);
		myAns = 1+smallAns;

	}
	else {
		int ans1 = lcs(str1,str2,i+1,j);
		int ans2 = lcs(str1,str2,i,j+1);

		myAns = Math.max(ans1, ans2);
	}

	return myAns;
}
}*/
