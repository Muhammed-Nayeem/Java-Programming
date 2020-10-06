package corejava;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, count=0;
		
		System.out.println("Take a number: ");
		num = sc.nextInt();
		for (int i = 2; i <= num-1; i++)
		{
			if (num % i == 0)
			{
				count++;
				break;
			}
		}
		if (count == 0 && num != 1 && num != 0)
		{
			System.out.println("Prime Number.");
		}
		else
		{
			System.out.println("Not Prime Number.");
		}
	}
}
