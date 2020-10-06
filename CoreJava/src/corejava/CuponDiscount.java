package corejava;

import java.util.Scanner;

public class CuponDiscount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int Total_Course_Fees = 7000, sub_total = 5500, total = 0;
		int temp = 1000;
		String str;
		System.out.println("Total Course Fess: " + Total_Course_Fees + "Tk.");
		System.out.println("Sub Total Fees: " + sub_total + "Tk.");
		while (true) 
		{
			System.out.print("Give Your Cupon: ");
			str = input.nextLine();
			if (str == "websuperstar") 
			{
				total = sub_total - temp;
				System.out.println("Total Fees: " + total + "Tk.");
				break;
			} 
			else 
			{
				System.out.println("Sub_Total Fees: " + sub_total + "Tk.");
				break;
			}
		}
	}
}
