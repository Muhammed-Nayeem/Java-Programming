/*
 * Part 01 of using 'this keyword';
 */
package ThisKeyword;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name; 
		this.age = age;
	}
	
	void showInformation(){
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
	}
}
