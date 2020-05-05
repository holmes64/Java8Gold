package chapter1;
import java.util.ArrayList;

/*
 *  getterメソッドでリストを取得すると参照値を得ることになる。
 *  そのため、呼び出し側からリストの要素を変更されないように配慮する必要がある。
 *  以下はString型のname変数とFruit型のリストを持つイミュータブルオブジェクトの
 *　定義例を示す。（Fruitクラスは定義済とする。）
 */
//public final class User {
//	private final String name;
//	private final List<Fruit> fruits;
//	public Basket (String name, List<Fruit> fruits) {
//		this.name = name;
//		List<Fruit> fruitsList = new ArrayList<Fruit>();
//		fruitsList.addAll(fruits);
//		this.fruits = fruitsList;
//	}
//	public String getName() {
//		return this.name;
//	}
//	// メンバ変数のリストの値を変更されないようにするため、新しくリストを作成する。
//	public List<Fruit> getFruits(){
//		List<Fruit> fruitsList = new ArrayList<Fruit>();
//		fruitsList.addAll(fruits);
//		return fruitsList;
//	}
//}
