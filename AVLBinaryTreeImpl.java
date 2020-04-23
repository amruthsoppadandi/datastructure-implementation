package noote;

class AVLBinaryTreeImpl {
	
	class Node{
		
		int data,height;
		
		Node Left, right;
		
		Node(int data){
		
			this.data=data;
			
			this.height=1;
		
		}
		
	}
		
		Node root;
		
		public int heightOfNode(Node node) {
			if(node == null)
				return 0;
			else
				return node.height;
		}
		
		public int max(int a , int b) {
			return (a>b)? a:b;
		}
		
		public Node rightRotation(Node nodes) {
			Node x1=null;
			try {
			x1 = nodes.Left;
			Node x2 = x1.right;
			x1.right=nodes;
			nodes.Left=x2;
			//nodes=x1.right;
			

			if(x1.Left!=null && x1.right!=null) {
				x1.height = 1+ max(x1.Left.height,x1.right.height);
				}
				else if(x1.right!=null) {
					x1.height = 1+ x1.right.height;
				}
				else if(x1.Left!=null) {
					x1.height= 1+ x1.Left.height;
				}
			
			}
			catch(NullPointerException e) {
				System.out.println("Null at Right Rotation" );
			}
			catch(Exception e ){
				e.printStackTrace();
			}
			return x1;
		}
		
		public Node leftRotation(Node nod) {
			Node x1=null;
			try{
				x1=nod.right;
			Node x2=x1.Left;
			nod.right=x2;
			x1.Left=nod;
			//nod=x1.Left;
			//nod.Left=x2;
			if(x1.Left!=null && x1.right!=null) {
				x1.height = 1+ max(x1.Left.height,x1.right.height);
				}
				else if(x1.right!=null) {
					x1.height = 1+ x1.right.height;
				}
				else if(x1.Left!=null) {
					x1.height= 1+ x1.Left.height;
				}
			}
			catch(Exception e) {
				System.out.println("Exception " +e.getClass().getSimpleName());
			}
			//x1.height=max(x1.Left.height,x2.right.height)+1;
			return x1;
		}
		
		public int balanceOfNodes(Node node) {
			if(node==null) {
				return -1;
			}
			else {
				return heightOfNode(node.Left)-heightOfNode(node.right);
			}
		}
		
		public Node insertInto(int num) {
			return insert(this.root,num);
		}
		
		Node insert(Node parent, int num) {
			if(parent==null) {
				return new Node(num);
			}
			else {
				if(num<parent.data) {
					parent.Left=insert(parent.Left, num);
				}
				else if(num>parent.data) {
					parent.right=insert(parent.right,num);
				}
				if(parent.Left!=null && parent.right!=null) {
				parent.height = 1+ max(parent.Left.height,parent.right.height);
				}
				else if(parent.right!=null) {
					parent.height = 1+ parent.right.height;
				}
				else if(parent.Left!=null) {
					parent.height= 1+ parent.Left.height;
				}
				//LL Rotation;
				int balance = balanceOfNodes(parent);
				if(balance==0) {
					return parent;
				}
				if(balance>1 && num < parent.Left.data) {
					return rightRotation(parent);
				}
				else if(balance<-1 && num < parent.right.data) {
					return leftRotation(parent);
							
				}
				else if (balance>1 && num > parent.Left.data){
				parent.Left = leftRotation(parent.Left);
				return rightRotation(parent);
				}
				else if(balance<-1 && num> parent.right.data) {
					parent.right= rightRotation(parent.right);
					return leftRotation(parent);
				}
				
			}
			return parent;
		}
		
		Node minNodeAndDelete(Node not ,int num) {
			if(not==null) {
				return null;
			}
			else if(num<not.data)
				return minNodeAndDelete(not.Left, num);
			else if(num>not.data)
				return minNodeAndDelete(not.right, num);
			else {
				Node nott = not;
				not=null;
				return nott;
			}
		}
		
		Node delete(Node parent, int num) {
			if(parent==null) {
				return null;
			}
			else {
				if(num<parent.data) {
					parent.Left=insert(parent.Left, num);
				}
				else if(num>parent.data) {
					parent.right=insert(parent.right,num);
				}
				else {
//					parent=null;
				if(parent.Left!=null && parent.right!=null) {
					parent.data = minNodeAndDelete(parent.right, num).data;					
				parent.height =  max(parent.Left.height,parent.right.height) -1;
				}
				else if(parent.right!=null) {
					Node x1= parent.right;
					parent=x1;
					parent.height =  parent.right.height-1;
				}
				else if(parent.Left!=null) {
					Node x1 = parent.Left;
					parent=x1;
					parent.height= parent.Left.height-1;
				}
				else {
					parent=null;
				}
				//LL Rotation;
				int balance = balanceOfNodes(parent);
				if(balance==0) {
					return parent;
				}
				if(balance>1 && num < parent.Left.data) {
					return rightRotation(parent);
				}
				else if(balance<-1 && num < parent.right.data) {
					return leftRotation(parent);
							
				}
				else if (balance>1 && num > parent.Left.data){
				parent.Left = leftRotation(parent.Left);
				return rightRotation(parent);
				}
				else if(balance<-1 && num> parent.right.data) {
					parent.right= rightRotation(parent.right);
					return leftRotation(parent);
				}
			}
				
			}
			return parent;
		}
		
	}
