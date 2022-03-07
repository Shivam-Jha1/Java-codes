package oOPS;



public class dynamicarray {
	 int data[];
	 int nextindex;
	public dynamicarray(){
		data=new int[5];
		nextindex=0;

	}
	public int size(){
		return nextindex;
	}
	public void add(int element ){
		if(nextindex==data.length){
			restructure();
			}

		data[nextindex]=element;
		nextindex++;
	}
	public boolean set(int index, int element){
		if(index>data.length){
			return false;
		}
		if(index<data.length){
			data[index]=element;
		}else{
			add(element);
		}
		return false;
	}
	public int getIndex(int index){
		
		if(index>nextindex) {
			return -1;
		}
		
		return data[index];
	}
	public void restructure(){

		int[] temp=data;
		data=new int[data.length*2];
		for(int i=0;i<temp.length;i++){
			data[i]=temp[i];

		}
	}
	public boolean isempty(){
		if(data.length==0){
			return true;
		}
		return  false;
	}
	public int removelast(){
		if(data.length==0){
			return -1;
		}
		int value= data[nextindex-1];
		nextindex--;
		return value;
	}

}