package chapter3;
// Arraysクラスの利用

import java.util.Arrays;

public class Sample3_20 {
	public static void main(String[] args) {
		int[] ary1 = {3, 1, 2};
		print(ary1);
		System.out.println();
		Arrays.sort(ary1);
		print(ary1);
		System.out.println();
		Object[ ] ary2 = { new String("aa"), new Integer(1) };
		// Arrays.sort(ary2); // ClassCastExceptionが発生するためNG
	}

	public static void print(int[] ary) {
		for(int num : ary) { System.out.print(num + " "); }
	}
}
