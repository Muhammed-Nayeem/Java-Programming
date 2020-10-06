
package corejava;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, n;
		System.out.println("Take a value: ");
		n = sc.nextInt();
		
		i = 1; 
		do
		{
			System.out.println(i);
			i++;
		}
		while (i <= n);
	}
}
