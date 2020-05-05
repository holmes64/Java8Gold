package chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;

// Pathインタフェースの使用例1
public class Sample9_3 {
	public static void main(String[] args){
		// windowsの場合
		Path path = Paths.get("C:\\sample\\Chap09\\ren\\9_1.txt");
		
		// linuxの場合
//		Path path = Paths.get("/sample/Chap09/ren/9_1.txt");
		System.out.format("toString      : %s%n", path.toString());
		System.out.format("getFileName   : %s%n", path.getFileName());
		System.out.format("getName       : %s%n", path.getName(0));
		System.out.format("getNameCount  : %s%n", path.getNameCount());
		System.out.format("getRoot       : %s%n", path.getRoot());
		while((path = path.getParent()) != null) {
			System.out.format("  getParent   : %s%n", path);
		}
		Path p = Paths.get("ren\\9_1.txt");
		System.out.format("getRoot     : %s%n", p.getRoot());
	}
}
