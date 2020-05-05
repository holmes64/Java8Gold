package chapter6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// マルチキャッチの例3
// キャッチした参照変数は暗黙的にfinalになる
public class Sample6_4 {
	public static void main(String[] args) {
		try {
			int a = 10/0;
			FileReader rf = new FileReader("a.txt");
			rf.read();
		} catch(ArithmeticException | FileNotFoundException e) {
//			e.printStackTrace(); e = null; // 暗黙的なfinalとなるためここはコンパイルエラー
		} catch(IOException e) {
			e.printStackTrace(); e = null;
		}
	}
}
