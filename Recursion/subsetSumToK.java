package Recursion;
import java.util.*;

public class subsetSumToK {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		int target = s.nextInt();
		printTargetSum(arr,0,"",0,target);
	}

	private static void printTargetSum(int[] arr, int index, String string, int sos, int target) {
		
		if(index==arr.length) {
			
			if(sos==target) {
				System.out.println(string);
			}
			return;
		}
		
		printTargetSum(arr, index+1, string+arr[index] +" ",sos+arr[index], target);
		printTargetSum(arr, index+1, string,sos, target);
		
	}
}
