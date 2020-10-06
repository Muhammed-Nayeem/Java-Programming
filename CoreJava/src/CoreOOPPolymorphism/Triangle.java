//Program on dynamic polymorphism/ run time polymorphism dispatch;

package CoreOOPPolymorphism;

/*This is subclass*/

public class Triangle extends Shape {
	//area();->invisible here;
	
	double base, height;
	
	//Constructor for initialized base and height;
	Triangle(double base, double height){
		
		this.base = base;
		this.height = height;
	}
	
	@Override
	double area(){
		return (0.5*base*height);
	}
}
