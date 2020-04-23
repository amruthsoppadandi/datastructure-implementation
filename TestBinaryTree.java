package noote;

public class TestBinaryTree {

	public static void main(String[] args) {
		
		BinaryTreeImplementation bin = new BinaryTreeImplementation();
				
		bin.pushIntoTree(12);
		bin.pushIntoTree(155);
		bin.pushIntoTree(1);
		bin.pushIntoTree(189);
		bin.pushIntoTree(211);
		bin.pushIntoTree(-1);
		bin.pushIntoTree(4);
		bin.pushIntoTree(170);
		
		bin.print();
		
		System.out.println(bin.path(155));
		
		bin.parent=bin.deleteElements(155);
		
		bin.print();
		
		System.out.println("");
		
	}
	

	
	

}
