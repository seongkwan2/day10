package temp.quiz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

import quiz.Win10DTO;

public class Win10Test {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
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
				System.out.println("출력");
				break;
			case 2:
				System.out.println("기능을 입력하세요\n>>>");
				menu2 = scan.nextInt();
				switch(menu2) {
				case 1:
					dto.getCalc();
					ProcessBuilder pro = new ProcessBuilder();
					System.out.println("프로그램실행");
					String s = "calc";
					pro.command(s);
					break;

				case 2:
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