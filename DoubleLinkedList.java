package noote;


public class DoubleLinkedList {
	
	class Node {
		int data;
		Node previous,next;
		
		public Node(int data) {
			this.data= data;
		}
		
		public int getData() {
			return data;
		}
		
	}
	
	Node head, tail=null;
	
	public void insertInBetween(int new_Node ,int position) {
		if(head!=null && tail!=null) {
			Node current=head;
			Node newbie = new Node(new_Node);
			//Node temp=null;
			for(int i=0; i<position-1;i++) {
				 current = current.next;
			}
			current.next.previous=newbie;
			newbie.next=current.next;
			newbie.previous=current;
			current.next=newbie;
			
		}
	}
	
	public void insertNode(int new_Node) {
		// New Node which is null before
		if(head == null) {
			head = new Node(new_Node);
			tail= new Node(new_Node);
			head.previous=null;
			//head.next=null;
			tail.next=null;
		}

		else {
			Node newbie = new Node(new_Node);
			Node current= head;
			while(current.next!=null) {
				current= current.next;
			}
			current.next=newbie;
			newbie.previous=current;
			tail= newbie;
			tail.next= null;
		}
		
	}
	// removes node at position
	public void removeAtPosition(int position) {
		Node current = head;
		for(int i=0;i<position;i++) {
			current= current.next;
		}
		current.next.previous= current.previous;
		current.previous.next=current.next;
		current.next=null;
		current.previous=null;
		
	}
	
	public void printList() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.data + "\t");
			current= current.next;
		}
	}
	
	

}
