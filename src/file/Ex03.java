package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		//���� ��Ʈ�� ( �ѱ���(������ �ʰ�) �������� ���� )
		//��> ��Ŭ���� ������ ���ϳ��� ���� ����(�������)�� ����� �ڱ��ڽ��� ������ �����͸� �������ѵΰ�
		// �ܺο� �ѹ濡 ���� ����� ���
		File filePath = new File("C:/����_�����/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		
		//���۽�Ʈ��
		BufferedOutputStream bos = new BufferedOutputStream(fos); // �⺻��Ʈ��(fos)�� �̿��� ���� ��Ʈ���� ����ڴ�~
		
		for(char i = '1'; i < '9'; i++) {
			//Thread.sleep(1000);
			//fos.write(i); //�ѹ��� �Ѱ��� ������ΰ�
			//�ϳ��� ó���ϸ� �Դٰ��� �ϰ� �ִ°�-> �����Ͱ� �������� ������ �ʹ� ���� �ϰ� ��(������ �� �� ����)
			bos.write(i);
		}
		bos.close(); //�ݾƹ�����. -> ���� ��� �ƿ� ����°Ŷ� write �ٽ� �� �� ����
		//bos.flush(); //flush:����ּ���~ �ϴ¶�
		//�ݺ��� ���� �� �ѹ濡 �� ����
		//bos.write('a');
		//bos.flush();
	}

}
