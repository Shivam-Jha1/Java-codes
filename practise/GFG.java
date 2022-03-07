package practise;
import java.util.Scanner;
public class GFG {

	public static int MissingNumber(int[] arr,int n) {


		//int x = 1;
		if(n==1){
			return 0;   
		}
		for(int i=0;i<n;i++){

			if(arr[i]!=i+1){
				return i+1;
			}
		}
		return -1;
	}
	
	// Your Code Here
	/*    int total_sum=0,given_sum=0;
		      total_sum = (n*(n+1)/2);
		      for(int i=0;i<n-1;i++){
		          given_sum+=arr[i];
		      }
		      int ans = total_sum-given_sum;
		      return ans;
		    }*/



	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		int n = S.nextInt();
		int[] arr = new int[n-1];

		for(int i=0;i<arr.length;i++) {
			arr[i] = S.nextInt();
		}

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(MissingNumber(arr,arr.length));

	}
}