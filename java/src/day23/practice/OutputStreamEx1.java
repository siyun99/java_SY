package day23.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputStreamEx1 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output1.txt")){
			for(int i = 1; i<=10; i++) {
				fos.write(i);
			}
			System.out.println("File writer success!!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try(
			FileOutputStream fos = new FileOutputStream("output2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeChars("Hello\n");
			for(int i = 1; i<=10; i++) {
				oos.writeInt(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
