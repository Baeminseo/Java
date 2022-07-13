package MariaDBtest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectEx1 {
	
	public static void updateMember(MemberDTO member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		sql = "Update Member Set passwd = ? where name = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPasswd());
			pstmt.setString(2, member.getName());
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void insertMember(MemberDTO member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		sql = "Insert Into Member Values (?,?,?,now(),?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getId());
			pstmt.setString(3, member.getPasswd());
			pstmt.setString(4, member.getAddr());
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static Connection getConnection() {
		final String driver = "org.mariadb.jdbc.Driver";
		final String DB_IP = "127.0.0.1";
		final String DB_PORT = "3306";
		final String DB_NAME = "firstdb";
		final String DB_URL = "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;

		
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(DB_URL,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		
		MemberDTO member = new MemberDTO();
		member.setPasswd("9999");
		member.setName("아이언맨");
		member.setId("MMM");
		member.setAddr("서울");
		insertMember(member);
		//updateMember(member);
		/*
		Connection conn = getConnection();
		if(conn != null) {
			System.out.println("잘 연결됨");
		}
		
		String sql = "Select * from MEMBER";
		Statement stmt = null;
		ResultSet rs = null;
		MemberDTO dto = null;
		ArrayList<MemberDTO> members = new ArrayList<MemberDTO>();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setPasswd(rs.getString("passwd"));
				dto.setReg_date(rs.getDate("Reg_date"));
				dto.setAddr(rs.getString("addr"));
				members.add(dto);
				
			}
			
			System.out.println(members.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		
		
		
		
		
		 
		

	}

}
