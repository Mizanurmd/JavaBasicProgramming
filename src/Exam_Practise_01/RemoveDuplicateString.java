package Exam_Practise_01;



public class RemoveDuplicateString {
	public static void main(String[] args) {
		String name = "Programming";
		
		// Approach -01
		StringBuilder sb = new StringBuilder(name);
	
		name.chars().distinct().forEach(e->sb.append((char)e));
		System.out.println(sb);
		
	}

}
