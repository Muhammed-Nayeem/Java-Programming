// Compile Time -> Static Polymorphism in method overloading program;

package CoreOOPPolymorphism;

public class Moverloading {
	
	void add(double a, double b){
		System.out.println("Sum is : "+ (a+b));
	}
	void add(int a, int b, int c){
		System.out.println("Sum is : "+ (a+b+c));
	}
	void add(){
		System.out.println("Nothing to add here!");
	}
}
