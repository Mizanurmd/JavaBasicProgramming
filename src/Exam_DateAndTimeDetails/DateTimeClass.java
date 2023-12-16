package Exam_DateAndTimeDetails;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeClass {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Local Date = "+ date);
		LocalTime time = LocalTime.now();
		System.out.println("Local Time = "+ time);
	}
}
