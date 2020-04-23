package noote;

public class StackImplementation {
	 public class Node{
		 
		 Node up,down;
		 int data;
		 
		 Node(int data){
			 this.data=data;
		 }
	 }
	 
	 Node head, tail;
	 
	 public boolean isEmpty() {
		 boolean bool = false;
		 if(head== null && tail==null ) {
			 bool = true;
		 }
		 return bool;
	 }
	 public void pop() {
		 System.out.println("pop called");
		 if(head!=null && tail!=null ) {
			 
			 if(head.down!=null) {
			 
			 int temp = head.data;
			 head = head.down;
			 head.up=null;
			 System.out.println("Popped temp\t"+temp);
			 }
			 else {
				 int temp = head.data;
				 head.down=null;
				 head = null;
				 tail=null;
				 System.out.println("Popped temp\t"+temp);
			 }
			}
		 else {
			 System.out.println("Empty List");
		 }
	 }
	 
	 public void push(int data) {
		 
		 System.out.println("push called");
		 
		 Node nerf = new Node(data);
		 if(head==null && tail==null) {
			 head= tail=nerf;
			 tail.down= null;
			 head.up=null;
		 }
		 else {
			 nerf.up= null;
			 nerf.down=head;
			 head.up=nerf;
			 head=nerf;
			 
		 }
	 }
	 
	 public boolean update(int data, int rep_data) {
		 return false;
	 }
	 
	 public void printList() {

			if(head!=null && tail!=null) {
				Node current = head;
				System.out.println(head.data);
				while(current!=tail) {
					
					current= current.down;
					System.out.println(current.data + "\t");
				}
			}
			else {
				System.out.println("No Elements");
			}
			
			
		}
}
