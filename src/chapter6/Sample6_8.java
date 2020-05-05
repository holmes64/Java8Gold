package chapter6;
// throwsキーワードが使用されているメソッドをオーバーライド

import java.io.FileNotFoundException;
import java.io.IOException;

class Super{ void method() throws IOException{ } }

class SubA extends Super {
	void method() {} }

class SubB extends Super {
	void method() throws FileNotFoundException { } }
	
//class SubC extends Super { 
//	void method() throws Exception { } } // IOExceptionのSuperクラスをスローしているため、エラー

//class SubD extends Super {
//	void method() throws SQLException { } } // RuntimeExceptionのサブクラス出ないため、エラー
	
class SubE extends Super {
	void method() throws RuntimeException { } }
	
public class Sample6_8 {
	public static void main(String[] args) {
		System.out.println("Sample6_8");
	}
}
