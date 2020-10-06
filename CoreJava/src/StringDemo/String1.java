package StringDemo;

public class String1 {
	public static void main(String[] args) {
		String s1 = "I'm a Software Devoloper";
		String s2 = new String("Muhammed Nayeem");
		
		
		char[] S3 = {'a', 'b', 'c', 'd'};
		System.out.println(S3);
		
		System.out.println("  " + s1);
		System.out.println("  " + s2);
		
		int len = s1.length();
		System.out.println("Length of String One: "+ len);
		
		if (s1.equalsIgnoreCase(s2))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not Equals");
		}
		
		if (s1.contains("Software"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
