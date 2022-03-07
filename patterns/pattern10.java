import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		
//	Scanner S = new Scanner(System.in);{
//		int n = S.nextInt();
//		//int sum=0;
//		int add=0;
//		for(int i=1;i<=n-1;i++) {
//			
//			for(int j=1;j<=i;j++) {
//			int sum = 0;	
//			sum = sum+j;
//		//	add = sum; 
//				System.out.print(sum + "+");
//			}
//			System.out.println();
//		}
//		
//	}
		
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
            sum=0;
            for(int j=1;j<=i;j++){
                sum=sum+j;
                System.out.print(j);
                if(j<i)
                    System.out.print("+");
            }
            System.out.println("=" + sum);
        }
    }

		
	}

