package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		File filePate = new File("C:/����_�����/test/aaa.txt");
		FileInputStream fis = new FileInputStream(filePate);
		while (true) {
			int res = fis.read(); 
			if(res < 0) {//������ ���� ������ ������ -1�� ����
				System.out.println("res : "+res);
				break;
			}
			System.out.println((char)res);
		}
		
	}

}
