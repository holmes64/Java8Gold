package chapter4;

import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

// ToIntFunctionとIntToDoubleFunctionのインタフェース
public class Sample4_14 {
	public static void main(String[] args) {
		// ToIntFunction<String> obj1 = s -> s.length();
		ToIntFunction<String> obj1 = (String s) -> {return s.length();};
		System.out.println(obj1.applyAsInt("Java"));
		
		// IntToDoubleFunction obj2 = i -> i + Math.random();
		IntToDoubleFunction obj2 = (int i) -> {return Math.random();};
//		IntToDoubleFunction obj2 = (Integer i) -> {return Math.random();};
		System.out.println(obj2.applyAsDouble(5));
	}
}
