package algo.recursion;

public class RecursiveLinearSerch {

	public static void main(String[] args) {
		System.out.println(recursiveLinearSearch(new int[] {23, 123, 128,12312,213,456},0,123));

	}
	
	public static int recursiveLinearSearch(int[] array, int index, int target) {
		if(index > array.length -1) { // if is true ,target is not gound in the array
			return -1;
		}else if(array[index] == target) {
		return index;
		
		}else {
			System.out.println("index at: "+ index);
			return recursiveLinearSearch(array, index+1, target);
		}
		
	}

}
