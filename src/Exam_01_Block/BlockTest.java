package Exam_01_Block;

public class BlockTest {
	
	static {
		System.out.println("It is static block-1.");
	}
	{
		System.out.println("It is none static block.");
	}
	BlockTest(){
		System.out.println("It is constructor block");
	}
	
	static {
		System.out.println("It is static block-2.");
	}
	
	public static void main(String[] args) {
		BlockTest t = new BlockTest();
		
	}

}
