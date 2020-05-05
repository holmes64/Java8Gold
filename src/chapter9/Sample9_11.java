package chapter9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// readAllLines()メソッドの利用
public class Sample9_11 {
	public static void main(String[] args) throws java.io.IOException {
		Path path = Paths.get("ren/9_11.txt");
		List<String> lines = Files.readAllLines(path);
		for(String line : lines) {
			System.out.println(line);
		}
	}
}
