package algo.recursion;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		
		System.out.println(recursiveBinarySearch(new int[] {23, 123, 128,213,456},0,5,898));

	}
	
	
	public static int recursiveBinarySearch(int[]array,int first,int last,int target) {
		//first = 0; last = array.length -1;
		
		if(first >= last) {
			return -1;
			
		}
		
		else {
			// if first is not greater or equal to last then continue 
			 int middle = (first + last)/2;// setting the middle
			 if(target == array[middle]){
				return middle;
			}
			 else if(target > array[middle]) { // if target is greater than item in middle then 
				 //invoke method changing first for middle +1
//				first = middle + 1;
				return recursiveBinarySearch(array, middle+1, last, target);
			}
			else {
				//else that means target is less than item at the middle 
				//therefore invoke an change the method changing last 
				return recursiveBinarySearch(array, first, middle-1, target);

			}
		}
	}
}
