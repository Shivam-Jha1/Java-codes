package Recursion;
import java.util.*;


public class towerOfHanoi {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n, 'a', 'b', 'c');
	}

	private static void towerOfHanoi(int disks, char source, char helper, char destination) {
		
		if(disks==0) {
			return;
		}
		if(disks==1) {
			System.out.println(source+" "+destination);
			return;
		}
		towerOfHanoi(disks-1, source, destination, helper);
		System.out.println(source+" "+destination);
		towerOfHanoi(disks-1, helper, source ,destination);
	}
}
