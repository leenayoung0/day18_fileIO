package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/����_�����/test/aaa.txt");// ��� �����
		FileOutputStream fos = new FileOutputStream(filePath, true);// ��� �����(�ڹ�->�ܺ�: output)
															//true -> ������ ������ �ʰ� ������ä�� �̾����
		
		fos.write(97); //byte
		fos.write('A'); //byte
		
		String name = "�ݰ���";
		fos.write(name.getBytes()); //byte���·� ��ȯ���ش�
		
		
		Scanner input = new Scanner(System.in); // ����� �ܼ�, file�� ����� ����
		
		
	}

}
