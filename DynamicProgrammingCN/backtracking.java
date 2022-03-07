package DynamicProgrammingCN;

public class backtracking {

	// RAT IN A MAZE
	

public class Solution {

    public static boolean ratInAMaze(int maze[][]){

        int n = maze.length;
        int path[][] = new int[n][n];

        return solve(maze,0,0,path);
    }

    public static boolean solve(int maze[][],int i,int j,int path[][]){
        
        int n = maze.length;

        if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
            return false;
        }

        if(i==n-1 && j == n-1){
            return true;
        }

        path[i][j] = 1;

        if(solve(maze,i-1,j,path)){
            return true;
        }

        if(solve(maze,i,j+1,path)){
            return true;
        }

        if(solve(maze,i+1,j,path)){
            return true;
        }

        if(solve(maze,i,j-1,path)){
            return true;
        }

        return false;   
    }
}

//RAT IN MAZE ALL PATHS

import java.io.*;
import java.util.*;

public class Solution{  
    public static void printpath(int maze[][],int x,int y,int n,int path[][]){
       
        if(x<0 || x>=n || y<0 || y>=n || maze[x][y]==0 || path[x][y]==1)
            return;
         path[x][y]=1;
        if(x==n-1 && y==n-1){
             
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(path[i][j]+" ");
                }
                
            }
            System.out.println();
            path[x][y]=0;
        return;
        }
        
       
        printpath(maze,x-1,y,n,path);
        printpath(maze,x,y+1,n,path);
        printpath(maze,x,y-1,n,path);
        printpath(maze,x+1,y,n,path);
        path[x][y]=0;
        
    }
   
    static void ratInAMaze(int maze[][], int n)
    {
        int path[][]=new int[n][n];
         printpath(maze,0,0,n,path);
        // Write your code here

    }
}

//N QUEENS


public class Solution {


    public static void placeNQueens(int n){

        int[][] board = new int[n][n];
        solveNQueens(board, 0,n); 

    }

    static void solveNQueens(int board[][], int row, int N) 
    { 
        /* base case: If all queens are placed 
    then return true */
        if (row == N) 
        { 
            printSolution(board,N); 
            return;
        } 

        /* Consider this column and try placing 
    this queen in all rows one by one */
        for (int i = 0; i < N; i++) 
        { 
            /* Check if queen can be placed on 
        board[row][i] */
            if ( isSafe(board, row, i, N) ) 
            { 
                /* Place this queen in board[row][i] */
                board[row][i] = 1; 

                // Make result true if any placement 
                // is possible 
                solveNQueens(board, row + 1, N); 

                /* If placing queen in board[row][i] 
            doesn't lead to a solution, then backtrack and
            remove queen from board[row][i] */
                board[row][i] = 0; 
            } 
        } 

    }

    static boolean isSafe(int board[][], int row, int col, int N) 
    { 
        int i, j; 

        //Check if all values in the given column and rows from 0 to row-1 are 0
        for (i=0;i<row;i++)
        {
            if (board[i][col]==1)
                return false;
        }

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
            if (board[i][j] == 1) 
                return false;

        //Check upper right diagonal
        for (i=row,j=col;i>=0 && j<N;i--,j++)
            if (board[i][j] == 1) 
                return false;

        return true; 
    } 

    static void printSolution(int board[][], int N) 
    { 
        for (int i = 0; i < N; i++) 
        { 
            for (int j = 0; j < N; j++) 
                System.out.print(board[i][j]+" ");  
        } 
        System.out.println(); 
    } 
}
	
}
