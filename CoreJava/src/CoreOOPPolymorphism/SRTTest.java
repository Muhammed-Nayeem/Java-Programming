//Program on dynamic polymorphism/ run time polymorphism dispatch testing;

package CoreOOPPolymorphism;

/*Test class*/

public class SRTTest {
	public static void main(String[] args) {
		
		//declering and creating object;
		/*
		Shape s = new Shape();
		Rectangle r = new Rectangle(10, 20);
		Triangle t = new Triangle(20, 10);
		
		System.out.println("Shape s1 : "+ s.area());
		System.out.println("Shape s2 : "+ r.area());
		System.out.println("Shape s3 : "+ t.area());
		*/
		/*
		Shape s1 = new Shape();
		Shape s2 = new Rectangle(20, 10);
		Shape s3 = new Triangle(10, 20);
		
		System.out.println("Shape s1 : "+ s1.area());
		System.out.println("Shape s2 : "+ s2.area());
		System.out.println("Shape s3 : "+ s3.area());
		*/
		
		Shape[] Sh = new Shape[3];
		
	    Sh[0] = new Shape();
		Sh[1] = new Rectangle(20, 10);
		Sh[2] = new Triangle(10, 20);
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(Sh[i].area());
		}
	}
}
