package corejava;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, temp, rem, sum = 0;
		num = sc.nextInt();
		temp = num;
		while (temp != 0)
		{
			rem = temp % 10;
			sum = sum + rem;
			temp /= 10;
		}
		System.out.println("Sum of digit: "+ sum);
	}
}
