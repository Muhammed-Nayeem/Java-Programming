package corejava;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, temp, rem, sum = 0;
		num = sc.nextInt();
		temp = num; 
		while (temp != 0)
		{
			rem = temp % 10;
			sum = sum + rem*rem*rem;
			temp /= 10;
		}
		if (sum == num)
		{
			System.out.println(sum + " is Armstrong Number.");
		}
		else
		{
			System.out.println(sum + " is not Armstrong Number.");
		}
	}
}
