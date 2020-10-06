package ArraysDemo;

import java.util.Scanner;

public class SumAvg2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] num = new double[5];
		int i;
		double sum = 0, avg = 0; 
		System.out.println("Enter the five numbers: ");
		for (i = 0; i < 5; i++)
		{
			num[i] = sc.nextDouble();
			sum = sum + num[i];
		}
		avg = sum / num.length;
		System.out.println("Sum is: "+ sum);
		System.out.println("Average is: "+ avg);
	}
}
