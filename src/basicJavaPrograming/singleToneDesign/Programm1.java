package basicJavaPrograming.singleToneDesign;

public class Programm1 {
public static void main(String[]args) {
	for(int i =3; i < 20; i++) {
		
		System.out.println(i%3);
		
		if(i % 2 == 0) {
			i++;
		}else if( i % 3 == 0) {
			i +=2;
		}
		System.out.println("i :" + i);
	}
}

	

}
