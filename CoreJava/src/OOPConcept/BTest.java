//OOP Program 03: Class, Object and parameterwized mathod.
package OOPConcept;

public class BTest {
	
	public static void main(String[] args) {
		
		//Declering and Creating Object
		Brothers brother1 = new Brothers();
		Brothers brother2 = new Brothers();
		Brothers brother3 = new Brothers();
		Brothers brother4 = new Brothers();
		
		//set information for object brother1 by calling mathod
		brother1.setInformation("Muhammed Shakib", "Male", "Student", 16);
		brother1.showinformation(); // call the mathod
		
		brother2.setInformation("Muhammed Saif", "Male", "Student", 6);
		brother2.showinformation();
		
		brother3.setInformation("Muhammed Fahim", "Male", "Student", 9);
		brother3.showinformation();
		
		brother4.setInformation("Muhammed Sizan", "Male", "Student", 7);
		brother4.showinformation();
		
	}
}
