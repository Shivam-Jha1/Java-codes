import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {


		Scanner S = new Scanner(System.in);
		int n = S.nextInt();

		if(n!=0) {
		
		int i=1;
		while(i<=n+1) {

			int j = 1;
			while(j<=1) {

				System.out.print("*");
				j++;
			}

			int k = 1;
			int a = 1;
			while(k<=i-1) {

				System.out.print(a);
				k++;
				a++;
			}

			int b = 1;
			int c;
			c = i-2;
			while(b<=i-2) {

				System.out.print(c);
				c--;
				b++;

			}


			int l = 2;

			while(l<=i&&l!=3) {


				System.out.print("*");

				l++;

			}

			System.out.println();
			i++;
		}

		int p = 1;
		while(p<=n) {

			int q = 1;
			while(q<=1) {
				System.out.print("*");
				q++;
			}

			int r = 1;
			int s = 1;
			while(r<=n-p) {

				System.out.print(s);
				s++;
				r++;
			}

			int t = 1;
			int v = n-p-1;
			while(t<=n-p-1) {


				System.out.print(v);
				v--;
				t++;

			}

			int D = 1;
			while(D<=n-p&&D<=1) {
				System.out.print("*");
				D++;
			}

			System.out.println();
			p++;
		}
		}
		else {
			System.out.println("*");
			System.out.println("*");
		}

	}

}


