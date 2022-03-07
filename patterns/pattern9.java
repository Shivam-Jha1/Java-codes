//import java.util.Scanner;
//
//public class pattern9 {
//
//	public static void main(String[] args) {
//
//		Scanner S = new Scanner(System.in);
//		int n = S.nextInt();
//         
//		for(int i=1;i<=n;i++) {
//
//			for(int j = 1;j<=n-i+1;j++) {
//				System.out.print("*");
//			}	
//
//			for(int k=1;k<=(2*i-1);k++) {
//				System.out.print(" ");
//			}
//
//			for(int r=1;r<=n-i+1;r++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for(int p =1;p<=n-1;p++) {
//
//			for(int q=1;q<=p+1;q++) {
//				System.out.print("*");
//			}
//
//			for(int s = 1;s<=(2*n)-(2*p)-1;s++) {
//				System.out.print(" ");
//			}
//			for(int t=1;t<=p+1;t++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}

//import java.util.Scanner;

public class pattern9 {
	
	public static void main(String[] args) {
	//	Scanner S = new Scanner(System.in);
		//int n = S.nextInt();
		int i,j,k=0;
		
	for(i=1;i<=9;i++) {
		
		if(i<=5) { k++;} else {  k--;} 
		
		for(j=1;j<=9;j++) {
			
			if(j<=6-k || j>=4+k) {
				
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
		}
		
		System.out.println();
	}
		
		
	}
	
}




