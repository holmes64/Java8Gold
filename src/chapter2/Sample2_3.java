package chapter2;

class Foo3{
	public void method(String... val) {
		int ans = val == null ? 0 : val.length;
		System.out.println(val + " : " + ans);
	}
}

public class Sample2_3 {
	public static void main(String[] args) {
		Foo3 obj = new Foo3();
		obj.method("A", "B");
		obj.method(null);
		obj.method((String[])null);
		obj.method();
		obj.method((String)null);
	}
}
