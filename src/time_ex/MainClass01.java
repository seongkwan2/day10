package time_ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();	//현재 시간을 초 단위로 출력
		System.out.println(t);
		
		Date d = new Date();	//데이터베이스 형식과 맞출땐 java.sql 을 사용
		System.out.println(d);
		
		SimpleDateFormat s = 
				new SimpleDateFormat("yyyy-MM-dd일 aa hh시 mm분 ss초");	//날짜를 원하는 형식으로 바꿀수 있다.
									 //년도-월-일-오전오후 시 분 초
		
		String s_t = s.format(d);//String 자료형에다가 format으로 기능을 집어넣는다.(매개변수는 시간출력해주는거 둘중하나)
		System.out.println(s_t);
	}
}
