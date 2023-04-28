package quizTeacher;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WinMainClass {
/*
 service 생성자에 각각의 값들 전송
 1.성능(info)
 2.기능사용
   1) 계산기 2)메모장 3)직접입력
 */
	public static void main(String[] args) {
		
		//Win10Service win10 = new Win10Service();
		
		
		HashMap info = new HashMap();
		info.put("메모리", "16GB");
		info.put("시스템", "64bit");
		
		Win10Service win10 = 
				new Win10Service("calc","notepad",info);
		
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.성능");
			System.out.println("2.기능");
			System.out.print(">>> : ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				win10.view();
				break;
			case 2:
				win10.func();
				break;
			}
		}
	}
}
























