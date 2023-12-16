package Exam_06;

public class CountSpecialCharacter {
	public static void main(String[] args) {
		
		String s = "java@#!";
		String removeSpecial ="";
		int c =0;
		
		for(int i =0; i<s.length(); i++) {
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
				&& !Character.isWhitespace(s.charAt(i))) {
				c++;
				System.out.print(s.charAt(i));
				
			}
			else {
				removeSpecial = removeSpecial + s.charAt(i);
			}
		}
		System.out.println();
		if(c ==0) {
			System.out.println("There are no special Character");
		}else {
			System.out.println("Special Characters are ="+ c);
		}
		System.out.println("String is printed without Special Character = "+removeSpecial);	}

}
