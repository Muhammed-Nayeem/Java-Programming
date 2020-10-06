// Test Inheriting Private Member OOP Program;

package CoreOOPInheritance;

public class Test2 {
	public static void main(String[] args) {
		
		//Declering & Creating object;
		Teacher2 t2 = new Teacher2();
		Teacher2 t3 = new Teacher2();
		
		t2.setName("Tahmid Rahman");
		t2.setOccupation("Programmer");
		t2.setQualification("M.SC in CSE(On Going)");
		t2.setAge(28);
		t2.setPhone("018859035786");
		t2.DisplayInformation();
		
		t3.setName("Alak Kanthi Sharma");
		t3.setOccupation("CVI");
		t3.setQualification("M.SC in CSE");
		t3.setAge(30);
		t3.setPhone("017939035786");
		t3.DisplayInformation();
		
		
		/*
		System.out.println("Name : "+ t2.getName());
		System.out.println("Age : "+ t2.getAge());
		System.out.println("Occupation : "+ t2.getOccupation());
		System.out.println("Qualification : "+ t2.getQualification());
		System.out.println("Phone : "+ t2.getPhone());
		*/
	}
}
