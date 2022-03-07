import java.util.*;

public class twoDarray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the no of rows");
		int i = s.nextInt();
		System.out.println("Enter the no of columns");
		int j = s.nextInt();

		int arr[][] = new int[i][j];

		for (int m = 0; m < i; m++) {

			for (int n = 0; n < j; n++) {
				System.out.println("Enter the element at " + m + "th row and " + n + "th column");
				arr[m][n] = s.nextInt();
			}
		}

		for (int m = 0; m < i; m++) {

			for (int n = 0; n < j; n++) {
				System.out.print(arr[m][n] + " ");
			}
			System.out.println();
		}
		rowWiseSum(arr);
		findLargest(arr);
		totSum(arr); // only boundries and diagonal elements sum
		wavePrint(arr);

	}

	private static void wavePrint(int[][] arr) {

		int n = arr.length;
		for (int j = 0; j < n; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < n; i++) {
					System.out.print(arr[i][j] + " ");
				}
			}

			else {
				for (int i = n - 1; i >= 0; i--) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}

	private static void totSum(int[][] arr) {

		int n = arr.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					sum = sum + arr[i][j];
				} else if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("Sum is " + sum);
	}

	private static void findLargest(int[][] arr) {

		int rSum = 0;
		int cSum = 0;
		int mr = 0;
		int mc = 0;
		int mrs = 0;
		int mcs = 0;

		for (int i = 0; i < arr.length; i++) {
			rSum = 0;
			for (int j = 0; j < arr[0].length; j++) {

				rSum = rSum + arr[i][j];
			}
			if (rSum > mrs) {
				mrs = rSum;
				mr = i;
			}
		}

		for (int i = 0; i < arr[0].length; i++) {
			cSum = 0;
			for (int j = 0; j < arr.length; j++) {

				cSum = cSum + arr[j][i];
			}
			if (cSum > mcs) {
				mcs = cSum;
				mc = i;
			}
		}

		if (mrs > mcs) {

			System.out.println("Row " + mr + " " + mrs);
		} else {
			System.out.println("Column " + mc + " " + mcs);
		}

	}

	private static void rowWiseSum(int[][] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[0].length; j++) {

				sum = sum + arr[i][j];
			}
			System.out.println("Row Wise sum is " + sum);
		}
	}
}
