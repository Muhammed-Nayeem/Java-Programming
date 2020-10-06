//overriden constructor call by super keyword;

package SuperKeyword;

public class Vehical {
	
	String color,number_plate,brand;
	double weight;
	
	//Creating Constructor to initialized instance variable;
	Vehical(String c, String np, String b, double w){
		
		color = c;
		number_plate = np;
		brand = b;
		weight = w;
	}
	
	//creating a method to display information;
	void showInformation(){
		System.out.println("Vehical Brand : "+ brand);
		System.out.println("Vehical Color : "+ color);
		System.out.println("Vehical Number Plate : "+ number_plate);
		System.out.println("Vehical Weight : "+ weight);
	}
	
}
