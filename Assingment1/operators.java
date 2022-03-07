package Assingment1;

import java.util.Scanner;

public class operators {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = s.nextInt();
		System.out.println("Enter number 2");
		int num2 = s.nextInt();

		int divide = 0,remainder=0;
		
		if(num2!=0) {
			divide = num1/num2;
			remainder = num1%num2;
		}
		
		System.out.println(num1+"/"+num2 + "\t=\t" + divide +"\tand "+num1+"%" +num2+"\t=\t"+ remainder);
	}
}