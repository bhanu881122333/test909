package testdatastructures;
import java.util.Stack;
public class Stack1 {
	
	
	public static void main(String[] args) {
		
		
		
Stack<Integer> s =new  Stack<Integer>();


s.push(34);
s.push(3);
s.push(31);
s.push(98);
s.push(14);
System.out.println(s);
//insert 5 at 2 index
movevalueinmiddle(2,100,s);



	}

	public  static void movevalueinmiddle(int index, int value,Stack<Integer> s) {
		
		
		
	Stack<Integer> temp =new Stack<Integer>();
	
	
	for(int i=1;i<s.size()-index+1;i++) {
		
		
		
		int item=s.peek();
		
		temp.push(item);
		
		s.pop();
		
	}
	s.push(value);

	while(!temp.empty()) {
		
		
		int item= temp.peek();
		
		
		s.push(item);
		
		
		temp.pop();
		

		
		
		
			
			
		}
		
		
	
	System.out.println(s);
		
		
		
		
		
		
		
	
	
	
	
	
	
			
		
		
		
		
		
		
		
		
	}
	}

		

	


