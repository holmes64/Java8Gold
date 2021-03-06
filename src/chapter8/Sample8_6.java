package chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// BufferedReaderクラスとBuffredWriterクラスの使用例
public class Sample8_6 {
	public static void main(String[] args) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("ren/8_6.txt"));
				BufferedReader br = new BufferedReader(new FileReader("ren/8_6.txt"))) {
			bw.write("おはよう"); bw.newLine(); bw.write("こんにちは");
			bw.flush();
			String data = null;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
