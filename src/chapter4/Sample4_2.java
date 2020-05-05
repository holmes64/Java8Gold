package chapter4;
// より簡略化した場合のラムダ式の書き方

import java.util.Arrays;
import java.util.List;

public class Sample4_2 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Tanaka", "Sato");
		words.replaceAll( str -> str.toUpperCase() );
		System.out.println(words);
	}
}
