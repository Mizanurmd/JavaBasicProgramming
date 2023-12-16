package Exam_06;

public class Exception {
	public void divide(String nStr) {
		int a = 17;
		int nValue;
		try {
			nValue = Integer.parseInt(nStr);
			a /= nValue;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetical exception");

		} catch (NullPointerException e) {
			System.out.println("Null pointer exception");
		} catch (NumberFormatException e) {
			System.out.println("Number Format exception");
		} finally {
			System.out.println("Hellow world");
		}
	}

	public static void main(String[] args) {

		Exception exception = new Exception();
		exception.divide("0");
		exception.divide(null);
		exception.divide("1");
		exception.divide("0.1");
	}

}
