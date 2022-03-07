package Dynamic_Programming;
import java.util.*;
public class maximumSquareMatrix {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("row");
		int n = s.nextInt();
		System.out.println("col");
		int m = s.nextInt();
		
		int[][] input = new int[n][m];
		System.out.println("matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				input[i][j] = s.nextInt();
			}
		}
		System.out.println(findMaxSquareWithAllZeros(input));
		
	}
	
	public static int findMaxSquareWithAllZeros(int[][] input){

        int n = input.length;
        int m = input[0].length;
        if(n==0){
            return 0;
        }
        int dp[][] = new int[n+1][m+1];

        // fill DP WITH ALL 0
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){

                dp[i][j] = 0;
            }
        }
        //FILL DP ARRAY WITH REQUIRED NUMBERS
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){

                if(input[i-1][j-1]==1){
                    dp[i][j] = 0;
                }
                else{
                    if(input[i-1][j-1] == 0){
                        int temp = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                        if(temp == dp[i-1][j-1]){
                            dp[i][j] = 1+dp[i-1][j-1];
                        }
                        else{
                            dp[i][j] = 1;
                        }
                    }
                }
            }
        }
        // FIND MAXIMUM NUMBER IN DP ARRAY
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(max<dp[i][j]){
                    max = dp[i][j];
                }
            }
        }
        return max;
    }
}

