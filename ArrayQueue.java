package noote;

public class ArrayQueue {
	int top =-1;
	int start =0;
	int[] array = new int[10];
	
	public ArrayQueue() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void push(int data) {
		if(top<array.length-1) {
			array[top+1]= data;
			top= top+1;
			System.out.println("Inserted\t"+ data +
					"\tat\t"+top);
		}
		else {
			System.out.println("Array is full");
		}
		
	}
	
	public void pop() {
		if(top!=-1) {
			int ar = array[0];
			for(int i=0;i<array.length-1;i++) {
				array[i]=array[i+1];
			}
			array[top]=Integer.MIN_VALUE;
			top--;
			System.out.println("Popped \t"+ ar +"\t top at" + top);
			for(int i =0; i<array.length;i++) {
				System.out.print(array[i] + "\t ");
			}
			System.out.println("");
			
			
		}
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else
			return false;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	
	
	
}
