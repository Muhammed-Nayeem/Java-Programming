
package corejava;

import java.util.Scanner;

public class Reversedigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, temp, rem, rev = 0; 
		num = sc.nextInt();
		temp = num; 
		while (temp != 0)
		{
			rem = temp % 10; 
			rev = rev * 10 + rem;
			temp /= 10;
		}
		System.out.println("Reverse Number: "+ rev);
	}
}
