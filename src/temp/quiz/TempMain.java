package temp.quiz;

import java.util.Scanner;

public class TempMain {
/* 보여지는 공간
 1. 온도올리기
 2. 온도내리기
 3. 현재 설정 정보
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TempService temp = new TempService();
		int menu = 0;
		boolean bool = true;
		
		while(bool) {
		System.out.println("1.온도올리기\n2.온도내리기\n3.현재 설정 정보\n4.종료하기\n>>>");
		menu = scan.nextInt();
		switch(menu) {
		case 1:
			temp.up();
			break;
		case 2:
			temp.down();
			break;
		case 3:
			temp.info();
			break;
		case 4:
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













