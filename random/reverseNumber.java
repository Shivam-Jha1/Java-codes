import java.util.Scanner;

public class reverseNumber {
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int remainder,rev=0;
		while (n != 0) {
	        remainder = n % 10;
	        rev = rev * 10 + remainder;
	        n /= 10;
	    }
	    System.out.println(rev);

	}


}
