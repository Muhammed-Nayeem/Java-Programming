//OOP Program 01: Class and Object

package OOPConcept;

public class Test {
	public static void main(String[] args) {
		/*  
		Teacher teacher1;// object declering.
		teacher1 = new Teacher();// object creating.
		*/
		
		Teacher teacher1 = new Teacher(); //object declering and crearting.
		Teacher teacher2 = new Teacher();
		Teacher teacher3 = new Teacher();
		Teacher teacher4 = new Teacher();
		
		//object number one teacher1
		teacher1.name = "Muhammed Nayeem";
		teacher1.gender = "Male";
		teacher1.phone = "01703479326";
		
		//object number Two teacher2
		teacher2.name = "Joydip Paul";
		teacher2.gender = "Male";
		teacher2.phone = "01734937545";
		
		//obeject number Three teacher3
		teacher3.name = "Crescent Debnath";
		teacher3.gender = "Male";
		teacher3.phone = "01735356478";
		
		//object number Four teacher4
		teacher4.name = "Indrajit Chandra";
		teacher4.gender = "Male";
		teacher4.phone = "01748672678";
		
		
		//Print out for object One
		System.out.println("Name : "+ teacher1.name);
		System.out.println("Gender : "+ teacher1.gender);
		System.out.println("Phone : "+ teacher1.phone);
		
		System.out.println();
		
		//Print out for object Two
		System.out.println("Name : "+ teacher2.name);
		System.out.println("Gender : "+ teacher2.gender);
		System.out.println("Phone : "+ teacher2.phone);
		
		System.out.println();
		
		//Print out for object Three
		System.out.println("Name : "+ teacher3.name);
		System.out.println("Gender : "+ teacher3.gender);
		System.out.println("Phone : "+ teacher3.phone);
		
		System.out.println();
		
		//Print out for object Four
		System.out.println("Name : "+ teacher4.name);
		System.out.println("Gender : "+ teacher4.gender);
		System.out.println("Phone : "+ teacher4.phone);		
		
	}
}
