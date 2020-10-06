//OOP Problem Solve 01

package OOPConcept;

public class Box {
	
	double height,width,depth;
	
	//Creating Constructor
	Box(double h, double w, double d){
		
		//Initializing the Instance variable
		height = h;
		width = w;
		depth = d;
	}
	
	void displayVol(){
		
		double vol = (height * width * depth);
		
		System.out.println("Volumne of Box: "+ vol);
	}
	
	
	/*
	public static void main(String[] args) {
		
		//Declering, Creating, Initializing the object;
		Box box1 = new Box(10, 10, 10);
		Box box2 = new Box(30, 20, 10);
		
		box1.displayVol();
		box2.displayVol();
	}
	*/
	
}
