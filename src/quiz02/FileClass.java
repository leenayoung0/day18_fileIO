package quiz02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import file.Test05;

public class FileClass {
	private FileInputStream fis;
	private BufferedInputStream bis;
	private ObjectInputStream ois;
	private FileOutputStream fos;
	private BufferedOutputStream bos;
	private ObjectOutputStream oos;
	private File filepath;
	
	public FileClass() {
		filepath = "C:/����_�����/test/aaa.txt";
	}
	private HashMap<String, StudentClass> map;
	private Scanner sc;
	public FileClass() {
		sc = new Scanner(System.in);
		map = new HashMap<String, StudentClass>();
	}
	public void members() {
		if(map.size() != 0) {
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				StudentClass ss = map.get(it.next());
				System.out.println("�̸�: "+ss.getName());
				System.out.println("����: "+ss.getAge());
				System.out.println("�ּ�: "+ss.getAddr());
				System.out.println("---------------------");
			}
		}
		else
			System.out.println("���� ������ ����");
	}
	public void register() {
		StudentClass s =new StudentClass();
		String name, addr;
		int age;
		
		if(map.size() != 0) {
			while(true) {
				System.out.println("�̸��Է�");
				name = sc.next();
				if(map.containsKey(name)) {
					System.out.println("�̹� ��ϵ� �̸��Դϴ�");
					continue;
				}
				break;
			}
		}else {
			System.out.println("�̸��Է�");
			name = sc.next();
			System.out.println("�����Է�");
			age = sc.nextInt();
			System.out.println("�ּ��Է�");
			addr = sc.next();
			
			s.setAddr(addr); s.setName(name); s.setAge(age);
			map.put(name, s);
			
			System.out.println("����Ϸ�");
		}
		
	}

}
