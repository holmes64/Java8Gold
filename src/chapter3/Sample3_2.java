package chapter3;

import java.util.HashSet;
import java.util.TreeSet;

// HashSetとTreeSetクラスを使用した例
public class Sample3_2 {
	public static void main(String[] args) {
		String[] ary = {"CCC", "AAA", "BBB"};
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(ary[0]);
		hashSet.add(ary[1]);
		hashSet.add(ary[2]);
		hashSet.add(ary[0]);
		System.out.println("HashSet size :" + hashSet.size());
		for(String s : hashSet) { System.out.println(s + " "); }
		System.out.println();

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add(ary[0]);
		treeSet.add(ary[1]);
		treeSet.add(ary[2]);
		treeSet.add(ary[0]);
		System.out.println("TreeSize size : " + treeSet.size());
		for(String s : treeSet) { System.out.println(s + " "); }

	}
}
