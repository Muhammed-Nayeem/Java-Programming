package WrapperClassDemo;

public class Wrapper2 {
	public static void main(String[] args) {
		int decimal = 15;
		String octal = Integer.toBinaryString(decimal);
		System.out.println("Octal : " + octal);
		
		String binary = "1010";
		Integer i = Integer.parseInt(binary, 2);
		System.out.println("Decimal : " + i);
	}
}
