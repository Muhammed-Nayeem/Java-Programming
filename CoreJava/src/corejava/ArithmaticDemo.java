
package corejava;

import java.util.Scanner;


public class ArithmaticDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num1, num2, sum, sub, mul,div, mod;
		
		System.out.println("Enter the first number: ");
		num1 = input.nextInt();
		System.out.println("Enter the second number: ");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
		
		System.out.println("Sum : "+ sum);
		System.out.println("Sub : "+ sub);
		System.out.println("Mul : "+ mul);
		System.out.println("Div : "+ div);
		System.out.println("Mod : "+ mod);
	}
}
