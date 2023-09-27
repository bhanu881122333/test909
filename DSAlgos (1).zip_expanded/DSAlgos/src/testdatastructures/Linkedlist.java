package testdatastructures;

public class Linkedlist {
	
	
	class Node{
		
		
		int val;
		
		
		Node next;
		
		
		public Node(int val) {
			
			this.val=val;
			
		}
	}
	
	static Node head=null;
	Node tail=null;
	public void addnodeatend(int val) {
		
		Node newnode=new Node(val);
		
		
		if(head==null) {
			
			head=newnode;
			
			tail=newnode;
			
			
			
			
		}
		else {
		tail.next=newnode;
		newnode.next=null;
		tail=newnode;
		
		}
	}
	
	
	public void addnodeatbegining(int val) {
		Node newnode=new Node(val);

		if(head==null) {
			
			
			head=newnode;
			tail=newnode;
		}else {
			
			newnode.next=head;
			
			head=newnode;
			
		}
		
		
	}
		
	public void printlinkedlist(Node headNode) {
		
		
		Node current =headNode;
		
		while(current!=null) {
			
			
			System.out.println(current.val);
			current=current.next;
			
			
			
		}
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		Linkedlist exe=new Linkedlist();
		
		exe.addnodeatend(10);
		exe.addnodeatend(20);
		exe.addnodeatend(30);
		exe.addnodeatend(40);
		
		exe.addnodeatbegining(5);
exe.printlinkedlist(head);


		
		
	}

}
