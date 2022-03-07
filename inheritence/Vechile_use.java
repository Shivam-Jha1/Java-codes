package inheritence;

public class Vechile_use {
	public static void main(String[] args) {
		Vechile v = new Vechile(120);
		v.color = "black";
	//	v.setmaxspeed(50);
		v.print();
		
		Car c = new Car(20);
		c.color = "red";
	//	c.setmaxspeed(200);
	//	c.numdoors = 2;
	//	c.printcolor();
		c.print();
		
		Bicycle b = new Bicycle(60);
		b.color = "blue";
	//	b.setmaxspeed(100);
		b.print();
	}
}
