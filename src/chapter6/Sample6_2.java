package chapter6;
// マルチキャッチの例
public class Sample6_2 {
	public static void main(String[] args) {
		String s = "A"; int[] num = {10, 0};
		try {
			System.out.print(Integer.parseInt(s));
//			System.out.print(num[0] / num[1]);
		} catch(NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
