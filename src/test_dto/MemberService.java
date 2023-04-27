package test_dto;

import java.util.Scanner;

public class MemberService {

	Scanner scan = new Scanner(System.in);
	MemberDTO dto = new MemberDTO(); //name,age 변수를 가지고 있는 클래스 임포트
	
	public void inputName() {
		System.out.println("이름 입력: ");
		String name = scan.next(); //입력을 받고
		dto.setName(name);	//setName에 바로 집어넣음
	}
	
	public void inputAge() {
		System.out.println("나이 입력: ");
		//age = scan.nextInt();
		dto.setAge(scan.nextInt());
	}
	
	public void print() {
		System.out.println("이름: "+dto.getName());
		
		int age = dto.getAge();
		System.out.println("만 나이: "+age);
	}
}
