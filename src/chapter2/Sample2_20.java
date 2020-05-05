package chapter2;

public class Sample2_20 { // 外側のクラス
	class A { // 非staticクラス
		void methodA() {System.out.println("methodA()"); }
	}
	
	static class B { // staticクラス
		static void methodB() { System.out.println("methodB()"); }
	}
	
	public static void main(String[] args) {
		new Sample2_20().new A().methodA(); // new A().methodA(); はNG
		new Sample2_20.B().methodB(); // new B().methodB(); でもOK
		Sample2_20.B.methodB(); // B.methodB(); でもOK
	}
}
