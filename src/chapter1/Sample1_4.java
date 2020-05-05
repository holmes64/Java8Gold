package chapter1;
// final修飾子を使用した変数定義の例
class Foo {
	final int num1 = 10;
	final int num2;
	Foo(int i) {num2 = i;}
}


public class Sample1_4 {
	public static void main(String[] args) {
		final Foo obj1 = new Foo(100);
		// obj1.num1 = 20; // コンパイルエラー
		// obj1 = new Foo(300); // コンパイルエラー
		Foo obj2 = new Foo(300);
		System.out.println("obj1.num1 : " + obj1.num1);
		System.out.println("obj2.num2 : " + obj2.num2);
	}
}
