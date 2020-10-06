//Using super keyword for constructor;

package SuperKeyword;

public class BonsCons extends CONS {
	//CONS(); -> Invisible here;
	
	BonsCons(){
		super();
		System.out.println("Inside 'BonsCons' constructor");
	}
}
