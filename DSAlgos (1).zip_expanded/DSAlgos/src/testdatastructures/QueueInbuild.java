package testdatastructures;

import java.util.*;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueInbuild {
	
	

	
	public static void main(String[] args) {
	
	
	Queue<Integer> queue =new ArrayDeque<Integer>() ;
	
	
	queue.add(15);
	
	queue.add(12);
	queue.add(9);
	queue.add(7);
	queue.add(20);
	queue.remove();
	
	queue.remove(20);
	System.out.println(queue);

	
	
	Stack<Integer> tempstack=new Stack<Integer>();
	
	while(!queue.isEmpty()) {
		
		tempstack.push(queue.remove());
		
	
		
		
	}

	
while(!tempstack.isEmpty()) {
	
	
	
	queue.add(tempstack.pop());
}

for(int ele1:queue) {
	
	
	System.out.println(ele1);


		
		
		
		
		
		
	}

	}
	}

