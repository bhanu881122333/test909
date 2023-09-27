
public class SearchAlgorithms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,4,6,9,12,13,14,15,17};
		//O(1)  O(n)   O(n)
		
		//Goal - pass the input //output the index
		System.out.println(binarySearch(arr,13));
		
		//O(logn)
		
		
		
				
	}
	
	

	public static int binarySearch(int[] arr , int target)
	{
		
		int left = 0, right = arr.length-1; int middle;
		while(left<=right)
		{
			middle =left+right/2;
			
			if(arr[middle]>target) 
				
				right=middle-1;
			else
				right=middle+1;
			}
		return -1;
	}
	

	
}


	
	


