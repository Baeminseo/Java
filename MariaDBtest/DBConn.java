package MariaDBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
 
	public static void main(String[] args) {

		final String driver = "org.mariadb.jdbc.Driver";
		final String DB_IP = "127.0.0.1";
		final String DB_PORT = "3306";
		final String DB_NAME = "firstdb";
		final String DB_URL = "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		System.out.println(DB_URL);

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(DB_URL, "root", "root");

			if (conn != null) {
				System.out.println("DB ���� ����");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}

		try {
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			String userId = null;
			String password = null;
			String name = null;

			while (rs.next()) {
				userId = rs.getString(1);
				password = rs.getString(2);
				name = rs.getString(3);
			}

			System.out.println(userId);
			System.out.println(password);
			System.out.println(name);

		} catch (SQLException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}

				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}