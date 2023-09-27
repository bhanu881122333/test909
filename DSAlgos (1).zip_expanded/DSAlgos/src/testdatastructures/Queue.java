package testdatastructures;

public class Queue {
	
	int rear;
	int front;
	int[] a;
	int size;
	
	
	
	public Queue(int size) {
		
		
		rear=-1;
		
		this.size=size;
		
		this.a=new int[size];
	}
		
		public void enqueue(int x) {
			
			
			rear++;
			a[rear]=x;
			
			
			
		}
		
		
		public int dequeue() {
			
			
			int ele=a[0];
			for(int i=0;i<rear;i++) {
			
			a[i]=a[i+1];
			
		}
			rear--;
			return ele;
			
			
			
		
	}
		
		
		public void printqueue() {
			
			
			for(int i=0;i<=rear;i++) {
				
				System.out.println(a[i]);
			}
			
			
			
		}
		
		public static void main(String[] args) {
			
			
			
			
			Queue qd=new Queue(5);
			
			
			qd.enqueue(4);
			
			qd.enqueue(2);
			qd.dequeue();
qd.enqueue(9);
			
			qd.enqueue(3);
			qd.enqueue(12);
			qd.dequeue();
			qd.dequeue();

			
			qd.printqueue();
		}

}
