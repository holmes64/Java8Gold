package chapter6;
// 例外処理rethrow
class MyExceptionA extends Exception {
	String msgA = "MyExceptionA";
}

class MyExceptionB extends Exception {
	String msgB = "MyExceptionB";
}

public class Sample6_7 {
	public static void main(String[] args) {
		try {
			method();
		}catch(MyExceptionA e) {
			System.out.println(e.msgA);
		}catch(MyExceptionB e) {
			System.out.println(e.msgB);
		}
	}
	public static void method() throws MyExceptionA, MyExceptionB{
		int a = 10;
		try {
			if(a == 0) {
				throw new MyExceptionA();
			}else {
				throw new MyExceptionB();
			}
		// Java SE7以降のコンパイラであればコンパイルは成功する。
		}catch(Exception e) {
			// 例外が起きた際の,method()側で行うべき処理
			// 処理が終わったら、例外をスローする
			throw e;
		}
		// java6までは以下のように書かなければうまく処理ができない
//	}catch(MyExceptionA e) {
//		// 例外が起きた際の,method()側で行うべき処理
//		// 処理が終わったら、例外をスローする
//		throw e;
//	}catch(MyExceptionB e) {
//		// 例外が起きた際の,method()側で行うべき処理
//		// 処理が終わったら、例外をスローする
//		throw e;
//	}
	}
}
