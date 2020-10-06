//OOP Program 05: Overlaoding Constructor

package OOPConcept;

public class OverloadingConstructor {
	
	String name, gender;
	int phone;
	
	//Creating Constructors bt parameter list must be different;
	OverloadingConstructor(){
		
		System.out.println("Here is no values.");
	}
	
	OverloadingConstructor(String nm, String gen){
		
		name = nm;
		gender = gen;
	}
	
	OverloadingConstructor(String n, String g, int ph){
		
		name = n; 
		gender = g;
		phone = ph;
	}
	
	// Creating mathod to Print out the information;
	void showInformation(){
		
		System.out.println("Name : "+ name);
		System.out.println("Gender : "+ gender);
		System.out.println("Phone : "+ phone);
		
		System.out.println();
	}
}
