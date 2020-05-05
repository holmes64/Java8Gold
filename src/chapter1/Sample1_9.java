package chapter1;
// 抽象メソッドを使用下例
enum Vals {
	//A, B; // コンパイルエラー
	A{ void foo() { System.out.println("A"); } },
	B{ void foo() { System.out.println("B"); } };
	abstract void foo();
}

public class Sample1_9 {
	public static void main(String[] args) {
		Vals obj = Vals.A;
		obj.foo();
	}
}
