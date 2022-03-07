package random;
import java.util.*;
public class StockSpan {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		stockspan(arr);
	}

	private static void stockspan(int[] array) {

		int[] arr = new int[array.length];
		arr[0] = 1;
		
		for(int i=1;i<array.length;i++) {

			if(array[i]<array[i-1]) {
				arr[i] = 1;
			}
			else {

				int count=1;
				for(int j=i ; j>=0 && array[j-1]<array[i] ; j--) {
					count++;
				}
				arr[i] = count;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

