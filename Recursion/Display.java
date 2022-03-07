package Recursion;

public class Display {
	public static void main(String[] args) {
		//int x = 5;
		display(5);
	}

	private static void display(int x) {
		if(x==0) {
			return;
		}
		display(x-1);
		System.out.println(x);


	}
}

