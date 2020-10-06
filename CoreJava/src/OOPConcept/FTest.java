//OOP Class 02: Class, Object and void mathod.
package OOPConcept;

public class FTest {
	
	public static void main(String[] args) {
		
		//Declering and Creating Object for Friends Class
		Friends friends1 = new Friends();
		Friends friends2 = new Friends();
		Friends friends3 = new Friends();
		Friends friends4 = new Friends();
		Friends friends5 = new Friends();
		
		// Set Information for Object One: friends1
		friends1.name = "Pranab Roy";
		friends1.gender = "Male";
		friends1.occuapation = "Student";
		friends1.Class = 13;
		friends1.institute = "North South University,Dhaka";
		friends1.age = 22;
		friends1.phone = "017454534846";
		friends1.showinformation(); // Call the mathod;
		
		// Set Information for Object One: friends2
		friends2.name = "Shuvo Paul";
		friends2.gender = "Male";
		friends2.occuapation = "Student";
		friends2.Class = 13;
		friends2.institute = "Daffodil International University,Dhaka";
		friends2.age = 22;
		friends2.phone = "017404573846";
		friends2.showinformation(); // Call the mathod;
		
		// Set Information for Object One: friends3
		friends3.name = "Sinthia Trishna";
		friends3.gender = "Female";
		friends3.occuapation = "Student";
		friends3.Class = 13;
		friends3.institute = "International University Of Bangladesh Agricultural Technology,Dhaka";
		friends3.age = 20;
		friends3.phone = "0196524846";
		friends3.showinformation(); // Call the mathod;
		
		// Set Information for Object One: friends4
		friends4.name = "Sathi Debnath";
		friends4.gender = "Female";
		friends4.occuapation = "Student";
		friends4.Class = 13;
		friends4.institute = "Bangladesh National University,Brahmmanbaria";
		friends4.age = 20;
		friends4.phone = "0194684846";
		friends4.showinformation(); // Call the mathod;
		
		// Set Information for Object One: friends5
		friends5.name = "Sabrina Habib";
		friends5.gender = "Female";
		friends5.occuapation = "Student";
		friends5.Class = 13;
		friends5.institute = "Dhaka University,Dhaka";
		friends5.age = 20;
		friends5.phone = "01685684846";
		friends5.showinformation(); // Call the mathod;
		
		/*Creating Mathod in Friends Class for printing this objects information*/
	}
}
