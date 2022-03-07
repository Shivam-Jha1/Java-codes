import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		
		
		for(int i = 1;i<=2*n-1;i=i+2) {
			
			for(int j = 1;j<=1;j++) {
				System.out.print("*");
				for(int k = 1;k<=1;k++) {
					System.out.println();
				}
			}
			System.out.println();
		}


	}

}
