// OOP Encapsulation Access Private data by set and get method;

package CoreOOPEncapsulation;

public class TestPerson2 {
	public static void main(String[] args) {
		
		Person2 p2 = new Person2();
		
		p2.setName("Muhammed Nayeem");
		p2.setAge(21);
		System.out.println("Name : "+ p2.getName());
		System.out.println("Age : "+ p2.getAge());
	}
}
