package quiz02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Scanner;

import file.Test05;

public class MainClass {
	public static void main(String[] args) {
		
		File filePath = new File("C:/����_�����/test/aaa.txt");
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis); 
		ObjectInputStream ois = new ObjectInputStream(bis);

		Test05 t = (Test05)ois.readObject();
		
		t.print();
		HashMap<String, StudentClass> map;
		Scanner sc;
		FileClass fc = new FileClass();
		sc = new Scanner(System.in);
		map = new HashMap<String, StudentClass>();
		int num;
		while(true) {
			System.out.println("1.�л���� 2.���Ȯ��");
			num = sc.nextInt();
			switch(num) {
			case 1: System.out.println("���");
					fc.register();
					break;
			case 2: System.out.println("���Ȯ��");
					fc.members();
					break;
			
			}
		}
		
	}

}
