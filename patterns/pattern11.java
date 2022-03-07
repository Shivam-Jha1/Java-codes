import java.util.Scanner;

public class pattern11 {

    public static void main(String []args) {

        Scanner S = new Scanner(System.in);
        int n = S.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i-1;j++){
                System.out.print("0");
            }
            for(int k=1;k<=1;k++){
                System.out.print("*");
            }
            for(int l=1;l<=n-i;l++){
                System.out.print("0");
            }
            for(int m=1;m<=1;m++){
                System.out.print("*");
            }
            for(int o=1;o<=n-i;o++){
                System.out.print("0");
            }
            for(int p=1;p<=1;p++){
                System.out.print("*");
            }
            for(int q=1;q<=i-1;q++){
                System.out.print("0");
            }
            System.out.println();
        }
    }	
}
