package Dynamic_Programming;
import java.util.*;
public class fibonacci_Series {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int dp[] = new int[n+1];
		for(int i=0;i<n+1;i++) {
			dp[i] = -1;
		}

		System.out.println(fibonacci(n, dp));
	}

	private static int fibonacci(int n,int[] dp) {

		if(n==0 || n==1) {
			return n;
		}
		int ans1,ans2;

		if(dp[n-1]==-1) {
			ans1 = fibonacci(n-1,dp);
			dp[n-1] = ans1;
		}
		else {
			ans1 = dp[n-1];
		}
		
		if(dp[n-2]==-1) {
			ans2 = fibonacci(n-2,dp);
			dp[n-2] = ans2;
		}
		else {
			ans2 = dp[n-2];
		}

		int ans = ans1+ans2;
		return ans;
	}
}
