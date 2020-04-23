package noote;

public class TestHeap {
	public static void main(String[] args) {
		
		BinaryHeap bin = new BinaryHeap(20);
		bin.insertIntoArray(15);
		bin.insertIntoArray(100);
		bin.insertIntoArray(185);
		bin.insertIntoArray(-2);
		bin.insertIntoArray(1);
		bin.insertIntoArray(150);
		bin.insertIntoArray(200);
		bin.insertIntoArray(215);
		bin.insertIntoArray(-341);
		bin.insertIntoArray(1501);
		bin.insertIntoArray(150000);
		bin.insertIntoArray(-20);
		bin.insertIntoArray(123);
		bin.insertIntoArray(158);
		bin.showUp();
		for(int i=0;i<bin.sizeOfArray;i++) {
			System.out.print(bin.array[i]+" ");
		}
		System.out.println("");
		
		bin.deleteIntoHeap(15);
		System.out.println("==============TEST================");
		for(int i=0;i<bin.sizeOfArray;i++) {
			System.out.print(bin.array[i]+" ");
		}
		System.out.println("");
		System.out.println("===============TEST===============");
		bin.showUp();
	}
	
}
