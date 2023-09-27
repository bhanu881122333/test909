package testdatastructures;

import java.util.Arrays;
import java.util.Collections;

public class Array_sort_string {
	
	
	
	public static void f1() {
		
		
	
	
	String  fruites[] = {"orange","grape","apple","lemon","banana"};
	
	
	Arrays.sort(fruites);
	
	//array object will be stored in stack memory and array will be stored in heap memory.
	
	
	//arr-stack memory
	
	//array values will be stored in heap memory
	
	Arrays.sort(fruites);
	
	System.out.println(Arrays.toString(fruites));
	
	String s1="abc";
	String s2="abe";
	
	System.out.println(s1.compareTo(s2));
	
	//internally sorting will use compare method for strings
	
	//>negative means 1 string lesser than 2.positive means 1 string more than 2, 0 means both are equal
	
//reverse the collection
	
	
	
	Arrays.sort(fruites,Collections.reverseOrder());

	System.out.println(Arrays.toString(fruites));
}
	
	public static void main(String[] args) {
		
		
		f1();
	}
}