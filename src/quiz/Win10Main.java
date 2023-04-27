package quiz;

import java.util.Scanner;

import temp.quiz.TempService;

public class Win10Main {
	public static void main(String[] args) {
/*
 service 생성자에 각각의 값들 전송
 1. 성능(info)
 2. 기능사용
 	1) 계산기		2)메모장		3)직접입력
 */

		Scanner scan = new Scanner(System.in);
		int menu = 0;
		boolean bool = true;
		Win10Service winS = new Win10Service();

		while(bool) {
			System.out.println("1.성능\n2.기능사용\n3.종료하기\n>>>");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				break;
			case 2:
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