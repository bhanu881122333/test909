package testdatastructures;

import java.util.Stack;

public class Findminimumelementinstack {
	
	static Stack<Integer> mainstack=new Stack();
	static Stack<Integer> temp=new Stack();
	
	
	
	public static void main(String[] args) {
		
		
		
		custompush(12);
		custompush(6);
		custompop();
		custompush(20);
		custompush(17);
		custompush(3);
		
		System.out.println(temp.peek()  +"  min element of the stack  ");
	}



	private static void custompush(int i) {
		
		
		
		
		mainstack.push(i);
		
		if(temp.isEmpty()) {
			
			
			
			temp.push(i);
		}
		else if(temp.peek()>i)
			
			
			temp.push(i);
			
			
	}
			
	
		

	private static void custompop() {
		
		
		
		int item = mainstack.peek();
		
		
		mainstack.pop();
		
		
		
		if(temp.peek()==item) {
			
			temp.pop();
			
		}
		
		
		
		
	
		
		
		
		
		
			
		
					
					
				
				
				
				
			
			
			
		
		
			
			
		
				
				
				
				
			
		
	}
	
	

}
