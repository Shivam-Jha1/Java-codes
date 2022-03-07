package Recursion;
import java.util.Scanner;
public class Count_Zeroes {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = S.nextInt();
		System.out.println(countZeroes(n));
	}

	private static int countZeroes(int input) {
		int count=0;
	
	        if(input<0){
	            return 0;
	        }

	        int a = countZeroes(input/10);
	        if(a%10==0)
	        { 
	            count++;
	        }
	        return count;
     /*   if(n ==0){
            count++;
        }
		for(int i=1;n>=10;i++) {
			int a = n%10;
			if(a==0) {
				count++;
			}
			n=n/10;
		}
		return count;*/
	}
}
