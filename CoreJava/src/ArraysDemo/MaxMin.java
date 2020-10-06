package ArraysDemo;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] num = new double[5];
		double sum = 0, avg = 0;
		int i;
		System.out.println("Enter five numbers: ");
		for (i = 0; i < num.length; i++)
		{
			num[i] = sc.nextDouble();
			sum = sum + num[i];
		}
		avg = sum / num.length;
		System.out.println("Sum is: "+ sum);
		System.out.println("Average is: "+ avg);
		
		double max = num[0];
		double min = num[0];
		
		for (i = 0; i < num.length; i++)
		{
			if (max < num[i])
			{
				max = num[i];
			}
			if (min > num[i])
			{
				min = num[i];
			}
		}
		
		System.out.println("Maximum number is: "+ max);
		System.out.println("Minimum number is: "+ min);
	}
}
