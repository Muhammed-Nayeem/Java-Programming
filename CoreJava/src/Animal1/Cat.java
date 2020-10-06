//Packaging program;

package Animal1;

public class Cat {
	public static void main(String[] args) {
		
		//Creating Cat class object because Dog & Cat class are in one package;
		//Dog dog = new Dog();
		
		Animal2.Dog  dog = new Animal2.Dog();
		dog.display();
	}
}
