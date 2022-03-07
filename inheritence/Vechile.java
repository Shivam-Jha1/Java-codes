package inheritence;

public class Vechile {
private int maxspeed;
String color;

public Vechile(int maxspeed) {
this.maxspeed = maxspeed;	
}

public int getmaxspeed() {
	return maxspeed;
}
public void setmaxspeed(int maxspeed) {
	this.maxspeed = maxspeed;
}

public void print() {
	System.out.println("maxspeed "+maxspeed +" "+"Color "+color);
}
}
