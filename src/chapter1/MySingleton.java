package chapter1;
// シングルトンパターン
public class MySingleton {
	private static final MySingleton instance = new MySingleton();
	private MySingleton() {}
	public static MySingleton getInstance() {
		return instance;
	}
}
