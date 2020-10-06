package corejava;

import java.util.Scanner;

public class Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, sum = 0; 
		n = sc.nextInt();
		for (i = 1; i <= n; i++)
		{
			sum += i*i;
		}
		System.out.println("Sum of Series: "+ sum);
	}
}
