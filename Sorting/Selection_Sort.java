package Sorting;

import java.util.Scanner;

public class Selection_Sort {


	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void selectionSort(int[] arr) {

		int n = arr.length;

		for(int i = 0 ; i< n-1 ; i++) {

			int minIndex = i;

			for(int j = i+1 ; j < n ; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = S.nextInt();
		}
		selectionSort(arr);
		print(arr);
	}
}


