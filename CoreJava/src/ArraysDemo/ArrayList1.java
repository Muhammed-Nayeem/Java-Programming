package ArraysDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		//System.out.println("Size of ArrayList: "+ number.size());
		
		number.add(10);
		number.add(20);
		number.add(2, 30);
		number.add(3, 40);
		
		//System.out.println("Size of ArrayList After added value: "+ number.size());
		System.out.println("ArrayList contains:" + number + " ");
		
//		for (Integer I : number)
//		{
//			System.out.print(I + " ");
//		}
//		System.out.println();
		
		/*Iterator itr = number.iterator();
		while (itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();*/
		
		number.remove(2);
		System.out.println("After removing the value: "+ number);
		/*for (Iterator itr = number.iterator(); itr.hasNext();)
		{
			System.out.println(" "+ itr.next());
		}*/
		
		number.removeAll(number);
		System.out.println("After removing all values: "+ number);
	}
}
