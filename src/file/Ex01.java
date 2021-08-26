package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/오전_취업반/test/aaa.txt");// 경로 만들기
		FileOutputStream fos = new FileOutputStream(filePath, true);// 통로 만들기(자바->외부: output)
															//true -> 기존꺼 지우지 않고 유지한채로 이어쓰도록
		
		fos.write(97); //byte
		fos.write('A'); //byte
		
		String name = "반갑다";
		fos.write(name.getBytes()); //byte형태로 변환해준다
		
		
		Scanner input = new Scanner(System.in); // 대상이 콘솔, file은 대상이 파일
		
		
	}

}
