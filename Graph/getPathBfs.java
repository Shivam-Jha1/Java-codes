package Graph;
import java.util.*;
public class getPathBfs {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of vertices");
		int v = s.nextInt();
		System.out.println("Enter no of edges");
		int e = s.nextInt();

		int[][] adjMatrxi = new int[v][v];
		System.out.println("Enter connected edges : ");
		for(int i=0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();

			adjMatrxi[v1][v2] = 1;
			adjMatrxi[v2][v1] = 1;
		}

		int sv = s.nextInt();
		int ev = s.nextInt();
		boolean[] visited = new boolean[v];

		ArrayList<Integer> path = getPath(adjMatrxi,sv,ev,visited);
		for(int i=0;i<path.size();i++) {
			System.out.println(path.get(i)+" ");
		}
	}

	private static ArrayList<Integer> getPath(int[][] adjMatrxi, int sv, int ev, boolean[] visited) {

		Queue<Integer> q = new LinkedList<>();
		visited[sv] = true;
		q.add(sv);
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(sv,-1);
		boolean pathfound = false;
		while(!q.isEmpty()) {
			int currentVertex = q.poll();
			for(int i=0;i<adjMatrxi.length;i++) {
				if(adjMatrxi[currentVertex][i]==1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
					map.put(i,currentVertex);
					if(i==ev) {
						pathfound = true;
						break;
					}
				}
			}
		}
		if(pathfound) {
			ArrayList<Integer> path = new ArrayList<>();
			int currentvertex = ev;
			while(currentvertex!=-1) {
			path.add(currentvertex);
			int parent = map.get(currentvertex);
			currentvertex = parent;
		}
			return path;
		}
		else {
			return null;
		}


		/*q.add(sv);
		while(!q.isEmpty()) {
			int currentVertex = q.poll();
			if(currentVertex==ev) {
				arr.add(ev);
				return true;
			}
			for(int i=0;i<adjMatrxi.length;i++) {
				if(adjMatrxi[currentVertex][i]==1 && !visited[i]) {
					visited[i] = true;
					arr.add(i);
				}
			}
		}
		 */	
		//return false;
	}

}
