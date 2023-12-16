package Exam_06;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Static {
	private static int value;

	public Static(int v) {
		value = v;
	}

	public void inc(int inc) {
		Static.value += inc;
	}

	public int get() {
		return Static.value;
	}

	public static void main(String[] args) {
		Static a = new Static(-35);
		Static b = new Static(5);
		Static c = new Static(100);
	
		b.inc(13);

		System.out.println(b.get());
		System.out.println("==========================");
		b.inc(17);

		System.out.println(b.get());
		System.out.println("==========================");
		b.inc(23);

		System.out.println(b.get());
		System.out.println(a.get());
		System.out.println(c.get());
		
	}
}
