package ArraysDemo;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0, n, i, j;
		System.out.println("Enter Five Numbers: ");
		for (i = 0; i < 5; i++)
		{
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println("Sum of five numbers: "+ sum);
	}
}
