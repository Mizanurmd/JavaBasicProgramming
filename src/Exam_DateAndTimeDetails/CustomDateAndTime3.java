package Exam_DateAndTimeDetails;

import java.time.LocalDateTime;
import java.time.Month;


public class CustomDateAndTime3 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(1991,Month.FEBRUARY,10, 12,45);
		System.out.println(dt);
	}

}
