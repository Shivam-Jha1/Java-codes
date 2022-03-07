package practise;

import java.util.Scanner;

public class Plus_One {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		int n = S.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i] = S.nextInt();
		}

		plus_one(arr,arr.length);

	}

	private static void plus_one(int[] arr, int N) {
		int a = arr.length;
		int x=0;
		for(int i=0;i<arr.length;i++){
			x = x*10 + arr[i];
		}
		int number = x+1;
		String temp = Integer.toString(number);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
		    numbers[i] = temp.charAt(i) - '0';
		}
		for(int i=0;i<a;i++) {
			System.out.print(numbers[i]+" ");
		}
	}
}

