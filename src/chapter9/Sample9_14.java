package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

// DosFileAttributesインタフェースの使用例
public class Sample9_14 {
	public static void main(String[] args) throws IOException{
		Path p1 = Paths.get("ren/9_14.txt");
		DosFileAttributes attr = Files.readAttributes(p1, DosFileAttributes.class);
		System.out.format("isArchive     : %s%n", attr.isArchive());
		System.out.format("isHidden     : %s%n", attr.isHidden());
		System.out.format("isReadOnly     : %s%n", attr.isReadOnly());
		System.out.format("isSystem    : %s%n", attr.isSystem());
	}
}
