package Exam_DateAndTimeDetails;
import java.time.*;
public class CustomDateAndTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("=================Customize Date=================");
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println(dd +"-"+ mm +"-"+ yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		System.out.println("=================Customize Time=================");
		
		LocalTime time = LocalTime.now();
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("%d:%d:%d:%d",h,m,s,n);
		System.out.println();
		System.out.printf("%d:%d:%d",h,m,s);
		System.out.println();
		System.out.printf("%d:%d",h,m);
		System.out.println();
		System.out.printf("%d",h);
		
		
	}

}
