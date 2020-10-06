//Test Student List by LinkedList;

package LinkedList;

import java.util.LinkedList;


public class TestList {
	public static void main(String[] args) {
		
		//Creating LinkedList
		LinkedList<StudentList> list = new LinkedList<StudentList>();
		
		
		//Creating Students by creating object;
		StudentList s1 = new StudentList("Sanjida", "Ten", 101);
		StudentList s2 = new StudentList("Situ", "Ten", 102);
		StudentList s3 = new StudentList("Choyti", "Ten", 103);
		StudentList s4 = new StudentList("Meem", "Ten", 104);
		
		//Adding Students to the LinkedList;
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		//display students information;
		for (StudentList s : list)
		{
			System.out.println(s.name +"	"+s.classname +"	"+s.id);
		}
		
		System.out.println("Size of StudentList : "+ list.size());
	}
}
