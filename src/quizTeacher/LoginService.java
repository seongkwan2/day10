package quizTeacher;

import java.util.Scanner;

public class LoginService {
	//private String id, pwd;
	private LoginDTO dto = new LoginDTO();
	public int loginCheck(String inputId,String inputPwd) {
		int result = 0;
		if(inputId.equals(dto.getId() )) {
			if(inputPwd.equals(dto.getPwd() )) {
				result = 0;//로그인 성공
			}else {
				result = 1;//비밀번호 틀림
			}
		}else {
			result = -1;//존재하지 않는 아이디
		}
		return result;
	}
	public void register(String id, String password) {
		//this.id = id;
		//pwd = password;
		dto.setId(id);
		dto.setPwd( password );
	}
}














