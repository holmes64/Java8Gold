package chapter8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// FileInputStreamクラスとFileOutputStreamクラスの使用例
public class Sample8_2 {
	public static void main(String[] args){
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream(new File("ren/8_2.txt"));
			fos.write(0); fos.write("suzuki".getBytes()); fos.write(99);
			fis = new FileInputStream(new File("ren/8_2.txt"));
			int data = 0;
			while((data = fis.read()) != -1) {
				System.out.print(data + " "); // 読み込んだデータの表示
			}
		}catch (FileNotFoundException e) {
			System.err.println("ファイルがありません");
		}catch (IOException e) {
			System.err.println("IO err");
		}finally {
			try {fos.close(); fis.close();} catch(IOException e) {}
		}
	}
}
