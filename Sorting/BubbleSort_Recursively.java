package Sorting;
import java.util.Scanner;
public class BubbleSort_Recursively {
	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}


	public static int bubbleSort(int[] arr,int n) {

		if(n==1) {
			return arr[0];
		}

		for(int j=1;j<arr.length;j++) {
			if(arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
		return bubbleSort(arr,n-1);
	}


	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = S.nextInt();
		}
		bubbleSort(arr,arr.length-1);
		print(arr);
	}
}

