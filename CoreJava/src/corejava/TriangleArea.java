
package corejava;

import java.util.Scanner;


public class TriangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double b, h, a;
		System.out.println("Enter base: ");
		b = input.nextDouble();
		System.out.println("Enter height: ");
		h = input.nextDouble();
		
		a = 0.5 * b * h;
		System.out.println("Triangle Area is: "+ a);
	}
}
