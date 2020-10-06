package ArraysDemo;

public class ArrayDemo1 {
	public static void main(String[] args) {
		
		int number[];
		number = new int[10];
		
		number[0] = 10; 
		number[1] = 20;
		number[2] = 30;
		System.out.println(number[2]);
		
		int len = number.length;
		System.out.println("Size of Array: "+ len);
	}
}
