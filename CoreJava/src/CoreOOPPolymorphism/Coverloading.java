//Compile Time -> static polymorphism using constructor overloading;

package CoreOOPPolymorphism;

public class Coverloading {
	
	Coverloading(String name, int age){
		System.out.println("My name is : "+ name);
		System.out.println("My age is : "+ age);
	}
	
	Coverloading(String qualification, String hobby, String play){
		System.out.println("My qualification is : "+ qualification);
		System.out.println("My hobby is : "+ hobby);
		System.out.println("My favourite game is : "+ play);
	}
	
	Coverloading(){
		System.out.println("Nothing to print here!");
	}
}

