package oOPS;

public class dynamicarrayuse {
	public static void main(String[] args) {

		dynamicarray d1=new dynamicarray();
		for(int i=0; i < 100;i++)
		{ 
			d1.add(i + 10);
		}
		System.out.println(d1.getIndex(3));
		System.out.println(d1.getIndex(4));

	//	d1.set(4,10);
		//d1.getIndex(0);
		//        System.out.println(d1.size());
		//        System.out.println(d1.set(0,67));
		//       System.out.println(d1.getIndex(0));
	}
}