package chapter2;

class Super {
	void methodA() {System.out.println("Super: methodA()");}
	static void methodB() {System.out.println("Super: medthodB()");}
}

class Sub extends Super { // サブクラス
	void methodA() { System.out.println("Sub:methodA()");}
	// static void methodA(){System.out.println("Sub:methodA()");}
	static void methodB() { System.out.println("Sub:methodB()");}
	// void methodB(){System.out.println("Sub:methodB()");}
}

public class Sample2_1 {
	public static void main(String[] args) {
		Sub obj = new Sub();
		obj.methodA();
		obj.methodB();
	}
}
