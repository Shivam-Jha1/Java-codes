//package oops1;

//import oops1.Employe;

class test {
	int id;
	String name;
	
	public void setId(int num) {
		this.id = num;
	}
	public int getId(){
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void print() { 
		System.out.println(id+" "+name);
	}
}

public class Employee1{
	public static void main(String[] args) {
		test ravi = new test();
		ravi.setId(5);
		ravi.setName("abc");
		System.out.println(ravi.getId());
		System.out.println(ravi.getName());


	}
}

