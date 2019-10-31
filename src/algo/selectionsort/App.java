package algo.selectionsort;

public class App {

	
	public static void main(String[] args) {
		
		int[] num = selectionSort(new int[] {9,8,3,13,87,12,99});
		for (int i = 0; i < num.length; i++) {
			System.out.print("["+num[i]+"]");
		}
	}
	
	
	
	public static int[] selectionSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int minimum = i;
			for(int j = i+1; j < array.length; j++) {
				if(array[j]< array[minimum]) {
					minimum = j;
				}
				
			}
			int temp = array[i];
			array[i] = array[minimum];
			array[minimum] = temp;

		}
		
		return array;
	}
}
