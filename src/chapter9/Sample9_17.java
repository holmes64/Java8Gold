package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// walk()とfilter()メソッドの利用
public class Sample9_17 {
	public static void main(String[] args) {
		Path path = Paths.get("ren/9_XX");
		try {
			Files.walk(path).filter(s -> s.toString().endsWith(".jpg")).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
