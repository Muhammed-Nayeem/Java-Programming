//Compile Time -> Static Polymorphism testing in method overloading;

package CoreOOPPolymorphism;

public class MTest {
	public static void main(String[] args) {
		
		//Declering & Creating Object;
		Moverloading ob = new Moverloading();
		
		ob.add(3, 6, 1);
		ob.add();
		ob.add(10.50, 15.6);
	}
}
