import java.util.Scanner;

public class binaryToDecimal {
	public static void main(String[] args) {
		
	
	Scanner S = new Scanner(System.in);
	int n = S.nextInt();
	int rem,x=1,decimal=0;
	while(n!=0) {
		
		rem = n%10;
		decimal = decimal + rem*x;
		n = n/10;
		x = x*2;
		
	}
	System.out.println(decimal);
		
		
	}
}
