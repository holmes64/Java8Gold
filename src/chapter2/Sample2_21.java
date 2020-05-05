package chapter2;

class Outer21 { // 外側のクラス
	private int num = 100;
	class A {
		public int num = 200;
		void method(int num) {
			System.out.println("num : " + num);
			System.out.println("this.num : " + this.num);
			System.out.println("Outher21.this.num : " + Outer21.this.num);
		}
	}
}

public class Sample2_21 { // 外部のクラス
	public static void main(String[] args) {
		new Outer21().new A().method(300);
	}
}
