package chapter2;

class MyClass15 implements X13, Y13 {
	@Override
	public void method() { X13.super.method(); }
}

public class Sample2_15 {
	public static void main(String[] args) {
		MyClass15 obj = new MyClass15();
		obj.method();
	}

}
