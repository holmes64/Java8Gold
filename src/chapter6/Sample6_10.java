package chapter6;
// try-with-resource文の記述2
import java.sql.*;

class MyResource2 implements AutoCloseable{
	private String msg;
	public MyResource2(String msg) { this.msg = msg; }
	public void method() throws SQLException{
		throw new SQLException("method()でのエラー");
	}
	public void close() throws SQLException{
		System.out.println("close() : " + msg);
		throw new SQLException("close() :" + msg);
	}
}

public class Sample6_10 {
	public static void main(String[] args) {
		try(MyResource2 obj1 = new MyResource2("obj1");
			MyResource2 obj2 = new MyResource2("obj2")) {
			obj1.method();
		} catch (SQLException e) {
			System.out.println("e.getMessage() : " + e.getMessage());
			
			System.out.println("e.getSuppressed()で取り出した情報");
			Throwable[] errAry = e.getSuppressed();
			System.out.println(" 抑制例外数: " + errAry.length);
			for(Throwable ex : errAry) {
				System.out.println(" " + ex.getMessage());
			}
		} finally {
			System.out.println("finallyブロック");
		}
	}
}
