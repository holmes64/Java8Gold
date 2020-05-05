package chapter1;
// hashCodeメソッドを使用したとき
class Foo3 { String str = "Hello"; }

public class Sample1_12 {
	public static void main(String[] args) {
		Foo3 f1 = new Foo3(); 
		Foo3 f2 = new Foo3();
		System.out.println("f1 : " + f1.hashCode());
		System.out.println("f2 : " + f2.hashCode());

		Foo3 f3 = new Foo3();
		Foo3 f4 = f3;
		System.out.println("f3 : " + f3.hashCode());
		System.out.println("f4 : " + f4.hashCode());

	}
}
