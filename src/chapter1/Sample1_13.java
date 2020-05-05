package chapter1;
// equalsメソッドとhashCodeメソッドのオーバーライド
class Foo4 {
	private int num;
	public boolean equals(Object o) {
		if(( o instanceof Foo4) && (((Foo4)o).num == this.num )) {
			return true;
		}else {
			return false;
		}
	}
	public int hashCode() {
		return num * 5;
	}
}

public class Sample1_13 {
	public static void main(String[] args) {
		Foo4 f1 = new Foo4();
		Foo4 f2 = new Foo4();
		System.out.println("f1.equals(f2) : " + ( f1.equals(f2)));
	}
}
