//overriden constructor call by super keyword;

package SuperKeyword;

public class Car extends Vehical {
	//color,number_plate,brand,gear,weight,Vehical(),showInformation(); -> Invisible here;

	int gear;
	
	//Creating Constructor;
	Car(String c, String np, String b, double w, int g){
		
		super(c, np, b, w); //constructor overriden and call by super keyword and using parameters;
		gear = g;
	}
	
	@Override
	void showInformation(){
		super.showInformation();
		System.out.println("Vehical Gear : "+ gear);
		
		System.out.println();
	}
}
