package Exam_02;

public class TestFunctional {
	public static void main(String[] args) {
		//=========== using Lamda function========//
		FunctionalTest re = (int a, int b)->{
			return a + b;
		};
		
		System.out.println(re.addTest(20, 30));
		
		//======== Another way=======
		FunctionalTest te = new FunctionalTest() {
			
			@Override
			public int addTest(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
		System.out.println(te.addTest(500, 800));
	}

}
