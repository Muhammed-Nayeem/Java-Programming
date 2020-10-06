//Run Time Polymorphism -> dynamic binding testing;

package CoreOOPPolymorphism;

/*Parent class reference value can be call different classes object*/

public class PTSTest {
	public static void main(String[] args) {
		
		//Declering & Creating object;
		/*
		Person p = new Person();
		Teacher t = new Teacher();
		Student s = new Student();
		
		p.display();
		t.display();
		s.display();
		*/
		
		//Parent class ref value call sub classes objects;
		Person p = new Person();
		p.display();
		
		p = new Teacher();
		p.display();
		
		p = new Student();
		p.display();
	}
}
