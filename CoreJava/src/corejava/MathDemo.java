package corejava;

import java.util.Scanner;

public class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y; 
		x = sc.nextInt();
		y = sc.nextInt();
		
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		
		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}
}
