// Super keyword program part 01;

package SuperKeyword;

public class B extends A {
	// int x = 10; -> invisible here;
	int x = 5;
	
	//printing x = 10 by super keyword;
	void dispaly(){
		System.out.println(super.x);
	}
}
