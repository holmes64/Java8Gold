package chapter7;

import java.time.LocalDate;

// LocalDateオブジェクトの生成
public class Sample7_2 {
	public static void main(String[] args) {
		LocalDate dateNow = LocalDate.now();
		LocalDate dateOf = LocalDate.of(2020, 05, 03);
//		LocalDate dateOf = LocalDate.of(2020, 5, 03); // OK
		LocalDate dateP = LocalDate.parse("2020-05-03");
//		LocalDate dateP = LocalDate.parse("2020-5-03"); // 実行時エラー
		System.out.println("LocalDate.now      : " + dateNow);
		System.out.println("LocalDate.now      : " + dateOf);
		System.out.println("LocalDate.now      : " + dateP);
	}
}
