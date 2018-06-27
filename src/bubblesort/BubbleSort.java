package bubblesort;

import java.util.Arrays;

public class BubbleSort {

	private static Integer[] intArr = {3,60,35,2,45,320,5};
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(intArr));
		System.out.println("--------------");
		System.out.println("--------------");
		bubbleSort(intArr);
	}
	
	public static void bubbleSort(Integer[] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			for(int j = 1; j < intArr.length - i; j++) {
				if(intArr[j-1] > intArr[j]) {
					int holder = intArr[j-1];
					intArr[j-1] = intArr[j];
					intArr[j] = holder;
				}				
			}
		}
		System.out.println(Arrays.toString(intArr));
	}
	
}
