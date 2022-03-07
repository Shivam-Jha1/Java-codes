package random;

import java.util.Scanner;

public class sort012 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		Sort(arr);

	}

	private static void Sort(int[] arr) {

		int n = arr.length;
		int i=0,j=n-1,k=0;

		while(k<=j){

			if(arr[k]==0){
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				i++;
				k++;
			}
			else if(arr[k]==1){
				k++;
			}
			else{
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;
				j--;
				//k++;
			}
		}

		for(int a=0;a<n;a++) {
			System.out.print(arr[a]+" ");
		}
	}
}