package chapter9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// ファイルとディレクトリのコピーと移動
public class Sample9_10 {
	public static void main(String[] args) throws java.io.IOException {
		Path p1 = Paths.get("ren/9_10.txt");
		Path p2 = Paths.get("ren/9_10_cp.txt");
		Path p3 = Paths.get("ren/9_10_org.txt");
		Path p4 = Paths.get("ren/9_10_mv.txt");
		Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
		Files.move(p3, p4, StandardCopyOption.REPLACE_EXISTING);
		Files.delete(p1);
	}
}
