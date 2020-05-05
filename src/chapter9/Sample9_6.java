package chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;

// resolve()メソッドの利用
public class Sample9_6 {
	public static void main(String[] args){
		Path path1 = Paths.get("ren/../Chap09");
		Path path2 = Paths.get("X");
		System.out.format("resolve : %s%n", path1.resolve(path2));
		
		Path path3 = Paths.get("C:\\sample");
		System.out.format("resolve : %s%n", path1.resolve(path3));
		Path path = Paths.get("C:\\sample\\Chap09");
	}
}
