package practise;
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		int max=Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		int n = S.nextInt();
		int[] a= new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = S.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
			}
			
		}
		System.out.println("Largest"+" "+max);
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
			
		}
		System.out.println("Smallest"+" "+min);
		
	}
}
