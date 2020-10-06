package corejava;

import java.util.Scanner;

public class PallindromeNumber {
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
		if (num == rev)
		{
			System.out.println(rev + " is Pallindrome Number.");
		}
		else
		{
			System.out.println(rev + " is not Pallindrome Number.");
		}
	}
}
