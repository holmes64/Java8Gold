package chapter3;
import java.util.*;

public class Sample3_5 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("C");  set.add("A");  set.add("B");
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) { System.out.println(iter.next() + " "); }
	}
}
