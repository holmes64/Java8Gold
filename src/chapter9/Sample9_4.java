package chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;

// subpath()メソッドの使用
public class Sample9_4 {
	public static void main(String[] args){
//		Path path = Paths.get("C:\\sample\\Chap09\\ren\\9_1.txt");
		Path path = Paths.get("/sample/Chap09/ren/9_1.txt");
		System.out.format("1-4     : %s%n", path.subpath(1, 4));
		System.out.format("0-2     : %s%n", path.subpath(0, 2));
//		System.out.format("0-5     : %s%n", path.subpath(0, 5));
//		System.out.format("2-2     : %s%n", path.subpath(2, 2));
	}
}
