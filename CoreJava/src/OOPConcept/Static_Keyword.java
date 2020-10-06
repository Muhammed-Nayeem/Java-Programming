//OOP Program 07: Static Variable Part 01

package OOPConcept;

public class Static_Keyword {
	
	String name;
	int id;
	static String universityName = "LU";//static varibale
	
	//constructor creating;
	Static_Keyword(String n, int i){
		
		name = n; 
		id = i;
	}
	
	void showInformation(){
		
		System.out.println("Name : "+ name);
		System.out.println("ID : "+ id);
		System.out.println("Institute : "+ universityName);
		
		System.out.println();
	}
}
