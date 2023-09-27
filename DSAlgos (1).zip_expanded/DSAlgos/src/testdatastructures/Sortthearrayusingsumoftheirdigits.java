package testdatastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sortthearrayusingsumoftheirdigits {

	
	public static int getsum(int x) {
	
	
	int sum=0;
	
	while(x>0) {
		

		
		sum=sum+x%10;
		x=x/10;
		
		
	}
		return sum;
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> A=new ArrayList<Integer>();
		
		A.add(10);
		
		A.add(22);
		
		A.add(14);
		
		A.add(40);
		
		A.add(35);
		
		A.add(15);

        Collections.sort(A, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return getsum(o1)-getsum(o2);
				
			}
			
        });
	    	 
        System.out.println(A);
        Collections.sort(A,(a,b)->getsum(a)-getsum(b));
        
        System.out.println(A);
        
        
        
        
        

		
			
		}
		
	}

