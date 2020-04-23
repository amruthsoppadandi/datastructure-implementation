package noote;



public class SingleLinkedList {

	public class Node{
		Node next;
		int data;
		public Node head;
		
		public Node(int data) {
			super();
			this.data= data;
		}
	}
	
	Node head, tail = null;
	
	public void LinearInsert(int node) {
		Node nodd = new Node(node);
		if(head==null && tail==null) {
			tail=head = nodd;
			tail.next=head;		
		}
		else {
			/*
			 * Node current = head; while(current!=null) { current= current.next; }
			 * current.next=nodd; tail=nodd;
			 */
			tail.next=nodd;
			tail=nodd;
			// Single Linked List
			//tail.next=null;
			tail.next=head;
			
		}
	}
	
	public void printList() {
//		Node current = head;
//		while(current!=null) {
//			System.out.println(current.data + "\t");
//			current= current.next;
//		}
		//int count=0;
		if(head!=null && tail!=null) {
			Node current = head;
			System.out.println(head.data);
			while(current!=tail) {
				
				//System.out.println(current.data + "\t");
				//count++;
				current= current.next;
				System.out.println(current.data + "\t");
			}
		}
		else {
			System.out.println("No Elements");
		}
		
		
	}
	
	public void pop() {
		if(head!=null && tail!=null ) {
			int count =0;
			Node current= head;
			while(current!=tail) {
				current= current.next;
				count++;
			}
			current= head;
			for (int i=0;i<count-1;i++) {
				current= current.next;
			}
			System.out.println(current.data);
			tail= current;
			current.next=null;
			//For SingleLInkedList
			// tail.next= null;
			tail.next=head;
			
		}
	}
	
	public void insertAtPosition(int data,int position) {
		if (position==0) {
			Node temp = head;
			head= new Node(data);
			head.next=temp;
			tail.next=head;
		}
		else  {
			Node newe = new Node(data);
			Node current= head;
			for(int i=0; i<position-1;i++) {
				current= current.next;
			}
			Node temp= current.next;
			current.next=newe;
			newe.next= temp;
		}
	}
	
	public void deleteAtPosition(int position) {
		if(position==0) {
			head= head.next;
			tail.next=head;
		}
		else if (head!=null && tail!=null) {
			Node current= head;
			for(int i=0; i<position-1;i++) {
				current= current.next;
			}
			current.next= current.next.next;

		}
	}
	
	public void deleteAll() {
		head=null;
		tail.next=null;
		tail=null;
//		head.next=null;
//		tail.next=null;
	}
	
}
