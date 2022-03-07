package Assingment1;

public class investment {
	public static void main(String[] args) {

		double intial_price = 14000;
		
		double price_1st_year = intial_price+ (intial_price*40/100);

		double price_2nd_year = price_1st_year-1500;

		double price_3rd_year = price_2nd_year+ (price_2nd_year*12/100);
		
		System.out.println("AFTER 3RD YEAR AMOUNT WILL BE  $"+price_3rd_year);
	}
}
