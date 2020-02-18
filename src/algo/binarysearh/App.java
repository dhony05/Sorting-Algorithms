package algo.binarysearh;

public class App {
	
public static void main(String[] args) {
	
	int[] a = {1,2,4,6,7,81,100,102};
	System.out.println(binarySearch(a, 103));
}


public static int binarySearch(int[] array, int target) {
	int first = 0 ; int last = array.length -1; int middle; int count =0;
	while(first <= last) {
		count ++ ;
		//iterate while the first stay equal or less than  last 
		middle = (first + last)/2;
		//set  middle (dividing the array)
		if(target > array[middle] ) {
			first = middle + 1;
			//if the target is bigger than the element in the middle
			// we re-range it setting a new starting point after middle
			
		}
		
		else if(target < array[middle]  ) {
			last = middle - 1;
			//if the target is less than the element in the middle
			// we re-range it setting a new ending point before middle
		}else {
			System.out.println("count: " + count);
			return middle;
			
			// else return the middle
		}
	}
	
	System.out.println("count: " + count);
	return -1;
}


}
