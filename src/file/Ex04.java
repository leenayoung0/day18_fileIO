package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/오전_취업반/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		DataOutputStream dos = new DataOutputStream(bos);//기존 스트림(fos)을 이용해 좀 더 많은 기능들
		
		dos.writeUTF("김개똥");
		dos.writeInt(100);
		//우리가 알지못하는 값으로 저장될 수 있음
		dos.close();
		
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		String name = dis.readUTF();
		int num = dis.readInt();
		System.out.println("name : "+name);
		System.out.println("num : "+num);
		
		
	}

}
