package Exam_LamadaDetails;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> c = s->System.out.println(s);
		c.accept("Mizan");
		c.accept("Rahman");
	}

}
