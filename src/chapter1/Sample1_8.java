package chapter1;
// コンストラクタ、変数、メソッド定義
enum Card2 {
	SPADES(3), CLUBS(1), DIAMONDS(4), HEARTS(2);
	private int a;
	Card2(int a) { this.a = a; } // コンストラクタ
	public int getA() { return a; }
}

public class Sample1_8 {
	public static void main(String[] args) {
		Card2 card = Card2.SPADES;
		System.out.println(card);
		System.out.println(card.getA());
		System.out.println(card.ordinal());
		for(Card2 obj : Card2.values()) {
			System.out.print(obj + " ");
		}
	}
}
