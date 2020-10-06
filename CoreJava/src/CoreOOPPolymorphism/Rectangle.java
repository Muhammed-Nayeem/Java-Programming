//Program on dynamic polymorphism/ run time polymorphism dispatch;

package CoreOOPPolymorphism;

/*This is subclass*/

public class Rectangle extends Shape {
	//area();->invisible here;
	
	double length, width;
	
	//Constructor for initialized the length and width;
	Rectangle(double length, double width){
		
		this.length = length;
		this.width = width;
	}
	
	@Override
	double area(){
		return (length*width);
	}
	
}
