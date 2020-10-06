// OOP Program 04: Class,Object,Mathod and Constructor

package OOPConcept;

public class Sisters {
	
	String name, gender, occupation;
	
	//Creating Default Constructor(no parameter);
	Sisters(){
		
		System.out.println("Have no values here. ^_^");
		
	}
	
	
	//Creating parameterwize Constructor, Constructor name should be similar with Class name;
	Sisters(String n, String g, String occu){
		
		name = n;
		gender = g;
		occupation = occu;
	}
	
	//Creating mathod for printing the information.
	void showInformation(){
		
		System.out.println("Name : "+ name);
		System.out.println("Gender : "+ gender);
		System.out.println("Occupation : "+ occupation);
		System.out.println();
	}
}
