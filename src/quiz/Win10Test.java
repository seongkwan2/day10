package quiz;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Win10Test {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		ProcessBuilder pro = new ProcessBuilder();
		int menu = 0,
			menu2 = 0;
		
		boolean bool = true;

		Win10DTO dto = new Win10DTO();

		while(bool) {
			System.out.println("1.성능\n2.기능사용\n3.종료하기\n>>>");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				LinkedHashMap<String, String> map = new LinkedHashMap<>();
				HashMap info = dto.getInfo();	//HashMap 으로 캐스팅해야됨
				map.put("프로세서","i7-7700");
				map.put("램", "16GB");

				dto.setInfo(map);
				for (String key : map.keySet()) {
					System.out.println(key + ": " + map.get(key));
				}
				break;
			case 2:
				System.out.println("기능을 입력하세요\n>>>");
				menu2 = scan.nextInt();
				switch(menu2) {
				case 1:
					dto.getCalc();
					System.out.println("계산기 실행");
					String calc = "calc";
					pro.command(calc);
					try {
						pro.start();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					break;

				case 2:
					dto.getNotepad();
					System.out.println("메모장 실행");
					String notepad = "notepad";
					pro.command(notepad);
					try {
						pro.start();
					} catch (IOException e) {
						e.printStackTrace();
					}
				case 3:
					System.out.println("직접입력 합니다\n>>>");
					dto.getMsg();
					String msg = scan.next();
					pro.command(msg);
					try {
						pro.start();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				bool = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다.\n");
				break;


			}
		}
	}
}