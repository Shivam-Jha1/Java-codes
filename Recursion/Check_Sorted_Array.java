package Recursion;

import java.util.Scanner;

public class Check_Sorted_Array {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the value of number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		//print(arr);
		System.out.println(checkSort(arr,0));

	}

	public static boolean checkSort(int[] arr, int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		boolean x =  checkSort(arr,i+1);
		return x;
	}

	//	public static boolean checkSort(int[] arr) {
	//		int n = arr.length;
	//		if(n==1) {
	//			return true;
	//		}
	//		if(arr[0]>arr[1]) {
	//			return false;
	//		}
	//		int[] smallArray = new int[arr.length-1];
	//		for(int i=1;i<arr.length;i++) {
	//			smallArray[i-1] = arr[i];
	//		}
	//		boolean x = checkSort(smallArray);
	//		return x;
	//	}

/*	public static boolean checkSort(int[] arr,int si) {
		if(si == arr.length-1) {
			return true;
		}
		if(arr[si]>arr[si+1]) {
			return false;
		}
		return checkSort(arr,si+1);
	}*/

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
