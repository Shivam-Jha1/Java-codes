package Graph;
import java.util.*;
public class connecting_Dots {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		int n = s.nextInt();
		int m = s.nextInt();
		Character[][] board = new Character[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				board[i][j] = s.next().charAt(0);
			}
		}
		boolean visited[] = new boolean[n];
		boolean ans = conDots(board,n,m,visited);
		System.out.println(ans);
	}

	private static boolean conDots(Character[][] board, int n, int m,boolean[] visited) {
		
		Queue<Integer> q = new LinkedList<>();
		
		return false;
	}
}
