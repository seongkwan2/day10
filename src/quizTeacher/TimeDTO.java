package quizTeacher;

public class TimeDTO {
	private long start;
	private long end;
	private int resultTime;
	//각 set, getter생성
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}
	public int getResultTime() {
		return resultTime;
	}
	public void setResultTime(int resultTime) {
		this.resultTime = resultTime;
	}
	
}
