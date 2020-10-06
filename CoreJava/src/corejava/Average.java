package corejava;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, sum, avg;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		sum = a + b + c;
		avg = sum / 3;
		System.out.println("Sum is :"+ sum);
		System.out.println("Average is: "+ avg);
	}
}
