
package ProblemSolvingAbstraction;


public class Rectangle extends Shape {
	//a,b, Shape(double a, double b), area();->invisible here;
	
	Rectangle(double a, double b){
		super(a, b);
	}
	
	@Override
	void area(){
		double result = (a * b);
		System.out.println("Rectangle Area is : "+ result);
	}
}
