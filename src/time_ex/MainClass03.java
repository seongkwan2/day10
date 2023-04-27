package time_ex;

import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) {
		//프로세스를 실행시키는 명령어
		ProcessBuilder pro = new ProcessBuilder();
		String s = "calc";
		pro.command(s);				//mspaint = 그림판
									//calc = 계산기	등등..
		
		try {
			pro.start();	//실행시키는 명령어 .start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
