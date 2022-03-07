package random;

class Car1 {
    private int seats;
    private int speed;

    public Car1(int seats, int speed) {
    this.seats = seats;
    this.speed = speed;
    System.out.print("This Is Car ");
    }
}

class Audi extends Car1 {
    Audi(int x, int y) {
    super(x,y); 
    System.out.print("This Is Para Audi ");
    }
    void Audi() {
    System.out.print("This Is Def Audi");
    }
} 
