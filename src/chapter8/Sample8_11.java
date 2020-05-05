package chapter8;

import java.io.Console;
import java.io.PrintWriter;

// writer()メソッドとreadLine()メソッドの使用例
public class Sample8_11 {
	public static void main(String[] args){
		Console console = System.console();
		PrintWriter pw = console.writer();
		while(true) {
			String str = console.readLine();
			if(str.equals("")) {
				break;
			}
			pw.append(" 入力されたデータ: " + str + '\n');
//			pw.append(" 入力されたデータ: " + str + '\n');
			pw.flush();
		}
	}
}
