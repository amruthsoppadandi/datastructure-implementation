package noote;


public class Main {
	
	
	public static void main(String[] args) {	
		
		TestClass.main(null);
		
		ArrayQueue arr = new ArrayQueue();
		for(int i =0; i<15;i++) {
			arr.push(i*10);
		}
		for(int i=0 ; i<arr.getArray().length;i++) {
			System.out.println(arr.getArray()[i]+"\t" + i);
		}
		
		for(int i= 0 ; i<5; i++) {
			arr.pop();
		}
		
		for(int i=0 ; i<arr.getArray().length;i++) {
			System.out.println(arr.getArray()[i]+"\t" + i);
		}
		
	
	for(int i =10; i<15;i++) {
		arr.push(i*9);
	}
	
	for(int i=0 ; i<arr.getArray().length;i++) {
		System.out.println(arr.getArray()[i]+"\t" + i);
	}
	}
}
