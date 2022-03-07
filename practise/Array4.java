package practise;
 
import java.util.Scanner;
public class Array4{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int sum=0;
		int[] array = new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=S.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		for(int i=0;i<array.length;i++) {
			sum = sum+array[i]*array[i];
		}
		System.out.println(sum);
	}
}