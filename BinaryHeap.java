package noote;


public class BinaryHeap {
	
	int[] array;
	int sizeOfArray;
	
	public BinaryHeap(int size) {
		
		this.array = new int[size];
		this.sizeOfArray=0;
	}
	
	
	public void insertIntoArray(int element) {
		array[sizeOfArray]=element;
		
		//++;
		heapItToMinHeap(sizeOfArray);
		sizeOfArray++;
		
	}

	public void showUp() {
		for(int i=0;i<sizeOfArray;i++)
			//if(array[i]!=0)
				System.out.println(array[i]+"\t" + i);
	}

	
	  private void heapItToMinHeap(int index) {
	 
	  int parent = index/2;
	  if(index<1) {
		  return; 
		  }
	  if(array[parent]>array[index])
	  { 
		  int temp = array[index];
		  array[index]=array[parent];
		  array[parent]= temp; }
	  
	  heapItToMinHeap(parent);
	  
	  }
	 
	
	public int minValueInHeap() {
		heapItToMaxHeap(sizeOfArray);
		return array[0];
	}
	
	public int maxValueInHeap() {
		heapItToMaxHeap(sizeOfArray);
		return array[0];
	}
	
	public void deleteIntoHeap(int num) {
		//int index=0;
		for(int i=0 ; i<array.length;i++) {
			if(array[i]==num) {
				array[i]=0;
				for(int j=i;j<array.length-1;j++) {
					array[j]=array[j+1];
				}
				sizeOfArray--;
				break;
				}
			
		}
		for(int i=0 ; i<sizeOfArray;i++) {
		System.out.print(array[i]+" ");
		}
		System.out.println("in delete\n");
		
		heapItToMinHeap(sizeOfArray-1);
	}
	
	private void heapItToMaxHeap(int index) {
		 
		int parent = index/2;
		if(index<1) {
			return;
		}
		if(array[parent]<array[index]) {
			int temp = array[index];
			array[index]=array[parent];
			array[parent]= temp;
		}
		
		heapItToMaxHeap(parent);
			
	}
	
	
}
