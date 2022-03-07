package Backtracking;

import java.util.Scanner;

public class printAllMazePath {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the no of rows");
		int i = s.nextInt();
		System.out.println("Enter the no of columns");
		int j = s.nextInt();

		int arr[][] = new int[i][j];


		for(int m = 0;m<i;m++) {

			for(int n=0;n<j;n++) {
				System.out.println("Enter the element at "+m+"th row and "+n+"th column");
				arr[m][n] = s.nextInt();
			}
		}
		ratInMaze(arr);

	}

	private static void ratInMaze(int[][] maze) {

		int n = maze.length;
		int path[][] = new int[n][n];

		solve(maze,0,0,path);
	}

	private static void solve(int[][] maze, int i, int j, int[][] path) {

		int n = maze.length;
		//check i,j cell valid or not
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j]==1) {
			return;
		}
		//include cell in path
		path[i][j] = 1;

		//destination cell
		if(i == n-1 && j == n-1) {

			for(int r = 0;r<n;r++) {

				for(int c=0;c<n;c++) {
					System.out.print(path[r][c]+" ");
				}
				//System.out.println();
			}
			System.out.println();
			path[i][j] = 0;
			return;
		}

		//top
		solve(maze,i-1,j,path);



		//right
		solve(maze,i,j+1,path);

		//down
		solve(maze,i+1,j,path);

		//left
		solve(maze,i,j-1,path);
		path[i][j] = 0;
	}
}
