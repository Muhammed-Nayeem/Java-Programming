package corejava;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		for (int i = 2; i <= n; i+=2)
		{
			System.out.println(i);
		}
	}
}
