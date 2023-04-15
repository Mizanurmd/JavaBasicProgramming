package basicJavaPrograming.programmer1;

public class SwapThreeNumber {
	public static void main(String[] args) {
		int a, b, temp;
		a = 100;
		b = 200;
		System.out.println("================ Before Swap Number=================");
		System.out.println("Value of A = " + a + "\nValue of B = " + b);

		System.out.println("===============After Swap Number =========================");

		temp = a;
		a = b;
		b =temp;

		System.out.println("Value of A = " + a + "\nValue of B = " + b);

	}

}
