package Graph;
import java.util.*;
public class Dijiktras_Algorithm {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		int adjMatrix[][] = new int[n][n];

		for(int i=0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();

			adjMatrix[v1][v2] = weight;
			adjMatrix[v2][v1] = weight;
		}
		dijiktras(adjMatrix);
	}

	private static void dijiktras(int[][] adjMatrix) {

		int n = adjMatrix.length;
		boolean visited[] = new boolean[n];
		int[] distance = new int[n];

		distance[0] = 0;
		for(int i=1;i<n;i++) {
			distance[i] = Integer.MAX_VALUE;
		}

		for(int i=0;i<n;i++) {
			int minVertex = findMinVertex(distance,visited,n);
			visited[minVertex] = true;

			for (int j = 0; j < n; j++) {
				if (adjMatrix[minVertex][j] != 0 && !visited[j]) {
					// distance of any node will be the current node’s distance + the
					// weight of the edge between them
					int dist = distance[minVertex] + adjMatrix[minVertex][j];
					if (dist < distance[j]) { // If required, then updated.
						distance[j] = dist;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(i +" "+ distance[i]);
		}
	}
	public static int findMinVertex (int[] distance, boolean[] visited, int n) {
		int minVertex = -1;
		for (int i = 0; i < n; i++) {
			if (!visited[i] && (minVertex== -1 || distance[i]<distance[minVertex])){
				minVertex = i;
			}
		}
		return minVertex;
	}
}

