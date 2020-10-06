package StringDemo;

public class String2 {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Muhammed");
		
		System.out.println(sb);
		
		sb.append(" Nayeem ");
		sb.append(808);
		System.out.println(sb);
		
//		sb.reverse();
//		System.out.println(sb);
		
//		sb.delete(0, 5);
//		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
	}
}
