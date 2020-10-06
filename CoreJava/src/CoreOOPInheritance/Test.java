//Test here the inherited class;

package CoreOOPInheritance;

public class Test {
	public static void main(String[] args) {
		
		//Declering & Creating object;
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		
		t1.name = "Alak Kanthi Sharma";
		t1.occuapation = "Teacher";
		t1.age = 30;
		t1.qualification = "M.SC in CSE";
		t1.phone = "01745847589";
		
		t1.showInformtaion2();
		
		t2.name = "Tahmid Rahman";
		t2.occuapation = "Programmer";
		t2.qualification = "M.SC in CSE(On Going)";
		t2.age = 28;
		t2.phone = "095676938768";
		
		t2.showInformtaion2();
	}
}
