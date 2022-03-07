package practise;

import java.util.Scanner;

public class Rearrange {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = S.nextInt();
		}
		System.out.println();
		rearrange(arr);
	}

	public static void rearrange(int[] arr) {
		int n = arr.length;
		int a=0,b=0,c=0,d=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				a++;
			}
			else {
				b++;
			}
		}
		int[] newarr1 = new int[a];
		int[] newarr2 = new int[b];
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				newarr1[c] = arr[i];
				c++;
			}
			else {
				if(arr[i]<0) {
					newarr2[d]=arr[i];
					d++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		} 
	}
}

