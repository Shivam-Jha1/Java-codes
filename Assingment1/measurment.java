package Assingment1;

public class measurment {
	
	int height;
	int weight;
	int depth;
	
	public measurment() {
		
		
	}
	
	public measurment(int height,int weight,int depth) {
		
		this.height = height;
		this.weight = weight;
		this.depth = depth;
	}
	
	public void print() {
		
		System.out.println();
		System.out.println("heigth of the object is " + this.height+" meter");
		System.out.println("weight of the object is " + this.weight+" kg");
		System.out.println("depth of the object is " + this.depth+" meter");
		System.out.println();
		
	}
}
