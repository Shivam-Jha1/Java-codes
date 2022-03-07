import java.util.Scanner;

public class Ap {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		int x = S.nextInt();

		for(int n=1;n<=x;n++){

			if((3*n+2)%4==0){
				x=x+1;
				continue;
			}
			else{
				System.out.print(3*n+2+" ");
			}
		}
	/*	double a = 6.0/4.0;
		int b = 6/4;
		double c = a+b;
		System.out.println(c);*/
	}
}
