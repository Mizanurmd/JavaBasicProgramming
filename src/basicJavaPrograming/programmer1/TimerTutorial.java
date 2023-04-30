package basicJavaPrograming.programmer1;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTutorial {
	public static void main(String[]args) {
		
		TimerTutorial tutorial = new TimerTutorial();
		tutorial.runTimer();
		
	}
		Timer timer = new Timer();
		int i = 0;
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				String time = getTime(i);
			System.out.println(time);
				i++;
			}
		};
		
		public void runTimer() {
			timer.schedule(task, 0, 1000);
		}
		
	static String getTime(int sec) {
		int hours = 0;
		int reminderOfHours =0;
		int munites = 0;
		int seconds =0;
		
		/// if we have an hour or more
		
		if(sec >=3600) {
			hours = sec/3600;
			reminderOfHours = sec % 3600;
			if(reminderOfHours >=60) {
				munites = reminderOfHours/60;
				seconds = reminderOfHours %60;
				
			}else {
				seconds = reminderOfHours;
			}
		}else if(sec >=60) {
			hours = 0;
			munites =sec/60;
			seconds =sec %60;
		}
		else if(sec < 60) {
			hours = 0;
			munites = 0;
			seconds = sec;
		}
		
		String strHours;
		String strMinus;
		String strSecs;
		if(seconds < 10) 
			strSecs = "0"+ Integer.toString(seconds);
			else 
				strSecs = Integer.toString(seconds);	
			
		if(munites < 10)
			strMinus = "0"+ Integer.toString(munites);
		else
			strMinus = Integer.toString(munites);
				
		if(hours < 10)
			strHours = "0" + Integer.toString(hours);
		else
			strHours = Integer.toString(hours);
		
		String time = strHours + ":" + strMinus + ":" + strSecs ;
		
		return time;
		
	}

}
