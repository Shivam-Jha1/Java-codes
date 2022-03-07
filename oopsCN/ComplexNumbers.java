package oopsCN;

public class ComplexNumbers {

    int real;
    int imaginary;
    int num;

    public int getnum() {
        return num;
    }

    public void setnum(int num) {
        this.num = num;
    }

    public ComplexNumbers(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
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
    public void plus(ComplexNumbers c2){
        this.real = this.real+c2.real;
        this.imaginary = this.imaginary+c2.imaginary;
    }
    public void multiply(ComplexNumbers c2) {
        int newReal = this.real*c2.real-this.imaginary*c2.imaginary;
        int newImaginary = ((this.real)*(c2.imaginary) + (this.imaginary)*(c2.real));   
        setreal(newReal);
        setimaginary(newImaginary);
    }
    public void print() {
        System.out.print(getreal()+" + "+"i"+getimaginary());
    }
}
