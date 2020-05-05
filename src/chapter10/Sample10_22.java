package chapter10;

import java.util.Arrays;

// パラレルストリームの生成
// パラレルストリームの場合は処理順序がバラバラになる
// 利点としては。パラレル処理を行うことによって実行時間が短縮される傾向にある
public class Sample10_22 {
	public static void main(String[] args){
		Arrays.asList("a", "b", "c", "d", "e")
			.stream()
			.forEach(s -> System.out.print(s + " "));
		System.out.println();
		Arrays.asList("a", "b", "c", "d", "e")
			.parallelStream()
			.forEach(s -> System.out.print(s + " "));
	}
}
