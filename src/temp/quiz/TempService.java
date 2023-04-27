package temp.quiz;
//연산을 담당한다.
//온도를 올리고 내리는 연산
//온도는 TempDTO에 있는 변수 활용
public class TempService {
	
	TempDTO dto = new TempDTO();
	public void up() {
		int t = dto.getTemp();	//값을 가져옴
		t = t+1;				//연산
		dto.setTemp(t);			//연산된것을 저장
		System.out.println("온도를 올렸습니다.");
	}
	
	public void down() {
		int t = dto.getTemp();
		t = t-1;
		dto.setTemp(t);
		System.out.println("온도를 내렸습니다.");
	}
	
	public void info() {
		int t = dto.getTemp();
		System.out.println("현재온도는: "+t+"도 입니다.");
	}

}
