package Dynamic_Programming;
import java.util.*;
public class minNoOfChoclates {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Student marks");
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}

		int ans = minChocolates(arr);
		System.out.println(ans);
	}

	private static int minChocolates(int[] arr) {
		
		int n = arr.length;
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		
		//TRAVERSING RIGHTWAYS
		arr1[0] = 1;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				arr1[i] = arr1[i-1]+1;
			}
			else {
				arr1[i] = 1;
			}
		}
		
		//TRAVERSING LEFTWAYS
		arr2[n-1] = arr1[n-1];
		for(int i=n-2;i>=0;i--) {
			if(arr[i] > arr[i+1]) {
				arr2[i] = arr2[i+1]+1;
			}
			else {
				arr2[i] = 1;
			}
		}
		
		//MAKING PERFECT ARRAY
		for(int i=0;i<n;i++) {
			arr3[i] = Math.max(arr1[i], arr2[i]);
		}
		
		//TOTAL NO OF CHOCOLATES
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum+arr3[i];
		}
		
		return sum;
	}
}
