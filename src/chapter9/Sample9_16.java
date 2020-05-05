package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// walk()メソッドの使用例
public class Sample9_16 {
	public static void main(String[] args){
		Path path = Paths.get("ren/9_XX");
		try {
			Files.walk(path).forEach(System.out::println);
		} catch (IOException e ) { e.printStackTrace(); }
	}
}
