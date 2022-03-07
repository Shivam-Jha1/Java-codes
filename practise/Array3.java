package practise;
import java.util.Scanner;
public class Array3 {
	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);

		int n = S.nextInt();
		int a=0,b=0;
		int[] arr = new int[n];
		//Taking input
		for(int i=0;i<arr.length;i++) {
			arr[i] = S.nextInt();
		}
		//print array	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//new array size
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
		System.out.println();
		System.out.println("Even numbers are");
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i]+" ");
		}
		System.out.println();
		System.out.println("Odd numbers are");
		for(int i=0;i<q.length;i++) {
			System.out.print(q[i]+" ");
		}

	}
}
