import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int i=1;
		while(i<=n){
			
			int j=1;
			while(j<=(n-i+1)) {
			System.out.print("*");
			j++;
		}
		System.out.println();
		i++;
	}
	
}
}
