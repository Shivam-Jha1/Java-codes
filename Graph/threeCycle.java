package Graph;
import java.util.*;
public class threeCycle {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of vertices");
		int n = s.nextInt();
		System.out.println("Enter no of edges");
		int e = s.nextInt();
		int[][] matrix = new int[n][n];

		for(int i=0;i<e;i++) {
			System.out.println("Enter vertex V1");
			int v1 = s.nextInt();
			System.out.println("Enter vertex connected to V1");
			int v2 = s.nextInt();

			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("NO OF CYCLES ARE : ");
		int ans = dfs(matrix);
		System.out.println(ans/6);
	}

	private static int dfs(int[][] matrix) {

		int count = 0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]==1) {
					for(int k=0;k<matrix.length;k++) {
						if(matrix[j][k]==1 && k!=i) {
							if(matrix[i][k]==1) {
								count++;
							}
						}
					}
				}
			}			
		}
		return count;
	}
}