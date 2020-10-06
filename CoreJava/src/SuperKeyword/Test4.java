//Testing overriden constructor;

package SuperKeyword;

public class Test4 {
	public static void main(String[] args) {
		
		Car volvo = new Car("Matte Black","DHK-2276","BMW",4500,16);
		volvo.showInformation();
		
		
		 Bike R16 = new Bike("Matte Grey", "BM-570", "Yamaha", "1000cc", 120, 8);
		R16.showInformation();
	}
}
