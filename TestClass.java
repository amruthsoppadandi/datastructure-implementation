package noote;

public class TestClass {
	
	public static void main(String[] args) {
	
		
		  DoubleLinkedList list = new DoubleLinkedList(); list.insertNode(5);
		  list.insertNode(13); list.insertNode(11); list.insertNode(4);
		  list.insertNode(555); list.insertInBetween(56, 2); list.insertInBetween(58,
		  2); list.printList(); System.out.println("----------");
		  list.removeAtPosition(2); list.printList();
		 //----------------------------------
		  SingleLinkedList repo = new SingleLinkedList(); repo.LinearInsert(12);
		  repo.LinearInsert(122); repo.LinearInsert(142); repo.LinearInsert(125);
		  repo.LinearInsert(112); repo.LinearInsert(889); repo.printList();
		  System.out.println("-------------"); repo.LinearInsert(8890);
		  repo.printList();; System.out.println("-------------");
		  repo.insertAtPosition(8,0); repo.printList(); //repo.pop();
		  System.out.println("----------"); repo.deleteAtPosition(0); repo.printList();;
		  System.out.println("----12-"); repo.deleteAll(); repo.printList();
		//---------------------------------
		StackImplementation list2 = new StackImplementation();
		 for(int i= 0 ; i<6 ; i++)
			 list2.push(3*i);
		 System.out.println("======ends======");
		 //list.pop();
		 list2.printList();
		 
		 for (int i=0;i<5;i++) {
			 if(i%2==0) {
				 list2.push(6*i);
			 }
			 else 
				 list2.pop();
		System.out.println("=========");
		
		
		list.printList();
		 }
		 
		 for(int i =0; i<10; i++) {
				list2.pop();
			}
	}
}
