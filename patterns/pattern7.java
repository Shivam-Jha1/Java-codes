import java.util.Scanner;

public class pattern7 {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		
		int i=1;
		
		while(i<=(n+1)/2) {
			
			int j = 1;
			
			while(j<=(n+1)/2 - i) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			
			while(k<=i) {
				System.out.print("*");
				k++;
			}
			
			int l = 1;
			while(l<=i-1) {
				System.out.print("*");
				l++;
			}			
			
			System.out.println();
			i++;
		}
		
		int a = 1;
		while(a<=n/2) {
			
			int b = 1;
			while(b<=a) {
				System.out.print(" ");
				b++;
			}
			
			int c = 1;
			while(c<=(n/2)-a) {
				System.out.print("*");
				c++;
			}
			
			int d = 1;
			while(d<=(n/2)-a+1) {
				System.out.print("*");
				d++;
			}
			System.out.println();
			a++;
		}
	
		
	}

}
