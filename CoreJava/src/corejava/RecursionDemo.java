
package corejava;

public class RecursionDemo {
	
	int fact(int n){
		
		if (n == 1)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		RecursionDemo RD = new RecursionDemo();
		
		int result = RD.fact(5);
		
		System.out.println("Recursion is : " + result);
	}
}
