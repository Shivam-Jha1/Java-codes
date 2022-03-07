package practise;
import java.util.Scanner;
public class Array8 {
	
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int min = arr[i],minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int n = S.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = S.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
