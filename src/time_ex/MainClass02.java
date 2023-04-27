package time_ex;

public class MainClass02 {
	public static void main(String[] args) {
		
		System.out.println("시작");
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(3000);	//sleep(시간); (1000 = 1초 만큼 딜레이시킴)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		
		System.out.println("끝");
		System.out.println((end - start) / 1000);	//사용시간
	}
}
