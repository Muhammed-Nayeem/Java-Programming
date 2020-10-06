// Inheriting Private Member OOP Program;

package CoreOOPInheritance;

public class Teacher2 extends Person2 {
	//getName(),setName(),getPhone(),setPhone(),getAge(),setAge() -> Invisible here;
	
	private String qualification, occupation;

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	void DisplayInformation(){
		
		System.out.println("Name : "+ getName());
		System.out.println("Age : "+ getAge());
		System.out.println("Occupation : "+ getOccupation());
		System.out.println("Qualification : "+ getQualification());
		System.out.println("Phone : "+ getPhone());
		
		System.out.println();
	}
}
