package quizTeacher;

import java.util.Scanner;

public class LoginMainClass05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	String id=null, pwd=null;
	String inputId=null, inputPwd=null;
	
	LoginService login = new LoginService();
	
	while(true) {
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.종료");
		System.out.print(">>> : ");
		num = input.nextInt();
		switch(num) {
		case 1:
			
			System.out.println("아이디 입력");
			inputId = input.next();
			System.out.println("비밀번호 입력");
			inputPwd = input.next();
			
			int result = login.loginCheck(inputId, inputPwd);
			
			if(result == 0) {
				System.out.println("인증 통과");
			}else if(result == 1) {
				System.out.println("비밀번호가 틀렸습니다");
			}else {
				System.out.println("존재하지 않는 아이디입니다");
			}
			
			
			
			break;
		case 2:
			
			System.out.println("저장할 아이디 입력");
			id = input.next();
			System.out.println("저장할 비밀번호 입력");
			pwd = input.next();
			
			login.register(id, pwd);
			
			System.out.println("저장완료");
			break;
		case 3:break;
		}
	}
}
}








