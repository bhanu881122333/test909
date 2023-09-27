package testdatastructures;
import java.util.Stack;

public class Queueimplementationthroughstack {
	
	
	static Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	
	
	public void EnQueue(int x) {
		
		stack1.push(x);
		
	
	}
	

	public int Dequeue() {
		
		while(!stack1.empty()){
				
          stack2.push(stack1.pop());		
		
		
	
		}
		
		int ele =stack2.pop();
		
		
		while(!stack2.isEmpty()) {
			
			stack1.push(stack2.pop());
			
			
			
			
			
			
		}
		return ele;
		
	}
	public static void main(String[] args) {
		
		Queueimplementationthroughstack queue=new Queueimplementationthroughstack();
		
		queue.EnQueue(4);
		queue.EnQueue(5);
		queue.EnQueue(7);
		queue.Dequeue();
		
		System.out.println(stack1);
		
	}

}
