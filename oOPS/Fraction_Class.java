package oOPS;

public class Fraction_Class {
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		f1.numerator();
		f1.print();
	//	f1.increment();
	//	f1.print();
		Fraction f2 = new Fraction(4,8);
		f2.print();
		//f1.add(f2);
		
		Fraction f3 = Fraction.add(f1,f2);
		f3.print();
	}
}

/*
 public class ComplexNumbers {

    private int real;
    private int imaginary;
     private int num;
     
     	public int getnum() {
		return num;
	}

	public void setnum(int num) {
		this.num = num;
	}

    public ComplexNumbers(int real,int imaginary) {
        this.real=real;
        this.imaginary=imaginary;
    }

    public void setreal(int num) {
        this.real = num;
    }
    public int getreal() {
        return real;
    }
    public void setimaginary(int num) {
        if(num == 0) {
            return;
        }
        else {
            this.imaginary=num;
        }
    }
    public int getimaginary() {
        return imaginary;
    }


    public void plus(ComplexNumbers c2) {
        this.real = this.real+c2.real;
        this.imaginary = this.imaginary+c2.imaginary;
    }

    public void multiply(ComplexNumbers c2) {
        this.real = this.real*c2.real-this.imaginary*c2.imaginary;
        setreal(real);
        this.imaginary = ((this.real)*(c2.imaginary) + (this.imaginary)*(c2.real));    
        setimaginary(imaginary);
        
    }

    public void print() {
        System.out.print(real+" + "+"i"+imaginary);
    }
}
 */
