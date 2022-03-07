package Graph;
import java.util.*;
public class getPathDFS {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();
		int[][] matrix = new int[v][v];
		boolean[] visited = new boolean[v];

		for(int i=0;i<e;i++){
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}
		int sv = s.nextInt();
		int ev = s.nextInt();
		getPath(matrix,visited,sv,ev);
	}

	private static void getPath(int[][] matrix,boolean[] visited,int sv,int ev) {

		ArrayList<Integer> arr = new ArrayList<>();
		//boolean b= 
				path(matrix,sv,ev,arr,visited);
		return;

	}

	private static boolean path(int[][] matrix, int sv, int ev,ArrayList<Integer> arr,boolean[] visited) {

		if(sv==ev) {
			System.out.print(sv+" ");
			return true;
		}
		visited[sv] = true;
		for(int i=0;i<matrix.length;i++) {
			if(matrix[sv][i]==1 && visited[i] == false) {
				// RECURSSION CALL
				if(path(matrix,i,ev,arr,visited)){
					System.out.print(sv+" ");
					return true;
				}
			}
		}
		return false;
	}
}

/*public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of vertices");
		int v = s.nextInt();
		System.out.println("Enter no of edges");
		int e = s.nextInt();
		int[][] matrix = new int[v][v];
		boolean[] visited = new boolean[v];

		System.out.println("Enter graph");
		for(int i=0;i<e;i++){
			int v1 = s.nextInt();
			int v2 = s.nextInt();

			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}

		getPath(matrix,visited);
	}

	private static void getPath(int[][] matrix,boolean[] visited) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start vertex");
		int sv = sc.nextInt();
		System.out.println("Enter end vertex");
		int ev = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		path(matrix,sv,ev,arr,visited);

	}

	private static void path(int[][] matrix, int sv, int ev,ArrayList<Integer> arr,boolean[] visited) {

		if(sv==ev) {
			arr.add(ev);
		}
		visited[sv] = true;

		for(int i=0;i<matrix.length;i++) {
			if(matrix[sv][i]==1 && visited[i] == false) {
				arr.add(i);
				 System.out.print(arr.get(i)+" ");
				path(matrix,i,ev,arr,visited);
			}
		}
	//	System.out.println("Path is : ");
     //   for(int i=0;i<arr.size();i++){
       //     System.out.print(arr.get(i)+" ");
       // }
	}
}*/