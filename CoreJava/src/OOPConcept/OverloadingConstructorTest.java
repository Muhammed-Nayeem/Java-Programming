//OOP Program 05: Overlaoding Constructor

package OOPConcept;

public class OverloadingConstructorTest {
	
	public static void main(String[] args) {
		
		//Declering, Creating and Initializing the obhects by the help of constructor;
		OverloadingConstructor overcons1 = new OverloadingConstructor();
		
		OverloadingConstructor overcons2 = new OverloadingConstructor("Israt", "Female");
		overcons2.showInformation(); // call the mathod;
		
		OverloadingConstructor overcons3 = new OverloadingConstructor("Sumaiya", "Female", 1703479538);
		overcons3.showInformation();
		
	}
	
}
