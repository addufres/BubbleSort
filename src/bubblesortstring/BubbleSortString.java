package bubblesortstring;

import java.util.Arrays;

public class BubbleSortString {
	
	private static String[] strArr = {"so","happy","to","almost","be","done","but","boy","im","super","proud"};
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(strArr));
		System.out.println("--------------");
		System.out.println("--------------");
		bubbleSortString(strArr);
	}

	public static void bubbleSortString(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			for(int j = 1; j < strArr.length - i; j++) {
				if(strArr[j-1].compareTo(strArr[j])>0) {
					String holder = strArr[j-1];
					strArr[j-1] = strArr[j];
					strArr[j] = holder;
				}				
			}
		}
		System.out.println(Arrays.toString(strArr));
	}
}
