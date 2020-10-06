//OOP Program 11: Static Block;

package OOPConcept;

public class StaticBlock {
	
	static int id;
	static String name, institute, phone;
	
	static{
		
		id = 1712020132;
		name = "Muhammed Nayeem";
	}
	static{
		institute = "Leading University";
		phone = "01703479326";
	}
	
	static void display(){
		System.out.println("Id : "+ id);
		System.out.println("Name : "+ name);
		System.out.println("Institute : "+ institute);
		System.out.println("Phone : "+ phone);
	}
	
	public static void main(String[] args) {
		
		StaticBlock.display();
	}
}
