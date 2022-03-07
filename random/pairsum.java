import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pairsum {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }
    
    public static int pairSum(int arr[], int x) {
    	
        int i,num=0;
        for(i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                
     //          if(arr[i]!=arr[j]){
                
                if(arr[i]+arr[j]==x && arr[i]!=arr[j]){
                    return num++;
                }
        //        }
                
            }
        }
        return num;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            int x = Integer.parseInt(br.readLine().trim());
            System.out.println(pairsum.pairSum(input, x));

            t -= 1;
        }
    }
}