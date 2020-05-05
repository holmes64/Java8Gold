package chapter10;
// wait(), notify()メソッドの使用例
public class Sample10_7 {
	public static void main(String[] args){
		Share7 share = new Share7();
		ThreadA7 threadA = new ThreadA7(share);
		ThreadB7 threadB = new ThreadB7(share);
		threadA.start(); threadB.start();
	}
}

class Share7 { // 共有して使用されるオブジェクト
	private int a = 0;
	private String b;
	public synchronized void set() {
		while( a != 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		notify();
		a++; b = "data";
		System.out.println("set() a : " + a + " b: " + b);
	}
	public synchronized void print() {
		while( b == null ) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		notify();
		a--; b=null;
		System.out.println("    print()a : " + a + " b: " + b);
	}
}

class ThreadA7 extends Thread {
	private Share7 share;
	public ThreadA7(Share7 share) { this.share = share; }
	public void run() {
		for(int i=0; i<5; i++) { share.set(); }
	}
}

class ThreadB7 extends Thread {
	private Share7 share;
	public ThreadB7(Share7 share) { this.share = share; }
	public void run() {
		for (int i=0; i < 5; i++) { share.print(); }
	}
}



