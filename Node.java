package noote;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	Node left,right;
	
	int data;
	
	public Node() {
		super();
	}

	public Node(int data) {
		super();
		this.data=data;
	}

	public Node getLeft() {
		return left;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public void pushing(Node into) {
		
	if (this.getData()>into.getData()) {
				if(this.left==null)
					this.left=into;
				else
					this.left.pushing(into);			
			}
			else {
				if(this.right==null)
					this.right=into;
				else
					this.right.pushing(into);
			}
		}

	static List<String> path = new ArrayList<>();
	
	public List<String> PathSearching(int num) {
		
		if(this.getData()==num) {
			path.add("Found.");
			//System.out.println("found");
			return path;
			
		}
		else if(this.getData()>num) {
			path.add("Left-->");
			//System.out.println("left");
			this.left.PathSearching(num);
			
		}
		else {
			path.add("Right-->");
			//System.out.println("right");
			this.right.PathSearching(num);
		
		}
		return path;
	}
	
	public void print(Node rec) {
		//preorder
		
		if(rec==null) {
			return;
		}
		else {
			System.out.println(rec.getData());
			print(rec.left);
			print(rec.right);
		}

	}
}
