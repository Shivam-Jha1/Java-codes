import java.util.Scanner;

public class decimalToBinary {
	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		int n = S.nextInt();

		int i=1,rem,bin=0;
		while(n!=0) {

			rem = n%2;
			bin = bin + rem*i;
			i=i*10;
			n=n/2;
		}
		System.out.println(bin);
	}
}
