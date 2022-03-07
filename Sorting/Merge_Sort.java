package Sorting;
import java.util.Scanner;
public class Merge_Sort {




	private static void mergeSort(int[] arr, int l, int r) {

		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}


	private static void merge(int[] arr, int l, int mid, int r) {

		int n1 = mid-l+1;
		int n2 = r-mid;

		int[] a = new int[n1];
		int [] b = new int[n2];

		for(int i=0;i<n1;i++) {
			a[i] = arr[l+i];
		}
		for(int j = 0;j<n2;j++) {
			b[j] = arr[mid+1+j];
		}

		
		int i=0,j=0,k=l;
		while(i<n1&&j<n2) {
			if(a[i]<=b[j]) {
				arr[k] = a[i];
				i++;
				k++;
			}
			else {
				arr[k] = b[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr[k] = a[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = b[j];
			j++;
			k++;
		}
	}


	private static void print(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = S.nextInt();
		System.out.println();
		int[] arr = new int[n];
		System.out.println("Enter Elements of array");
		for(int i=0;i<n;i++) {
			arr[i] = S.nextInt();
		}
	//	print(arr);
		Merge_Sort ab = new Merge_Sort();
		ab.mergeSort(arr,0,n-1);
		System.out.println();
		print(arr);
	}

}
