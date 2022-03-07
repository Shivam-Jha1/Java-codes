import java.util.Scanner;
public class pattern4 {

	public static void main(String[] args) {

		/*	Scanner S = new Scanner(System.in);
		int n = S.nextInt();

		for(int i=1;i<=n;i++) {

			for(int j=1;j<=1;j++) {
				A
				BC
				CDE
				DEFG
				EFGHI
			}
		}*/
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;

		while(i<=n){
			int j=1; 

			while(j<=(2*i+1)){
				int num=1;int sum=0; 

				while(num<=i){
					System.out.print(num);
					sum=sum+num;
					int add=1;

					while(add<=i-1){
						System.out.print("+");
						int equal=2;
						if(equal==2*i){
							System.out.print("=");
						}

						j++;
						num++;
					}
				}
				System.out.print(sum);
				System.out.println();
				i++;
			}
		}
	}
}































/*int i=1;
while(i<=n){
	int j=1;
	while(j<=i){

		char ch =(char)('A'+i-2+j);
		System.out.print(ch);

		j++;
	}
	System.out.println();
	i++;

}
}
}*/