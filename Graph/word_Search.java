package Graph;
import java.util.*;
public class word_Search {
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
		boolean ans = search(board,str,n,m);
		System.out.println(ans);
	}

	private static boolean search(Character[][] board, String str,int n,int m) {

		boolean visited[][] = new boolean[n][m];

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(str.charAt(0)==board[i][j] || searchWord(i,j,0,visited,str,board)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean searchWord(int i, int j, int index, boolean[][] visited, String word, Character[][] board) {

		if(index == word.length()) {
			return true;
		}
		if(i<0 || i>= board.length || j<0 || j>=board[0].length || word.charAt(index)!=board[i][j] || visited[i][j]) {
			return false;
		}
		visited[i][j] = true;

		if(
				searchWord(i+1, j, index+1, visited, word, board) ||
				searchWord(i-1, j, index+1, visited, word, board) ||
				searchWord(i, j+1, index+1, visited, word, board) ||
				searchWord(i, j-1, index+1, visited, word, board) ||
				searchWord(i-1, j+1, index+1, visited, word, board) ||
				searchWord(i-1, j-1, index+1, visited, word, board) ||
				searchWord(i+1, j-1, index+1, visited, word, board) ||
				searchWord(i+1, j+1, index+1, visited, word, board) ) {
			return true;
		}
		return false;
	}
}
