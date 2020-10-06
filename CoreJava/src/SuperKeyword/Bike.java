//overriden constructor and call by super keyword;

package SuperKeyword;

public class Bike extends Car {
	//here comes all the property of Vehical calss and Car class bt this property is invisible;
	
	String milez;
	
	//Creating Constructor;
	Bike(String c, String np, String b, String m, double w, int g){
		
		super(c, np, b, w, g);
		milez = m;
	}
	
	@Override
	void showInformation(){
		super.showInformation();
		System.out.println("Vehical Milez : "+ milez);
	}
}
