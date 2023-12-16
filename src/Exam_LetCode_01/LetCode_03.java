package Exam_LetCode_01;

public class LetCode_03 {
	public static void main(String[] args) {
		System.out.println(vowelCheck("Hellow"));
		System.out.println(vowelCheck("APPLE"));
		System.out.println(vowelCheck("TV"));
		
		
		
	}
	
	public static boolean vowelCheck(String input) {
		return input.toLowerCase().matches(".*[aeiou]*");
	}

}
