import java.util.Scanner; 

public class sum_evenodd {
	
	public static void main(String[] args) {
        
         int sum=0;
         int rem;
         int mus=0;
         int x;
        Scanner s = new Scanner(System.in);
         x = s.nextInt();
  
        
        while(x!=0){
            rem = x%10;
            if(rem%2==0){
                sum=sum+rem;
            }
            else{
                mus=mus+rem;
            }
            x=x/10;
        }
        System.out.println(sum +" "+ mus);
        
	}
}
