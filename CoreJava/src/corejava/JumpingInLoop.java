
package corejava;

import java.util.Scanner;

public class JumpingInLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++)
		{
			if (i == 10)
			{
				break;
			}
			System.out.println(i);
		}
	}
}
