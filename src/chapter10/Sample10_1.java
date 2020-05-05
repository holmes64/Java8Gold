package chapter10;
// Threadクラスの使用例

public class Sample10_1 {
	public static void main(String[] args){
		// スレッドの作成
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		// スレッドの実行開始
		a.start();
		b.start();
	}
}

class ThreadA extends Thread {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("A:" + i + " ");
		}
	}
}

class ThreadB extends Thread {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("B:" + i + " ");
		}
	}
}