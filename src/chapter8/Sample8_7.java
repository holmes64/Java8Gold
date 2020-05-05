package chapter8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// BufferedReaderクラスの使用例
public class Sample8_7 {
	public static void main(String[] args){
		try(BufferedReader br = new BufferedReader(new FileReader("ren/8_7.txt"))) {
			System.out.println(br.readLine());
			br.mark(256);
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			br.reset();
			System.out.println(br.readLine());
			br.skip(2);
			System.out.println(br.readLine());
		} catch(IOException e) {
			e.printStackTrace(); 
		}
	}
}
