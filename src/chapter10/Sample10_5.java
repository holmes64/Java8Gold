package chapter10;
// 複数スレッドの共有オブジェクト使用例
public class Sample10_5 {
	public static void main(String[] args){
		Share share = new Share();
		ThreadA5 threadA = new ThreadA5(share);
		ThreadB5 threadB = new ThreadB5(share);
		threadA.start(); threadB.start();
	}
}

class Share{ // 共有して使用されるオブジェクト
	private int a = 0;
	private String b;
	public void set() {
		a++; b = "data";
		System.out.println(" set() a: " + a + " b: " + b);
	}
	public void print() {
		a--; b = null;
		System.out.println(" print() a : " + a + " b:" + b);
	}
}

class ThreadA5 extends Thread {
	private Share share;
	public ThreadA5(Share share) { this.share = share; }
	public void run() {
		for(int i=0; i<5; i++) { share.set(); }
	}
}

class ThreadB5 extends Thread {
	private Share share;
	public ThreadB5(Share share) { this.share = share; }
	public void run() {
		for (int i=0; i < 5; i++) { share.print(); }
	}
}
