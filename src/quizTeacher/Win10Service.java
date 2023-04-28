package quizTeacher;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Win10Service {
	/*
	 생성자를 통해서 기본값 초기화
	 각각의 기능 설정
	 */
	/*
	HashMap info;
	String calc, notepad;
	String msg;
	
	public Win10Service() {
		calc="calc"; 
		notepad="notepad";
		info = new HashMap();
		info.put("메모리", "16GB");
		info.put("시스템", "64bit");
	}
	public Win10Service(String calc, String notepad, HashMap map) {
		this.calc = calc;
		this.notepad = notepad;
		info = map;
	}
	*/
	private Win10DTO dto;
	public Win10Service(String calc, String notepad, HashMap map) {
		dto = new Win10DTO();
		dto.setCalc(calc);
		dto.setInfo(map);
		dto.setNotepad(notepad);
	}
	public void view() {
		System.out.println("== 성능 ==");
		//System.out.println( info );
		//Iterator it = info.keySet().iterator();
		
		//Iterator it = dto.getInfo().keySet().iterator();
		HashMap info = dto.getInfo();
		Iterator it = info.keySet().iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + info.get(key) );
		}
		System.out.println("==========");
	}
	public void func() {
		int num;
		Scanner input = new Scanner(System.in);
		
		ProcessBuilder pro = new ProcessBuilder();
		System.out.println("1.계산기");
		System.out.println("2.메모장");
		System.out.println("3.직접입력");
		num = input.nextInt();
		if( num == 1) {
			pro.command( dto.getCalc() );
		}else if( num == 2) {
			pro.command( dto.getNotepad() );
		}else if(num == 3){
			System.out.println("명령어 입력");
			String msg = input.next();
			dto.setMsg(msg);
			//dto.setMsg( input.next() );
			pro.command( dto.getMsg() );
		}
		try {
			pro.start();
		} catch (IOException e) {
			//e.printStackTrace();
			System.err.println(dto.getMsg()+" 명령어는 존재하지 않습니다");
		}
	}
}












