package chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;

// relativize()メソッドの使用例
public class Sample9_7 {
	public static void main(String[] args){
		Path path1 = Paths.get("X");
		Path path2 = Paths.get("Y");
		System.out.println("X -> Y 相対パス : " + path1.relativize(path2));
		System.out.println("Y -> X 相対パス : " + path2.relativize(path1));
	}
}
