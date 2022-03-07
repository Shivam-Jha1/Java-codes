package practise;
import java.util.Scanner;
public class Array5 {
	public static void printarray(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void arrangearray(int[] arr) {
		int a=0,b=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				a=a+1;
			}
			else {
				b=b+1;
			}
		}
		//new array
		int[] p = new int[a];
		int[] q = new int[b];
		int x=0,y=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {

				p[x++]=arr[i];
				//		System.out.print(p[x]+" ");
			}
			else {
				q[y++]=arr[i];
				//	System.out.print(q[y]+" ");
			}
		}
		for(int i=0;i<q.length;i++) {
			System.out.print(q[i]+" ");
		}

		for(int i=0;i<p.length;i++) {
			//System.out.print(p[i]+" ");
		}
		reversearray(p);

	}
	public static void reversearray(int[] p) {
		int l=p.length-1;
		for(int i=0,j=l;i<p.length/2;i++,j--) {
			int temp=0;
			temp = p[i];
			p[i]=p[j];
			p[j]=temp;
			//printarray(a);
		}
		for(int k=0;k<p.length;k++) {
			System.out.print(p[k]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		System.out.println("Original array is:");
		printarray(arr);
		System.out.println("Rearranged array is:");
		arrangearray(arr);

	}
}
