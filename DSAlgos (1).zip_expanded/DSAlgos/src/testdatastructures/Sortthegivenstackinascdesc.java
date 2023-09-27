package testdatastructures;


import java.util.Stack;
public class Sortthegivenstackinascdesc {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Stack<Integer> stack1=new Stack<Integer>();
		
		
		stack1.push(34);
		
		
		stack1.push(3);
		
		stack1.push(31);
		
		stack1.push(98);
		
		stack1.push(14);
		System.out.println(stack1);
		
		System.out.println(SortStack(stack1));
	}

	private static Stack<Integer> SortStack(Stack<Integer> stack1) {
		
		
		
		Stack<Integer> tempstack= new Stack<>();
		
		
		
		while(!stack1.isEmpty()) {
			
			
			int temp =stack1.pop();
		
				while(!tempstack.isEmpty() && tempstack.peek()>temp) {
					
					
					int tt =tempstack.pop();
					
					stack1.push(tt);
				
					
				}
				tempstack.push(temp);
			
			
		}
	
	
		return tempstack;

	}
}
