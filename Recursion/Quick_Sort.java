package Recursion;
import java.util.Scanner;
public class Quick_Sort {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = S.nextInt();
		}
		quickSort(arr);
		print(arr);
	}
	public static void quickSort(int[] arr) {
		int p=0,i=0,j=arr.length-1;
		while(i<arr.length) {
			
			while(arr[p]>arr[i]) {
				i++;
			}
			
			while(arr[p]<arr[j]) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			else {
				int temp = arr[p];
				arr[p] = arr[j];
				arr[j] = temp;
				p++;
			}
		}
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}