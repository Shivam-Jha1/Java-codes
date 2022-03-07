import java.util.Scanner;
import java.util.Scanner;
public class pattern3 {
	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		int n = S.nextInt();

		for(int i=1;i<=n;i++) {

			for(int j=i;j>=1;j--) {
				char ch =(char)('A'+i-1);
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}	

//int a;
/*	int i=1;
		while(i<=n){
			int j=1;
			while(j<=i){
               // a=i;
                char ch =(char)('A'+i-1);
				System.out.print(ch);

				 j++;
			}
			System.out.println();
			i++;

		}

	}

}*/

