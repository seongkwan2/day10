package quizTeacher;

public class TimeService {
/*
	시간 설정 및 연산
*/
	//long start=0;
	//long end=0;
	//long resultTime;
	TimeDTO dto = new TimeDTO();
	public void startTime() {
		long start = System.currentTimeMillis();
		dto.setStart( start );
		System.out.println("현재 시간 얻어옴");
	}
	public void endTime() {
		dto.setEnd( System.currentTimeMillis() );
		System.out.println("종료 시간 얻어옴");
	}
	public void result() {
		//resultTime = end - start;
		dto.setResultTime( (int)(dto.getEnd() - dto.getStart()) );
		//long min = resultTime / 1000 / 60;
		//long sec = resultTime / 1000 % 60;
		long min = dto.getResultTime() / 1000 / 60;
		long sec = dto.getResultTime() / 1000 % 60;
		//System.out.println(resultTime/1000 + "초 사용");
		System.out.println(min + "분 "+sec+"초 사용");
	}
}











