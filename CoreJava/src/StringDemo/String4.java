package StringDemo;

public class String4 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Muhammed");
		
		System.out.println("STR : "+ str);
		
		str.append(" Nayeem");
//		str.append(808);
//		str.append(12.50);
		System.out.println("STR : "+ str);
		
//		str.reverse();
//		System.out.println("STR :"+ str);

		str.delete(0, 5);
		System.out.println("STR :"+ str);
	}
}
