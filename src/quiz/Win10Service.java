package quiz;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Win10Service {
	/*
	 생성자를 통해서 기본값 초기화
	 각각의 기능 설정
	 */

	Win10DTO dto = new Win10DTO();
	Scanner scan = new Scanner(System.in);
	ProcessBuilder pro = new ProcessBuilder();
	
	public Win10Service(String calc, String notepad, HashMap map) {
		dto.setCalc(calc);
		dto.setNotepad(notepad);
		dto.setInfo(map);//각각의 인자 다시 셋팅
	}//service 생성자
	
	public void view() {
		System.out.println(dto.getInfo());
	}
	
	public void calc() {
		String calc = dto.getCalc();
		System.out.println("계산기 실행");
		pro.command(calc);
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void notepad() {
		String notepad = dto.getNotepad();
		System.out.println("메모장 실행");
		pro.command(notepad);
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void msg() {
		System.out.println("직접입력 합니다\n>>>");
		String msg = scan.next();
		pro.command(msg);
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		
	
	
	
		
		

	



}
