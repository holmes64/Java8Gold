package chapter9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Sample9_13 {
	public static void main(String[] args) throws java.io.IOException {
		Path p1 = Paths.get("ren/9_13.txt");
		BasicFileAttributes attr = Files.readAttributes(p1, BasicFileAttributes.class);
		
		System.out.format("creationTime     : %s%n", attr.creationTime());
		System.out.format("lastModifiedTime     : %s%n", attr.lastModifiedTime());
		System.out.format("size     : %s%n", attr.size());
	}
}
