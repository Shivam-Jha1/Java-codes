package Sorting;

import java.util.Scanner;

public class Bubble_Sort {


	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}


	public static void bubbleSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = S.nextInt();
		}
		bubbleSort(arr);
		print(arr);
	}
}
