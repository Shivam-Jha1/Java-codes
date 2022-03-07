package Dynamic_Programming;
import java.util.*;
public class climbingStairs {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int[] dp = new int[n+1];
		int ans = Stairs(arr,dp,n);
	}

	private static int Stairs(int[] arr, int[] dp, int n) {
		
		
		
		return dp[0];
	}
}
