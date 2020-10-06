// OOP Encapsulation Declering Private data;

package CoreOOPEncapsulation;

public class Person2 {
	
	private String name;
	private int age;
	
	//creating public method for accesing this data from other classes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
