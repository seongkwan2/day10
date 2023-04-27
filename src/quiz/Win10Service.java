package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Win10Service {
	/*
	 생성자를 통해서 기본값 초기화
	 각각의 기능 설정
	 */
	Win10DTO dto = new Win10DTO();
	

	public Win10Service() {
		HashMap info = dto.getInfo();
		HashMap<String, String> map = new HashMap<>();
		map.put("프로세서","i7-7700");
		
		dto.setInfo(map);
		for(int i=1; i<=map.size(); i++) {
			System.out.println(info);
		}
		System.out.println("출력");
		

	}

	public Win10Service(String calc) {
		Win10DTO dto = new Win10DTO();

	}

	//public Win10Service(String notepad) {

	//}

	//public Win10Service(String msg) {
		
	//}

}
