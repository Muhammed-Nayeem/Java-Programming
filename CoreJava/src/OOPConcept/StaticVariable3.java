//OOP Program 03: Static Variable Part 03;

package OOPConcept;

public class StaticVariable3 {
	
	static int count = 0; // Static variable
	
	StaticVariable3(){
		count++;
	}
	
	void totalStudent(){
		System.out.println("Total Student : "+ count);
	}
}
