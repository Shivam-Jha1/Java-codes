package oOPS;

public class Fraction {
	 int numerator=2;
	 int denominator=4;

	public Fraction(int numerator,int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
		Simplify();
	}	
	public Fraction(){
	
	}



	public void setnumerator(int num) {
		this.numerator = num;
		Simplify();
	}
	public int getnumerator() {
		return numerator;
	}
	public void setdenominator(int num) {
		if(num == 0) {
			return;
		}
		else {
			this.denominator=num;
		}
		Simplify();
	}
	public int getdenominator() {
		return denominator;
	}

	/*public void add(Fraction f2) {
		this.numerator = this.numerator*f2.denominator+this.denominator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		Simplify();
		print();
	}*/

	public static Fraction add(Fraction f1,Fraction f2) {
		int newNum = f1.numerator*f2.denominator+f1.denominator*f2.numerator;
		int newDeno = f1.denominator*f2.denominator;
		Fraction f3 = new Fraction(newNum,newDeno);
		return f3;
	}

	private void Simplify(){
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);

		for(int i=2;i<=smaller;i++) {
			if(numerator%i==0 && denominator%i==0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}

	public void increment() {
		numerator  = numerator+denominator;
		Simplify();
	}

	public void print() {
		System.out.println(numerator+"/"+denominator);
	}
}


