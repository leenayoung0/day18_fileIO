package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		File filePate = new File("C:/오전_취업반/test/aaa.txt");
		FileInputStream fis = new FileInputStream(filePate);
		while (true) {
			int res = fis.read(); 
			if(res < 0) {//파일의 끝에 보이지 않지만 -1로 끝남
				System.out.println("res : "+res);
				break;
			}
			System.out.println((char)res);
		}
		
	}

}
