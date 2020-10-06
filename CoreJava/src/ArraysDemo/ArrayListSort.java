package ArraysDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(50);
		num.add(5);
		num.add(30);
		num.add(70);
		num.add(3);
		
		System.out.println("Before Sorting: "+ num);
		
		Collections.sort(num);
		System.out.println("After Sorting In Ascending Order: "+ num);
		
		Collections.sort(num, Collections.reverseOrder());
		System.out.println("After Sorting In Descending Order: "+ num);
		
	}
}
