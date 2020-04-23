package noote;

public class CircleDoubleList {
	
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

	public void addNode(int data) {
		Node neet = new Node(data);
		if(head==null && tail==null) {
			head = neet;
			tail= neet;
			tail.next= head;
			head.previous=tail;
			//tail.previous= head;
		}
		
		else {
			tail.next=neet;
			neet.previous=tail;
			tail= neet;
			tail.next=head;
			head.previous=tail;
			
		}
	}
	
	public void addNode(int data, int position) {
		Node nerd = new Node(data);
		if(position==0) {
			nerd.next=head;
			nerd.previous=tail;
			head.previous=nerd;
			head=nerd;
		}
		else {
			Node current = head;
			for(int i=0;i<position-1;i++) {
				current= current.next;
			}
			nerd.next=current.next;
			nerd.previous=current;
			current.next.previous=nerd;
			current.next=nerd;
		}
	}
	
	public void printList() {

		if(head!=null && tail!=null) {
			Node current = head;
			System.out.println(current.previous.data + "\t"
					+ current.data+"\t"+
					current.next.data);
			while(current!=tail) {
				current= current.next;
				System.out.println(current.previous.data + "\t"
						+ current.data+"\t"+
						current.next.data);
			}
		}
		else {
			System.out.println("No Elements");
		}
		
		
	}
}
