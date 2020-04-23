package noote;


public class BinaryTreeImplementation {
	
	Node parent;
	
	public void pushIntoTree(int data) {
		if(parent==null) {
			parent=new Node(data);
		}
		else
			addIntoRecursive(parent,data);
		}

	private void addIntoRecursive(Node parent2, int data) {
		
		if (parent2.getData()>data) {
			if(parent2.left==null)
				parent2.left=new Node(data);
			else
				addIntoRecursive(parent2.left,data);			
		}
		else {
			if(parent2.right==null)
				parent2.right= new Node(data);
			else
				addIntoRecursive(parent2.right,data);
		}
	}
	
	public void print() {
		printing(this.parent);
	}
	
	public void printing(Node parent) {
		if(parent==null) {
			return;
		}
	else {
		
			// preorder Transversal
		//		System.out.println(parent.data);
//				printing(parent.left);
//			  	printing(parent.right);
			 
			// In Order Transversal
			  printing(parent.left);
			  System.out.println(parent.data);
			  printing(parent.right);
			 
		// PostOrder Transveral
//		 printing(parent.left);
//		  printing(parent.right);
//		  System.out.println(parent.data);	
		
//Level Order Transversal
		//System.out.println(parent.data);
		
		
		}
	}
	
	StringBuilder path = new StringBuilder("");
	
	public String path(int data) {
		return PathSearching(parent, data);
	}
	
public String PathSearching(Node parent,int num) {
		
		if(parent.getData()==num) {
			path.append("Found.");
			//System.out.println("found");
			return path.toString();
			
		}
		else if(parent.getData()>num) {
			path.append("Left-->");
			//System.out.println("left");
			PathSearching(parent.left,num);
			
		}
		else if(parent.getData()<num) {
			path.append("Right-->");
			//System.out.println("right");
			PathSearching(parent.right,num);
		
		}
		return path.toString();
	}
	
	public Node deleteNode(int num) {
		Node nod =delete(parent, num);
		return nod;
	}
	
	public int findNoNodes(Node node) {
		int num;
		if(node.right!=null && node.left!=null)
			num=2;
		else if((node.right!=null && node.left==null)||(node.right==null && node.left!=null))
			num=1;
		else
			num=0;
		return num;
	}
	
	public int findMinValue(Node node) {
		int min=0;
		if(node.left==null && node.right==null) {
			min= node.data;
		}
		else
			if(node.left!=null)
				min=findMinValue(node.left);
				else
					findMinValue(node.right);
			
		return min;
	}
	
	public void replaceNodeWithNull(Node node) {
		if(node==null) {
			return;
			//node=null;
		}
		else 
			if(node.left!=null) {
			replaceNodeWithNull(node.left);
			//node=null;
			}
			else {
				replaceNodeWithNull(node.right);
			//node=null;
			}
	}
	
	public boolean isParentHasNodeToDelete(Node node,int num) {
		boolean given = false;
		int leaf= findNoNodes(node);
		if(leaf==2) {
			if(node.left.data==num || node.right.data==num)
				given=true;
		}
		else if(leaf==1) {
			if(node.left==null) {
				if(node.right.data==num)
					given= true;
			}
			else {
				if(node.left.data==num)
					given=true;
			}
		}
		else {
			given=false;
		}
		
		return given;
	}
	
	public boolean isLeft(Node node, int num) {
		boolean isLeft= false;
		int leaf = findNoNodes(node);
		if(leaf==2) {
		if(node.left.data==num)
			isLeft=true;
		}
		else if(leaf==1) {
			if(node.left!=null && node.left.data == num) {
				isLeft= true;
			}
		}
		return isLeft;
	}
	
	public Node delete(Node parent, int num) {
		
		
		if(parent==null) {
			return null;
		}
		else {
			int leafParent = findNoNodes(parent);
			if(isParentHasNodeToDelete(parent, num)) {
			int leafs = findNoNodes(parent);
			if(leafs==2) {
				boolean isLeft= isLeft(parent, num);
				if(isLeft) {
					parent.left.data = findMinValue(parent.left);
					//replaceNodeWithNull(parent.left);
					//this.parent=parent;
				}
				else {
					
					parent.right.data= findMinValue(parent.right);
					//replaceNodeWithNull(parent.right);
					//this.parent=parent;
				}
				
			}
			else if(leafs==1) {
				if(isLeft(parent, num)) {
					if(parent.left.left!=null) 
						parent.left= parent.left.left;
					else
						parent.left= parent.left.right;
				}
				else {
					if(parent.right.left!=null) 
						parent.right= parent.right.left;
					else
						parent.right= parent.right.right;
				}
				
			}
			else
				parent=null;
		}
		else {
			if(leafParent==2) {
				if(parent.left.data>num) {
					delete(parent.left, num);
					//this.parent=parent;
				}
				else
					delete(parent.right,num);
				//this.parent=parent;
			}
			
			else if( leafParent ==1) {
				if(parent.left !=null) {
					delete(parent.right,num);
					//this.parent=parent;
				}
				else {
				delete(parent.right, num);
				//this.parent=parent;
				}
			}
			else
				parent=null;
			
		}
			return parent;
		}
		//this.parent=parent;
	}
	
	public Node deleteElements(int num) {
		return deleteElement(this.parent, num);
	}
	private Node deleteElement(Node nodes, int num) {
		
		if(nodes==null) {
			return null;
		}
		else {
			if(nodes.data>num) {
				return deleteElement(nodes.left, num);
			}
			else if(nodes.data<num)
				return deleteElement(nodes.right, num);
			else {
				
				if(nodes.left==null) {
					return nodes.right;
				}
				else if(nodes.right==null) {
					return nodes.left;
				}
				
				nodes.data= minValue(nodes.right);
				
				nodes.right = deleteElement(nodes.right, nodes.data);
				
				
			}
			return nodes;
		}
	
	}
	
	 int minValue(Node root) 
	    { 
	        int minv = root.data; 
	        while (root.left != null) 
	        { 
	            minv = root.left.data; 
	            root = root.left; 
	        } 
	        return minv; 
	    }

	
	
}

	


