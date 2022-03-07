package practise;
import java.util.Scanner;

public class Array {

	public static void printarray(int[] a ) {
		//System.out.println("The original array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void reversearray(int[] a) {
		
		int l=a.length-1;
		for(int i=0,j=l;i<a.length/2;i++,j--) {
			int temp=0;
			temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			//printarray(a);
			}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
		}
		
	

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);

		System.out.println("Enter the length of array");
		int n = S.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++) {
		//System.out.println("Enter the element at"+" "+i+" "+"index");
			a[i]=S.nextInt();
		}
		printarray(a);
		System.out.println("The reversed array is:");
		reversearray(a);
	}
}
