package random;
import java.util.*;
public class donuts {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int sum=0;
		Arrays.sort(arr);
		for(int i=0;i<n;i=i+4) {
			int j=i;

			//int j=i;
				if(arr[j]%4==0 || arr[j+1]%4==0) {
					sum = sum+arr[j+2];
				}
				else {
					sum = sum+arr[j+1];
				}
			
		}
		System.out.println(sum);
	}
}

