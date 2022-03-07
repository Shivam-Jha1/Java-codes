
public class rotatearray {  
	Arindam Manna
	Last Message By Mentor

	public static void rotate(int[] arr, int d) {
		
		int X=5;
System.out.println(X);
		if(arr.length==1){
			System.out.println("h");
		}
		else{
			int n=arr.length;
			int a=d-1;
			int b=n-1;
			int c=b;
			for(int i=0;i<=(d)/2;i++){

				int temp = arr[i];
				arr[i]=arr[a];
				arr[a]=temp;
				a--;
			}
			for(int i=d;i<=(n+d)/2;i++){
				int temp = arr[i];
				arr[i]=arr[b];
				arr[b]=temp;
				b--;
			}
			for(int i=0;i<(n)/2;i++){

				int temp = arr[i];
				arr[i]=arr[c];
				arr[c]=temp;
				c--;
			}
		}

	}
}

