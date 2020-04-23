package noote;

public class AVLBinaryTree{
	//Testing
	public static void main(String args[]) {
		
		AVLBinaryTreeImpl tree = new AVLBinaryTreeImpl();
		
		tree.root = tree.insert(tree.root, 10); 
		
		tree.root = tree.insert(tree.root, 5); 
		
		tree.root = tree.insert(tree.root, 7);
		
		tree.root = tree.insert(tree.root, 3); 
		
		tree.root = tree.insert(tree.root, 20); 
		
		tree.root = tree.insert(tree.root, 30); 
		
		tree.root = tree.insert(tree.root, 40); 
		
		tree.root = tree.insert(tree.root, 50); 
		
		tree.root = tree.insert(tree.root, 25); 
						
	}

}
