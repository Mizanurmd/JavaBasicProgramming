package Exam_Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) {
		//========== location where i want to save file
				String file = "C:\\Users\\Md. Mizanur Rahman\\Documents\\StudentSerialization\\studSerializ.txt";
				
				//=================== converting byte Stream into byte Objects========//
				try {
				FileInputStream filIn = new FileInputStream(file);
				ObjectInputStream obIn = new ObjectInputStream(filIn);
				Student s = (Student)obIn.readObject();
				System.out.println("Byte Strean reads into object here ========");
				System.out.println(s);
				filIn.close();
				obIn.close();
				
				
				}catch(Exception e) {
					System.out.println(e);
				}
				
				
	}

}
