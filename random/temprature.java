import java.util.Scanner;
public class temprature {


    public static void main(String[] args) {
        
        int S,E,W;

        Scanner A = new Scanner(System.in); 

        S = A.nextInt(); 
        E = A.nextInt(); 
        W = A.nextInt(); 

        
        for(int i=S;i<=E;i=i+W){
            int y;
            y=((i-32)*5)/9;
            System.out.println(i+" "+y);
           
        }


    }

}
