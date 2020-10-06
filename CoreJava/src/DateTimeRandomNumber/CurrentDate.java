package DateTimeRandomNumber;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
	
	public static void main(String[] args) {
		Date date = new Date();
		
		DateFormat dateformat = new SimpleDateFormat("dd/MM/YYY");
		String CD = dateformat.format(date);
		System.out.println("Current Date: "+ CD);
	}
}
         