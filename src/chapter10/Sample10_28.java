package chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

// collect()の利用
public class Sample10_28 {
	public static void main(String[] args){
		List<String> data = Arrays.asList("orange", "banaan", "lemon");
		List<String> list = data.parallelStream()
								.collect( () -> new CopyOnWriteArrayList<String>(),
										(plist, s) -> plist.add(s.toUpperCase()),
										(alist, blist) -> alist.addAll(blist));
		for(String s : list) { System.out.print(s + " "); }
		
		System.out.println();
		Set<String> set = 
				data.parallelStream()
					.collect(CopyOnWriteArraySet::new,
							Set::add,
							Set::addAll);
		for(String e : set) { System.out.print(e + " "); }
	}
}
