package practise;
import java.util.Scanner;
public class Array6 {
	
	public static void printarray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void araangearray(int[] arr) {
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
		for(int i=arr.length-1;i>=0;i=i-2) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;//S.nextInt();
		}
		printarray(arr);
		System.out.println();
		araangearray(arr);
	}
}