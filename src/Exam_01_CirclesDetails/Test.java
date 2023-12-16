package Exam_01_CirclesDetails;

public class Test {
	public static void main(String[] args) {
		
		Citcle c = new Citcle();
		System.out.println("Radius of circle = "+ c.getRadiu()+ " Area of Circle = "+ c.getArea());
		
		Citcle c1 = new Citcle(3);
		System.out.println("Radius of circle = "+ c1.getRadiu()+ " Area of Circle = "+ c1.getArea());
		
		Citcle c2 = new Citcle(4, "Green");
		System.out.println("Radius of circle = "+ c2.getRadiu()+ "\n Area of Circle = "+ c2.getArea()+
				"\n Circle color is = "+c2.getColor());
		
		
	}

}
