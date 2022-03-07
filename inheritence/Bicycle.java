package inheritence;

public class Bicycle extends Vechile{
	
	public Bicycle(int maxspeed) {
		super(maxspeed);
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("maxspeed "+getmaxspeed() +" "+"Color "+color);
	}
}
