package chapter9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// ディレクトリの作成と削除
public class Sample9_9 {
	public static void main(String[] args) throws java.io.IOException {
		Path p1 = Paths.get("ren/tmp");
		Files.createDirectory(p1);
		Path p2 = Paths.get("ren/tmp/x/y");
		Files.createDirectories(p2);
		Files.delete(p2);
		Files.deleteIfExists(Paths.get("ren/9_9"));
	}
}
