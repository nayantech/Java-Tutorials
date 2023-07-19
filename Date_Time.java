package program;
import java.time.*;

// To perform Date Time?

public class Date_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		System.out.println("Date is "+d);
		
		LocalTime t = LocalTime.now();
		System.out.println("Time is "+t);
		
		LocalDateTime ref = LocalDateTime.now();
		System.out.println("Date And Time is "+ref);
		
		LocalDateTime ldt=ref.withDayOfMonth(10).withYear(2001);
		System.out.println(ldt);
	}

}