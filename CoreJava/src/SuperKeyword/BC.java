//Super keyword using call super class method;

package SuperKeyword;

public class BC extends AB {
	// display(); -> invisible here;
	
	@Override
	void display(){
		super.display();
		System.out.println("Inside BC class");
	}
}
