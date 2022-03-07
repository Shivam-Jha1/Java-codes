import java.util.Scanner;
//import java.io.*;

class loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Double sum=0.0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int p=0;p<n;p++){
                sum=sum+Math.pow(2,n);
                System.out.println(sum+" ");
            }
        }
       // in.close();

        
    }
}