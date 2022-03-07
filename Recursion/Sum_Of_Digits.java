package Recursion;
import java.util.Scanner;
public class Sum_Of_Digits {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = S.nextInt();
		System.out.println(sum(n));
	}

	public static int sum(int input) {
		if(input/10==0){
            return input;
        }
        int x = sum(input%10);
        int ans = x+sum(input/10);
        return ans;
    }
}
