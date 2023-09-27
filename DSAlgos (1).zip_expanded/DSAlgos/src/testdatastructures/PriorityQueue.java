package testdatastructures;


import java.util.Queue;
public class PriorityQueue {
	
	
	public static void main(String[] args) {
		
		
		
		Queue<Integer> queue =new java.util.PriorityQueue<Integer>();
		
		
		queue.add(15);

		queue.add(12);
		
		queue.add(9);
		
		
		queue.add(7);
		queue.add(20);	
		
		
		for(int ele:queue) {
			
			System.out.println(ele);
		}
			}

		

	}


