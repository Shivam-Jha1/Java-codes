package Graph;
import java.io.IOException;
import java.util.*;
public class hasPath {
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();
		int[][] matrix = new int[v][v];
		for(int i=0;i<e;i++) {

			int v1 = s.nextInt();
			int v2 = s.nextInt();

			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}
		boolean[] visited = new boolean[v];
		Queue<Integer> q = new LinkedList<>();

		boolean ans = false;

		int c1 = s.nextInt();
		int c2 = s.nextInt();

		q.add(c1);

		while(!q.isEmpty()){
			int currentVertex = q.poll();
			if(c2 == currentVertex){
				ans = true;
			}
			for(int i=0;i<matrix.length;i++) {
				if(matrix[currentVertex][i]==1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
		System.out.println(ans);
	}
}

