package WrapperClassDemo;

public class Wrapper1 {
	public static void main(String[] args) {
		//coverting  primitive data type to string
		int i = 100; 
		String s = Integer.toString(i);
		System.out.println("S : "+ s);
		
		//converting string to primitive data type
		String S = "32";
		int j = Integer.parseInt(S);
		System.out.println("J : " + j);
	}
}
