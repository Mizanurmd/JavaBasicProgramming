package Exam_DateAndTimeDetails;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDetails {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId ld = ZoneId.of("America/Los_Angeles");
		ZonedDateTime  dt = ZonedDateTime.now(ld);
		System.out.println("Now American time = "+ dt);
		
		
		
		
		
	}

}
