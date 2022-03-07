import java.util.Scanner;

public class fibonaci {

    
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        
   // int n = 9;
    System.out.println(fib(n));
    }
}
