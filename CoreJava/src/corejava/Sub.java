package corejava;

import java.util.Scanner;

public class Sub {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, sub;
		a = sc.nextInt();
		b = sc.nextInt();
		sub = a - b;
		System.out.println("Sub is: "+ sub);
	}
}
