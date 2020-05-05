package chapter11;
// 1. java.sqlのインポート
import java.sql.*;
// JDBCの使用例
public class Sample11_1 {
	public static void main(String[] args){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 2. データベースの指定
			String url = "jdbc:mysql:/localhost/golddb";
			// 3. データベースとの接続
			con = DriverManager.getConnection(url, "root", "training");
			// 4. ステートメントの取得
			stmt = con.createStatement();
			// 5. sql文の実行
			String sql = "SELECT dept_code, dept_name FROM department";
			rs = stmt.executeQuery(sql);
			// 6. 結果の取得と処理
			while(rs.next()) {
				System.out.println("dept_code : " + rs.getInt(1));
				System.out.println("dept_name : " + rs.getString(2));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		// 接続のクローズ
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch(SQLException e) { e.printStackTrace(); }
		}
	}
}
