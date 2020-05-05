package chapter10;
// synchronizedメソッドの使用例
public class Sample10_6 {
	public static void main(String[] args){
		Share6 share = new Share6();
		ThreadA6 threadA = new ThreadA6(share);
		ThreadB6 threadB = new ThreadB6(share);
		threadA.start(); threadB.start();
	}
}

class Share6 { // 共有して使用されるオブジェクト
	private int a = 0;
	private String b;
	public synchronized void set() {
		a++; b = "data";
		System.out.println("set() a : " + a + " b: " + b);
	}
	public synchronized void print() {
		a--; b=null;
		System.out.println("    print()a : " + a + " b: " + b);
	}
}

class ThreadA6 extends Thread {
	private Share6 share;
	public ThreadA6(Share6 share) { this.share = share; }
	public void run() {
		for(int i=0; i<5; i++) { share.set(); }
	}
}

class ThreadB6 extends Thread {
	private Share6 share;
	public ThreadB6(Share6 share) { this.share = share; }
	public void run() {
		for (int i=0; i < 5; i++) { share.print(); }
	}
}
