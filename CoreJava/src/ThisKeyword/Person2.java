//this keyword part: 01 remake

package ThisKeyword;

public class Person2 {
	String name; 
	int age;
	String hair;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person2(String name, int age, String hair){
		this(name, age); // calling the overriden constructor by this keyword;
		this.hair = hair;
	}
	
	void display(){
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Hair : "+ hair);
		
		System.out.println();
	}
}
