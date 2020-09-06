package week_01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Current date and time is : " + date);
	 
		DateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
		String CurrentDate = dateFormat.format(date);
		System.out.println("Current date : " + CurrentDate);
	 
	}

}
