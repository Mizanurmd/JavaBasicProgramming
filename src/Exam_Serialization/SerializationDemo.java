package Exam_Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Sizan","Adabor-10","0122223333");
		
		
		System.out.println(s1);
		//========== location where i want to save file
		String file = "C:\\Users\\Md. Mizanur Rahman\\Documents\\StudentSerialization\\studSerializ.txt";
		
		//=================== converting object into byte stream========//
		try {
		FileOutputStream fiOut = new FileOutputStream(file);
		ObjectOutputStream objOut = new ObjectOutputStream(fiOut);
		objOut.writeObject(s1);
		fiOut.close();
		objOut.close();
		System.out.println("Object is converted into byte stream and save in the file location.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
