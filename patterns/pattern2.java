import java.util.Scanner;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}	
		
		/*	int n = S.nextInt();
		int a;
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=i){
				a=i;
				System.out.print(a-j+1);

				j++;
			}
			System.out.println();
			i++;
		}
	}
}*/


