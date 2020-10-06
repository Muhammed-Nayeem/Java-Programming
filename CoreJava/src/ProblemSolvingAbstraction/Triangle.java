
package ProblemSolvingAbstraction;


public class Triangle extends Shape {
	//a,b, Shape(double a, double b), area();->invisible here;
	
	Triangle(double a, double b){
		super(a, b);
	}
	
	@Override
	void area(){
		double result = (0.5 * a * b);
		System.out.println("Triangle Area is: "+ result);
	}
}
