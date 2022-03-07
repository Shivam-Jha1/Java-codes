package Graph;
import java.util.*;

public class Prims_Algorithm {

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
		prims(adjMatrix);
	}

	private static void prims(int adjMatrix[][]) {

		int n = adjMatrix.length;
		boolean visited[] = new boolean[n];
		int[] parent = new int[n];
		int[] weight = new int[n];

		parent[0] = -1;
		weight[0] = 0;

		for(int i=1;i<n;i++) {
			weight[i] = Integer.MAX_VALUE;
		}
		for(int i=0;i<n;i++) {
			int minvertex = findminvertex(visited,weight);
			visited[minvertex] = true;

			for(int j=0;j<n;j++) {
				if(adjMatrix[minvertex][j]!=0 && !visited[j]) {
					if(weight[j]>adjMatrix[minvertex][j]) {
						weight[j] = adjMatrix[minvertex][j];
						parent[j] = minvertex;
					}
				}
			}
		}
		for(int i=1;i<n;i++) {
			if(i<parent[i]) {
				System.out.println(i+" "+parent[i]+" "+weight[i]);
			}
			else {
				System.out.println(parent[i]+" "+i+" "+weight[i]);
			}
		}
	}

	private static int findminvertex(boolean[] visited, int[] weight) {

		int minvertex = -1;
		for(int i=0;i<visited.length;i++) {
			if(!visited[i] && (minvertex==-1 || weight[i]<weight[minvertex]))
			{
				minvertex = i;
			}		}
		return minvertex;
	}
}
