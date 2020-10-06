
package ProblemSolvingAbstraction;


public class Circle extends Shape {
	//a,b, Shape(double a, double b), area();->invisible here;
	
	//double r;
	
	Circle(double r){
		super(r, r);
	}
	
	@Override
	void area(){
		double result = Math.PI * a * b;
		System.out.println("Circle Area is : "+ result);
	}
}
