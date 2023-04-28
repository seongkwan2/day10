package quizTeacher;

import java.util.Scanner;

public class TimeMainClass {
	/*
	1.시작
	2.종료
	3.사용시간 확인
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		TimeService t = new TimeService();
		while(true) {
			System.out.println("1.시작");
			System.out.println("2.종료");
			System.out.println("3.사용시간 확인");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1: 
				t.startTime();
				break;
			case 2: 
				t.endTime();
				break;
			case 3: 
				t.result();
				break;
			}
		}
	}
}
























