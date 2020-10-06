package WrapperClassDemo;

public class Autoboxing {
	public static void main(String[] args) {
		//primitive -> object
		
		int x = 30; 
		Integer y = Integer.valueOf(x);
		System.out.println("Y : " + y);
		
		Integer z = x; // Esiest way
		System.out.println("Z : " + y);
	}
}
