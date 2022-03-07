package practise;
import java.util.Scanner;
public class Array10 {
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int[] arr = new int[n];
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = S.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		
		//int[] arr1=new int[arr.length-count];
		//int[] arr2=new int[count];
		int[] arr3=new int[arr.length];
		int s=0,j=0;
		while(s<arr.length) {
			if(arr[s]!=0) {
				arr3[j++]=arr[s++];
			}	
			else {
				s++;
			}
		}
		System.out.println();
		for(int k=0;k<arr.length;k++) {
			System.out.print(+arr3[k]+" ");
		}

	}
}
