package chapter10;
// Runnableインタフェースの使用例
public class Sample10_2 {
	public static void main(String[] args){
		// スレッドの作成
		ThreadA2 threadA = new ThreadA2();
		ThreadB2 threadB = new ThreadB2();
		Thread a = new Thread(threadA);
		Thread b = new Thread(threadB);
		
		// スレッドの実行開始
		a.start();
		b.start();
	}
}

// Runnableインタフェースの実装クラス
class ThreadA2 implements Runnable {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print("A:" + i + " ");
		}
	}
}

// Runnableインタフェースの実装クラス
class ThreadB2 implements Runnable {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print("B:" + i + " ");
		}
	}
}