package corejava;

import java.util.Scanner;

public class TimeTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, m, n; 
		m = sc.nextInt();
		n = sc.nextInt();
		
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				System.out.println(i +" x "+ j +" = "+ i*j);
			}
			System.out.println("");
		}
	}
}
