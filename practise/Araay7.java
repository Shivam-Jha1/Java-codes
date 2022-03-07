//*************************************************************BINARY SEARCH*********************************************************************************************//
package practise;
import java.util.Scanner;
public class Araay7 {
	public static int binarySearch(int[] arr,int x) {

		int left=0,right=arr.length-1,mid;
		while(left<=right) {
			mid=(left+right)/2;
			if(x==arr[mid]) {
				return mid;
			}
			else if(x>arr[mid]) {
				left=mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int x = S.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = S.nextInt();
		}

		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(binarySearch(arr,x));

	}
}
