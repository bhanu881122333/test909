package testdatastructures;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	
	

	public static void main(String[] args) {
	List<Integer> list= new ArrayList<>();
	
	
	
	list.add(1);
	list.add(2);
	list.add(4);
	
	list.add(1, 22);
	
	
	System.out.println(list);
	List<Integer> list1= new ArrayList<>();
	
	
	
	list1.add(10);
	
	
	list1.addAll(list);
	
	
	System.out.println(list1);
		
	}

}
