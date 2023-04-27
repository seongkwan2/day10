
package test.care;

import test.java.Date;
import test.java.TestClass01;
import test.java.TestClass02;
import test.java.TestClass03;

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
		
		
		test.java.Date d01 = new test.java.Date();
		d01.data();
		
		java.util.Date dd02 = new java.util.Date();
		dd.data();
		
	}
}
