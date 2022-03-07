import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {

		//int x,i;

		Scanner s= new Scanner(System.in);
		
		/*	x = S.nextInt();

		for(i=2;i<x;i++) {

			if(x%i==0) {
				System.out.print(i+" ");
			}

		} */

		int t = s.nextInt();

		while(t>0){

			int[] arr = new int[3];
			for(int i=0;i<arr.length;i++) {
				arr[i] = s.nextInt();
			}
			boolean ans = res(arr,false);
			System.out.println(ans);
			t--;
		}
	}	
	public static boolean res(int[] n,boolean res) {
	
		for(int i=0;i<n.length;i++) {
			if(n[i]==7) {
				res = true;
			}
		}
		
	return res;
		}
	}




