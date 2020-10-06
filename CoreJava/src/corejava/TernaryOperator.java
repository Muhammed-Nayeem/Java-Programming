package corejava;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y , result; 
		System.out.println("Take a value for X: ");
		x = sc.nextInt();
		System.out.println("Take a value for Y: ");
		y = sc.nextInt();
		
		result = (x > y) ? x : y;
		System.out.println("Large Number is: "+ result);
	}
}
