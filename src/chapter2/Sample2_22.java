package chapter2;

class Outer22{
	private static int a = 1; // static変数
	private int b = 2; // インスタンス変数
	void methodOuter(final int c, int d) {
		final int e = 5;
		int f = 6;
		class A {
			void method() {
				System.out.println(a + " ");
				System.out.println(b + " ");
				System.out.println(c + " ");
				System.out.println(d + " ");
				System.out.println(e + " ");
				System.out.println(f);
				// e = 100;
				// f = 100;
			}
		}
		new A().method();
	}
}

public class Sample2_22 {
	public static void main(String[] args) {
		Outer22 o = new Outer22();
		o.methodOuter(3, 4);
	}
}
