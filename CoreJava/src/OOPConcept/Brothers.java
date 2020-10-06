//OOP Program 03: Class, Object and parameterwized mathod.

package OOPConcept;

public class Brothers {
	
	String name, gender, occupation;
	int age;
	
	//Creating Parameterwize Mathod for set information.
	void setInformation(String n, String g, String occu, int ag){
		
		name = n;
		gender = g;
		occupation = occu;
		age = ag;
	}
	
	// Creating Mathod for printout the information
	void showinformation(){
		
		System.out.println("Name : "+ name);
		System.out.println("Gender : "+ gender);
		System.out.println("Occupation: "+ occupation);
		System.out.println("Age : "+ age);
		
		System.out.println();
	}
}
