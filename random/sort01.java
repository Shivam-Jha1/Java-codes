import java.util.Scanner;

public class sort01 {
	
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int[] arr = new int[n];
//		for(int i = 0;i<n;i++) {
//			arr[i] = S.nextInt();
//			System.out.print(arr[i]+" ");
//		}
		printarray(arr,n);
	}
}
