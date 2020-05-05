package chapter9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// getAttribute()メソッドの使用例
public class Sample9_12 {
	public static void main(String[] args) throws java.io.IOException {
		Path path = Paths.get("ren/9_12.txt");
		Object obj1 = Files.getAttribute(path, "creationTime");
		Object obj2 = Files.getAttribute(path, "lastModifiedTime");
		Object obj3 = Files.getAttribute(path, "size");
		System.out.format("creationTime     : %s%n", obj1);
		System.out.format("lastModifiedTime     : %s%n", obj2);
		System.out.format("size     : %s%n", obj3);
	}
}
