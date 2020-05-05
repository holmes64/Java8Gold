package chapter10;
// ラムダ式での実装
public class Sample10_3 {
	public static void main(String[] args){
		// 匿名クラスで実装した場合
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("hello");
			}
		}).start();
		
		// ラムダ式で実装した場合
		new Thread(() -> {
			System.out.println("hello");
		}).start();
	}
}
