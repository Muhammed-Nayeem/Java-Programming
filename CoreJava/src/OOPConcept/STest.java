// OOP Program 04: Class,Object,Mathod and Constructor

package OOPConcept;

public class STest {
	
	public static void main(String[] args) {
		
		//Declering, Creating and Initializing the objects by the help of Constructor;
		Sisters sister1 = new Sisters("Shanta", "Female", "Student");
		sister1.showInformation(); // call the mathod
		
		Sisters sister2 = new Sisters("Shaila", "Female", "Student");
		sister2.showInformation();
		
		Sisters sister3 = new Sisters("Shakila", "Female", "Student");
		sister3.showInformation();
		
		Sisters sister4 = new Sisters("Mina", "Female", "Student");
		sister4.showInformation();
		
		Sisters sister5 = new Sisters("Nidhi", "Female", "Children");
		sister5.showInformation();
		
		
		// No Information is set for this object because of testing default constructor.
		Sisters sister6 = new Sisters();
		sister6.showInformation();
	}
}
