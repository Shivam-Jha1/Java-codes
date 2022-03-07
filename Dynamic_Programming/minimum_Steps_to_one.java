package Dynamic_Programming;
import java.util.*;
public class minimum_Steps_to_one {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println(steps(n));

	}

	private static int steps(int n) {

		if(n==1) {
			return 0;
		}
		int ans1 = Integer.MAX_VALUE;
		if(n%3==0) {
			ans1 = steps(n/3);
		}
		int ans2 = Integer.MAX_VALUE;
		if(n%2==0) {
			ans2 = steps(n/2);
		}
		int ans3 = steps(n-1);

		int ans = Math.min(ans1, Math.min(ans2, ans3)) +1 ;

		return ans;
	}
}
