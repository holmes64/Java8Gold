package chapter2;

class Super17 {
	static String x = "Super : x";
	String y = "Super : y";
	static void methodA() { System.out.println("Super : methodA()"); }
	void methodB() { System.out.println("Super : methodB()"); }
}

class Sub17 extends Super17 {
	static String x = "Sub : x";
	String y = "Sub : y";
	static void methodA() { System.out.println("Sub : methodA()"); }
	void methodB() { System.out.println("Sub : methodB()"); }
}

public class Sample2_17 {
	public static void main(String[] args) {
		Super17 obj = new Sub17();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.methodA();
		obj.methodB();
	}
}
