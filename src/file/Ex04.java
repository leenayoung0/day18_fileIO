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
		File filePath = new File("C:/����_�����/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		DataOutputStream dos = new DataOutputStream(bos);//���� ��Ʈ��(fos)�� �̿��� �� �� ���� ��ɵ�
		
		dos.writeUTF("�谳��");
		dos.writeInt(100);
		//�츮�� �������ϴ� ������ ����� �� ����
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
