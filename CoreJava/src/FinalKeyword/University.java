// final keyword uisng part 01;

package FinalKeyword;

public class University {
	final String UNIVERSITY_NAME = "Leading University";
	final int fees;//final blank variable;
	static final int semester;
	
	
	//Initializing final blank variable by creating constructor;
	University(){
		fees = 37000;
	}
	
	//Initializing static final blank variable by creating static block;
	static{
		semester = 12;
	}
	
	void display(){
		System.out.println("University Name : "+ UNIVERSITY_NAME);
		System.out.println("University Fees : "+ fees);
		System.out.println("University Semesters: "+ semester);
	}
}
