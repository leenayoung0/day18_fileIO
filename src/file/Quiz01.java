package file;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		File filePath = new File ("C:/오전_취업반/test/abcd1234/test.txt");
		FileOutputStream fos = new FileOutputStream(filePath, true);
		
		Scanner input = new Scanner(System.in);
		String name = input.next();
		String age = input.next();
		String addr = input.next();
		name + "\n";
		fos.write(name.getBytes());
		fos.write(age.getBytes());
		fos.write(addr.getBytes());
	}

}
