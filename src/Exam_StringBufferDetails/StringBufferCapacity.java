package Exam_StringBufferDetails;

public class StringBufferCapacity {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("by Default StringBuffer capacity = "+sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println("by Default StringBuffer capacity = "+sb.capacity());
		sb.append("q");
		System.out.println("by Default StringBuffer capacity = "+sb.capacity());
		//Integer n = new Integer("String");
		
	}

}
