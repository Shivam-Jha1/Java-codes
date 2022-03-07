package Recursion;
import java.util.*;

public class Subsequences {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();

		String[] res = findSubsequences(str,0);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

	private static String[] findSubsequences(String str,int j) {

		if(str.length()==0) {

			String ans[] = {""};
			return ans;
		}
		String smallAns[] = findSubsequences(str.substring(1),j+1);
		String ans[] = new String[2*smallAns.length];
		for(int i=0;i<smallAns.length;i++) {
			ans[i] = smallAns[i];
		}

		for(int i=0;i<smallAns.length;i++) {
			ans[i+smallAns.length] =str.charAt(0) + ans[i];
		}
		return ans;
	}
}
