package corejava;

import java.util.Scanner;

public class BreakContinue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		n = sc.nextInt();
		for (i = 1; i <= n; i+=3)
		{
			if (i == 10)
			{
				continue;
			}
			if (i > 13)
			{
				break;
			}
			System.out.println(i);
		}
	}
}
