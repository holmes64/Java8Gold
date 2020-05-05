package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// fine()メソッドの使用
public class Sample9_19 {
	public static void main(String[] args){
		Path p = Paths.get("ren/9_XX");
		long dateF = 1475325000000L;
		try {
			Files.find(p, 10, (path, attr) -> path.toString().endsWith(".jpg") &&
					attr.creationTime().toMillis() > dateF).forEach(System.out::print);
		} catch(IOException e) { e.printStackTrace(); }
	}
}
