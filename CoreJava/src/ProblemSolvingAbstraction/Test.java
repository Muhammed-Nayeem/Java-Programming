
package ProblemSolvingAbstraction;

public class Test {
	public static void main(String[] args) {
		
		//creating super class ref variable;
		Shape shape;
		
		shape = new Rectangle(10, 10);
		shape.area();
		
		shape = new Triangle(10, 5);
		shape.area();
		
		shape = new Circle(10);
		shape.area();
	}
}
