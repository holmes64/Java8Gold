package chapter2;
// インタフェースでのstaticメソッドの定義と利用

interface Foo9{
	static void method() { // 暗黙的にpublicが付与される
		System.out.println("Foo : method()");
	}
}

public class Sample2_9 {
	public static void main(String[] args) {
		Foo9.method();
		// Foo9 obj = new Foo9(); obj.method(); // コンパイルエラー
	}
}
