package random;
import java.util.*;
public class indices {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		int x = s.nextInt();
		
		allIndexes(arr,x);
	}

	private static void allIndexes(int[] arr, int x) {
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		
		int[] newArray = new int[count];
		newArray = allIndexes(arr,x,0,newArray,0);
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
	}

	private static int[] allIndexes(int[] arr, int x, int si, int[] newArray,int i) {
		
		if(si==arr.length) {
			return newArray;
		}
		
		if(arr[si]==x) {
			newArray[i] = si;
			allIndexes(arr,x,si+1,newArray,i+1);
		}
		else {
			allIndexes(arr,x,si+1,newArray,i);
		}
		return newArray;
	}
}
