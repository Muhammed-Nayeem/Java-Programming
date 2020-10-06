// OOP Inhritance : Teacher class is Extends the Person class by extends keyword;

package CoreOOPInheritance;

public class Teacher extends Person {
	
	//name,phone,age,showInformation(); -> This data are invisible here;
	String qualification, occuapation;
	
	void showInformtaion2(){
		showInformation1();
		System.out.println("Qualification : "+ qualification);
		System.out.println("Occupation : "+ occuapation);
		
		System.out.println();
	}
}
