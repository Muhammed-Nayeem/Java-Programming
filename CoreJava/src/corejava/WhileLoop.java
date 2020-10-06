package corejava;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j, m, n, p;
		System.out.println("Take a value: ");
		n = sc.nextInt();
		i = 1;
		while (i <= n)
		{
			System.out.println(i);
			i+=2;
		}
	}
}
