package chapter6;

import java.io.IOException;

// throwsの使用例
public class Sample6_5 {
	public static void main(String[] args) {
		try {
			methodA();
			methodB();
		} catch(ArrayStoreException | IOException e){ 
			System.out.println(e);
		}
	}
	
	static void methodA() throws ArrayStoreException{
		// static void methodA(){ // 12行目の代わりにこの書き方でもOK
		throw new ArrayStoreException();
	}
	static void methodB() throws IOException{
		// static void methodB(){ // これはコンパイルエラー
		throw new IOException();
	}
}
