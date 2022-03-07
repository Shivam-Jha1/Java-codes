package oops1;

public class Employe{
	String name;
	private int id;
	private static int numstudents;

	public Employe(String name) {
		this.name = name;
		numstudents++;
		this.id = numstudents;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<=10) {
			return;
		}
		System.out.println("this"+" "+this);
		this.id = id;
	}
	public void print() {
		System.out.println(name+" "+id);
	}
}