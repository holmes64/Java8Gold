package chapter3;
// 継承を用いたジェネリクス

class Gen3<T extends Number> {
	private T var;
	public Gen3(T var) { this.var = var; }
	public void display() { System.out.println(var); }
}

// 利用する側のクラス
public class Sample3_16 {
	public static void main(String[] args) {
		// Integerを圧合うGen3オブジェクトの生成
		Gen3<Integer> g1 = new Gen3<>(100);
		g1.display();
		
		// Doubleを扱うGen3オブジェクトの生成
		Gen3<Double> g2 = new Gen3<>(3.14);
		g2.display();
	}
}
