package chapter6;
//try-catch-finallyの利用例
public class Sample6_1 {
	public static void main(String[] args) {
		int[] num = {10, 20, 30};
		for(int i=0; i<4; i++) {
			try {
				System.out.print("num :" + num[i]);
				System.out.println(" : " + (i+1) + " 回目のループ");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("例外が発生しました");
			}finally {
				System.out.println("--- finallyの実行");
			}
		}
		System.out.println("-- end --");
	}
}
