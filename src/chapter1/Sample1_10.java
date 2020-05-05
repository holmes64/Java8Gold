package chapter1;
// toStringメソッドを使用したとき
class Hoge{ }
class Bar{ 
	public String toString() {
		return "This is an object made from Bar.";
	}
}

public class Sample1_10 {
	public static void main(String[] args) {
		int[] ary = {1, 2};
		String obj1 = "tanaka";
		Hoge obj2 = new Hoge();
		Bar obj3 = new Bar();
		System.out.println(ary);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
