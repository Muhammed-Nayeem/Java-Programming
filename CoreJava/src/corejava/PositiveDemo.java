package corejava;

import java.util.Scanner;


public class PositiveDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		if (num > 0)
		{
			System.out.println(num + " is a positive number.");
		}
		else if (num < 0)
		{
			System.out.println(num + " is a negative number.");
		}
		else 
		{
			System.out.println(num + " is equal to zero.");
		}
	}
}
