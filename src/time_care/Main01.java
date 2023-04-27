package time_care;

//import time_java.TestClass01;
//import time_java.TestClass02;
//import time_java.TestClass03;
import time_java.*;	//*을 넣음으로 한방에 해결

public class Main01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.test();
		t.num = 111;
		
		TestClass01 t01 = new TestClass01();	//다른패키지에 있으면 import
		t01.test();
		
		TestClass02 t02 = new TestClass02();
		TestClass03 t03 = new TestClass03();
		
		Date dd = new Date();
		dd.data();
		
		//test.date.Date dd = new test.date.Date();
		//dd.data();
		
		//test.java.Date d01 = new test.java.Date();
		//d01.data();
		
		//test.date.Date dd = new test.java.Date();
		//dd.data();
		
	}
}
