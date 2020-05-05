package chapter3;
import java.util.*;
// HashSetクラスを使用した例2

class Foo4 {
	private String str;
	public Foo4(String str) { this.str = str; }
	public String toString() { return str + " ";}
	public int hashCode() { return str.hashCode(); }
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
}
public class Sample3_4 {
	public static void main(String[] args) {
		HashSet<Foo4> set = new HashSet<Foo4>();
		Foo4 f1 = new Foo4("BBB");  set.add(f1);
		Foo4 f2 = new Foo4("AAA");  set.add(f2);
		Foo4 f3 = new Foo4("CCC");  set.add(f3);
		Foo4 f4 = new Foo4("AAA");  set.add(f4);
		System.out.println("size : " + set.size());
		for(Foo4 f : set) { System.out.println(f); }
	}
}
