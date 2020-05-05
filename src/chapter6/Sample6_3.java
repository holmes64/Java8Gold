package chapter6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// マルチキャッチの例2
// 継承関係のある例外クラスは列記できない
public class Sample6_3 {
	public static void main(String[] args) {
		try {
			FileReader rf = new FileReader("a.txt");
			rf.read();
//		}catch(FileNotFoundException | IOException e ) { // 順番を変えても継承関係がある場合はエラーになる
//		}catch(IOException | FileNotFoundException e ) { // 継承関係があるため、エラーとなる
//			e.printStackTrace();
		}catch(FileNotFoundException e) { // catchブロックを分けて記載するのであれば問題無し
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
