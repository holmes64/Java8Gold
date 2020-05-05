package chapter1;
// 各進数を利用した変数定義の例
public class Sample1_1 {
	public static void main(String[] args){
		int val1 = 26;
		int val2 = 032; // 8進数
		int val3 = 0x1a; // 16進数
		int val4 = 0b11010; // 2進数
		// in val5 = 0b1201010; // コンパイルエラー
		System.out.println("val1 : " + val1);
		System.out.println("val2 : " + val2);
		System.out.println("val3 : " + val3);
		System.out.println("val4 : " + val4);
	}
	
}
