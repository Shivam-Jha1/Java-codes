import java.util.Scanner;

public class pattern5 {


	public static void main(String[] args) {
        
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();

		int i=1;
		while(i<=n){
			int j=1;
			while(j<=i){
              
                char ch =(char)('A'-1-i+j+n);
				System.out.print(ch);
               
				 j++;
			}
			System.out.println();
			i++;

		}
	
	}

}