package chapter1;
// Singletonクラスを利用する場合
public class Sample1_6 {
	public static void main(String[] args) {
		MySingleton obj1 = MySingleton.getInstance();
		MySingleton obj2 = MySingleton.getInstance();
		if(obj1 ==obj2) { System.out.println("obj1 == obj2");
		} else { System.out.println("obj1 != obj2"); }
		
	}
}
