package chapter3;
// ジェネリクスを用いたメソッド定義

class Gen2{
	private String var1 = "aaa";
	public <T> T method(T value) { return value; }
	public String getVar1() { return var1; }
}

public class Sample3_14 {
	public static void main(String[] args) {
		Gen2 g = new Gen2();
		Integer i = g.method(1);
		System.out.println(i);
		String s1 = g.method("ABC");
		String s2 = g.<String>method("abc"); // ここの型パラメータリストのキャストは必須ではない
		System.out.println(s1 + " " + s2);
	}
}
