package chapter2;

// 抽象クラスでのstaticメンバ定義
abstract class X7 {
	static void methodA() { System.out.println("methodA()"); }
	void methodB() { System.out.println("methodB()"); }
}

class Y7 extends X7 {}
public class Sample2_7 {
	public static void main(String[] args) {
		X7.methodA(); // OK
		// X7 obj1 = new X7(); obj1.methodB(); // NG
		Y7 obj2 = new Y7(); obj2.methodB(); // OK
	}
	
}
