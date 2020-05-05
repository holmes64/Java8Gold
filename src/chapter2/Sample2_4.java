package chapter2;

// 可変長引数とオーバーロード
class Foo4 {
	public void method(int a) {
		System.out.println("method(int a)");
	}
	public void method(long a) {
		System.out.println("method(long a)");
	}
	public void method(Integer a) {
		System.out.println("method(Integer a)");
	}
	public void method(int... a) {
		System.out.println("method(int... a)");
	}
//	public void method(int[] a) {
//		System.out.println("method(int... a)");
//	}
}

public class Sample2_4 {
	public static void main(String[] args) {
		Foo4 obj = new Foo4();
		obj.method(100);
	}
}
