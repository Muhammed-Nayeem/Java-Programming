// OOP Program 06: Returning Value from mathod;

package OOPConcept;

import java.util.Scanner;

public class RVTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, n1 = 30, n2 = 10;
		System.out.println("Enter a Number: ");
		num = sc.nextInt();
		
		ReturningValue rvfm = new ReturningValue();
		//int res = rvfm.square(num);
		System.out.println("Square of "+ num + " is : "+ rvfm.square(num));
		
		ReturningValue sub = new ReturningValue();
		System.out.println("Subtract is : "+ sub.subtract(n1, n2));
		
	}
}
