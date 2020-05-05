package chapter9;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

// FileSystemsクラスとFileSystemクラスの利用
public class Sample9_2 {
	public static void main(String[] args){
		FileSystem fs = FileSystems.getDefault();
		Path path1 = fs.getPath("ren/9_1.txt");
		Path path2 = fs.getPath("C:\\sample\\Chap09\\ren\\9_1.txt");
		Path path3 = fs.getPath("C:", "sample", "Chap09", "ren", "9_1.txt");
		System.out.println(path1);
		System.out.println(path2);
		System.out.println(path3);
	}			
}
