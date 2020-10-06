package corejava;

import java.util.Scanner;

public class SumOfEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, n, sum = 0;
		System.out.println("Take starting value: ");
		m = sc.nextInt();
		System.out.println("Take ending value: ");
		n = sc.nextInt();
		
		for (int i = m; i <= n; i++)
		{
			if (i % 2 == 0)
			{
				sum += i;
			}
		}
		System.out.println("Sum of Even Number from "+ m + " to " + n +" is: " + sum);
		
	}
}
