package chapter2;
// MyClassクラスはコンパイルエラーとなるが、以下のようにmethod()メソッドを
// オーバーライドすることでコンパイルと実行は可能となる
class MyClass14 implements X13, Y13{
	@Override
	public void method() { System.out.println("MyClass14"); }
}

public class Sample2_14 {
	public static void main(String[] args) {
		MyClass14 obj = new MyClass14();
		obj.method();
	}
}
