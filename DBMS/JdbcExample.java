package com.metacube.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) {
		executeQueryUsingStatement();
		executeQueryUsingPreparedStatement();

		System.out.println("\nExiting . . .");
	}

	/* execute query using statement*/
	@SuppressWarnings("resource")
	private static void executeQueryUsingStatement() {
		String query = "select * from MEMBER";
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			System.out.println("using column index");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}

			System.out.println("\nusing column name");
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("member_id") + "\t"
						+ rs.getString("member_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	/* execute query using prepared statement*/
	private static void executeQueryUsingPreparedStatement() {
		
		System.out.println("\nFetching data using PreparedStatement ....");
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "select * from members where member_id = 1";
		int index = 1054;

		try {
			ps = con.prepareStatement(query);
			/* set variable in prepared statement */
			ps.setInt(1, index);
			// ps.setString(1,name);
			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	/* execute query using callable statement*/
	/*private static void executeQueryUsingCallableStatement() {
		Connection con = null;
		CallableStatement cs = null;
		ResultSet rs = null;
		String query = "select * from dataTable";
		try {

			ConnectionUtil conUtil = new ConnectionUtil();
			con = conUtil.getConnection();
			cs = con.prepareCall("call GetAllData");
			rs = cs.executeQuery(query);

			System.out.println("using column index");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}

			System.out.println("\nusing column name");
			rs = cs.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("id") + "\t"
						+ rs.getString("name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			 close connection 
			try {
				if (con != null) {
					con.close();
				}
				if (cs != null) {
					cs.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("\nExiting . . .");
	}*/
}
