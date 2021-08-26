package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		//보조 스트림 ( 한글을(깨지지 않고) 가져오기 위한 )
		//ㄴ> 이클립스 공간에 또하나의 보조 공간(저장공간)을 만들어 자기자신의 공간의 데이터를 누적시켜두고
		// 외부에 한방에 연산 결과를 출력
		File filePath = new File("C:/오전_취업반/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		
		//버퍼스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos); // 기본스트림(fos)을 이용해 보조 스트림을 만들겠다~
		
		for(char i = '1'; i < '9'; i++) {
			//Thread.sleep(1000);
			//fos.write(i); //한번에 한개씩 출력중인거
			//하나씩 처리하며 왔다갔다 하고 있는거-> 데이터가 많아지면 연산을 너무 많이 하게 됨(무리가 갈 수 있음)
			bos.write(i);
		}
		bos.close(); //닫아버리기. -> 연결 통로 아예 끊기는거라 write 다시 쓸 수 없음
		//bos.flush(); //flush:비워주세요~ 하는뜻
		//반복문 끝난 후 한방에 빵 들어옴
		//bos.write('a');
		//bos.flush();
	}

}
