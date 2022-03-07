package random;
import java.util.*;
public class otp {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long ans = helper(n);
		System.out.println(ans);
	}

	private static long helper(long n) {

		int count=0;
		long x=n;
		while(x!=0) {
			x=x/10;
			count++;
		}
		long[] arr = new long[count];
		for(int i=count-1;i>=0;i--) {
			arr[i] = n%10;
			n = n/10;
		}
		
		int j=1;
		int newCount = count/2;
		long[] newArr = new long[newCount];
		for(int i=0;i<newCount;i++) {
			if(j<arr.length)
			newArr[i] = arr[j];
			j=j+2;
		}
		for(int i=0;i<newArr.length;i++) {
			newArr[i] = newArr[i]*newArr[i];
		}
		long ans = 0;
		ans = newArr[0]*100+newArr[1];
		return ans;
	}
}
