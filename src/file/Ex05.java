package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/오전_취업반/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		
		//객체를 사용할때는 Object 스트림을 써야함
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = input.next();
		
		Test05 t = new Test05();
		t.setName(name);
		
		oos.writeObject(t); //직열화가 되지 않아서 그냥 쓰면 오류남 -> 상속 하나 받아주면됨
		//ㄴ> Test05에 implements Serializable 
		//파일에는 객체 자체를 넣을 수 없음. 텍스트 형태로 들어와야하니까
		//그래서 방법을 만든게 byte형태로 저장해서 넣는거
		//=> 우리가 알아볼수 없는 형태로 
		oos.close();
	}

}
