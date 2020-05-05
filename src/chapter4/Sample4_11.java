package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Sample4_11 {
	public static void main(String[] args) {
		//Supplier<Foo> obj1 = () -> new Foo();
		Supplier<Foo> obj1 = Foo::new;
		System.out.println(obj1.get().a);

		// Function<Integer, Foo> obj2 = i -> new Foo(i);
		Function<Integer, Foo> obj2 = Foo::new;
		System.out.println(obj2.apply(10).a);

		// Supplier<List<Foo>> obj4 = () -> new ArrayList<Foo>();
		Supplier<List<Foo>> obj4 = ArrayList<Foo>::new;
		System.out.println(obj4.get().size());
	}
}

class Foo{
	int a = 0;
	Foo(){ }
	Foo(int a){ this.a = a; }
}
