package chapter1;
// equalsメソッドを使用したとき
class Foo2{ }
class Bar2{ }
class Sample1_11 {
	public static void main(String[] args) {
		Foo2 f1 = new Foo2();
		Foo2 f2 = new Foo2();
		System.out.println("f1.equals(f2) : " + ( f1.equals(f2)));

		Foo2 f3 = new Foo2();
		Foo2 f4 = f3;
		System.out.println("f3.equals(f4) : " + ( f3.equals(f4)));

		Bar2 b1 = new Bar2();
		System.out.println("f3.equals(b1) : " + ( f3.equals(b1)));
		System.out.println("f3.equals(null) : " + ( f3.equals(null)));

	}
}
