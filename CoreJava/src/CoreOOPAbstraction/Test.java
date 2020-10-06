//testing abstract class and method;

package CoreOOPAbstraction;

public class Test {
	public static void main(String[] args) {
		
		//creating super class ref variable;
		
		MobileUser mu;
		
		mu = new Rahim();
		//mu.call();
		mu.sendMessege();
		
		mu = new Karim();
		mu.sendMessege();
	}
}
