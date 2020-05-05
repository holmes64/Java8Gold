package chapter9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Filesクラス使用例1
public class Sample9_8 {
	public static void main(String[] args){
		Path p1 = Paths.get("ren");
		Path p2 = Paths.get("C:\\sample\\Chap09\\ren");
		System.out.format("exists     : %s%n", Files.exists(p1));
		try {
			System.out.format("isSamefile     : %s%n", Files.isSameFile(p1, p2));
		} catch (java.io.IOException e) { }
		System.out.format("isDirectory   : %s%n", Files.isDirectory(p1));
		System.out.format("isRegularFile : %s%n", Files.isRegularFile(p1));
		System.out.format("isReadable    : %s%n", Files.isReadable(p1));
		System.out.format("isExecutable  : %s%n", Files.isExecutable(p1));
	}
}
