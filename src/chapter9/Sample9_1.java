package chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;

// Pathsクラスのget（）メソッド利用例
public class Sample9_1 {
	public static void main(String[] args){
		Path path1 = Paths.get("ren/9_1.txt");
		Path path2 = Paths.get("C:\\sample\\Chap09\\ren\\9_1.txt");
		Path path3 = Paths.get("C:", "sample", "Chap09", "ren", "9_1.txt");
		System.out.println(path1);
		System.out.println(path2);
		System.out.println(path3);
	}
}
