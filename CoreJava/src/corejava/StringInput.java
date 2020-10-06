
package corejava;

import java.util.Scanner;


public class StringInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch;
		String name;
		ch = input.next().charAt(0);
		name = input.nextLine();
		System.out.println("Your Name is: "+ name);
		System.out.println("Your Entire Latter is: "+ ch);
		
	}
}
