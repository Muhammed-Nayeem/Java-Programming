package corejava;

import java.util.Scanner;

public class Continous {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for (int i = 1; i <= n; i+=3)
		{
			if (i == 10)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
