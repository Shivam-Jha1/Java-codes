package random;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int[][] ans = oneTwoThreePattern(5);
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
	}
	public static int[][]  oneTwoThreePattern(int n) {
		
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				 arr[i][j] = j+2;
			}
			//System.out.println();
		}
		return arr;
	}
}

















//		String str = s.nextLine();
//		
//		String ans = removeConsecutiveDuplicates(str,0,1);
//		System.out.println(ans);
//	}
//    public static String removeConsecutiveDuplicates(String s,int count,int i) {
//        // Write your code here
//
//        if(s.length()<=1)
//            return s;
//        
//        count=0,i=1;
//        while(s.charAt(0)==s.charAt(i)){
//            count++;
//            i++;
//        }
//        return s.charAt(0)+removeConsecutiveDuplicates(s.substring(count+1),count,i);
//            
//    }
//}
	/*	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				maze[i][j] = s.nextInt();
			}
		}
		int ans = minPath(maze);
		System.out.println(ans);
	}

	private static int minPath(int[][] maze) {

		int n = maze.length;
		int[][] dp = new int[n][n];
		
		for(int i=n-1;i>=0;i--) {
			
			for(int j=n-1;j>=0;j--) {
				
				if(i==n-1 && j==n-1) {
					
					dp[i][j] = maze[i][j];
				}
				else if(i==n-1) {
					
					dp[i][j] = dp[i][j+1] + maze[i][j];
				}
				else if(j==n-1) {
					
					dp[i][j] = dp[i+1][j] + maze[i][j];
				}
				else {
					
					dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + maze[i][j];
				}
			}
		}
		return dp[0][0];
	}    
}*/
