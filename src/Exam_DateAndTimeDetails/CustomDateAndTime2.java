package Exam_DateAndTimeDetails;

import java.time.LocalDateTime;

public class CustomDateAndTime2 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yy = dt.getYear();
		System.out.printf("Date: %d-%d-%d",dd,mm,yy);
		System.out.println();
		
		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		System.out.printf("Time: %d:%d:%d",h,m,s);
		
	}

}
