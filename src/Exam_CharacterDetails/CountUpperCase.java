package Exam_CharacterDetails;

public class CountUpperCase {
	public static void main(String[] args) {
		String name ="Mizanu Rahman";
		int count =0;
		int l =0;
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
			}else {
				l++;
			}
		}
		System.out.println("UpperCase Number = "+ count);
		System.out.println("LowerCase Number = "+ l);
		
	}

}
