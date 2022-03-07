package inheritence;

public class Car extends Vechile{
int numdoors;
String color;
public Car(int numdoors) {
	super(800);
	this.numdoors = numdoors;
}
public void print() {
	//super.print();
	System.out.println("Car "+"maxspeed "+getmaxspeed() +" Color "+super.color+" numdoors "+numdoors);
}
public void printcolor() {
	System.out.println(color+" "+super.color);
}
}
