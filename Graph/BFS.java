package Graph;
import java.util.*;
public class BFS {
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
		bfs(matrix);
	}

	private static void bfs(int[][] matrix) {
		boolean[] visited = new boolean[matrix.length];
		for(int i=0;i<matrix.length;i++) {
			if(!visited[i]) {
				bfs(matrix,i,visited);
			}
			System.out.println();
		}
	}

	private static void bfs(int[][] matrix, int currentVertex,boolean[] visited) {


		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		visited[0] = true;

		while(!q.isEmpty()) {

			currentVertex = q.poll();
			System.out.print(currentVertex+" ");

			for(int i=0;i<matrix.length;i++) {
				if(matrix[currentVertex][i]==1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
}