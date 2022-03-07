import java.util.Scanner;

public class sumOrProduct {
	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int c = S.nextInt();
		int sum=0;
		int mul=1;

		for(int i=1;i<=n;i++) {

			sum = sum+i;

			mul=mul*i;
		}
		if(c==1) {
			System.out.println(sum);
		}
		else if(c==2){
			System.out.println(mul);
		}
		else {
			System.out.println("-1");
		}
		System.out.println();

	}
}
