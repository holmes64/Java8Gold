package chapter3;
import java.util.HashSet;

class Foo3{
	private String str;
	public Foo3(String str) { this.str = str; }
	public String toString() { return str + " "; }
}

public class Sample3_3 {
	public static void main(String[] args) {
		HashSet<Foo3> set = new HashSet<Foo3>();
		Foo3 f1 = new Foo3("BBB"); set.add(f1);
		Foo3 f2 = new Foo3("AAA"); set.add(f2);
		Foo3 f3 = new Foo3("CCC"); set.add(f3);
		Foo3 f4 = new Foo3("AAA"); set.add(f4);
		System.out.println("size : " + set.size());
		for( Foo3 f : set) { System.out.println(f); }
	}
}
