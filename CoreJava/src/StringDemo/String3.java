package StringDemo;

import java.util.Scanner;

public class String3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1;
		
		s1 = input.nextLine();
		
		StringBuffer sb = new StringBuffer(s1);
		
		String s2 = sb.reverse().toString();
		
		if (s1.equals(s2))
		{
			System.out.println("String is Pllindrome.");
		}
		else
		{
			System.out.println("String is not Pallindrome.");
		}
		
	}
}
