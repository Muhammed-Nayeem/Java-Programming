package corejava;

import java.util.Scanner;

public class URISolve {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, sum = 0;
		
		while (1 == 1)
		{
			x = input.nextInt();
			if (x == 0)
			{
				break;
			}
			if (x % 2 != 0)
			{
				x++;
			}
			for (int i = 1; i <= 5; i++)
			{
				sum = sum + x;
				x+=2;
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
