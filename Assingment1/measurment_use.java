package Assingment1;

public class measurment_use {
	
	public static void main(String[] args) {
		
		measurment obj1 = new measurment(40, 60, 10);
		System.out.println("The value of object 1 are t");
		obj1.print();
		
		measurment obj2 = new measurment();
		obj2.height = 35;
		obj2.weight = 45;
		obj2.depth = 8;
		
		System.out.println("The value of object 2 are ");
		obj2.print();
	}
}
