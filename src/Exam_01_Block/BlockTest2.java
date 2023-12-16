package Exam_01_Block;

public class BlockTest2 {
	static {
		System.out.println("It is static block-1.");
	}
	
	BlockTest2(){
		System.out.println("It is constructor block");
	}
	
	{
		System.out.println("It is none static block.");
	}
	
	
	public static void main(String[] args) {
		BlockTest2 t = new BlockTest2();
		
	}
	

}
