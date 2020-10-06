package ArraysDemo;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		ArrayList<Integer> num3 = new ArrayList<Integer>();
		
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		System.out.println("Number One: "+ num1);
		
		num2.add(1);
		num2.add(2);
		num2.add(3);
		num2.add(4);
		System.out.println("Number Two: "+ num2);
		
		num3.addAll(num1);
		
		System.out.print("Number Three: ");
		for (Integer I : num3)
		{
			System.out.print(" "+ I);
		}
		System.out.println();
		
		boolean result = num1.equals(num2);
		System.out.println("Num1 == Num2 : "+ result);
		
		boolean rslt = num1.equals(num3);
		System.out.println("Num1 == Num3 : "+ rslt);
	}
}
