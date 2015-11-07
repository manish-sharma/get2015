package ModelHelper;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.ConnectionFactory;
import Model.Employee;


public class EmployeeHelper {

	//method to get Employee Detail 
	
	public Employee get(String name) {
		Connection connection = ConnectionFactory.getConnection();
		ResultSet rs = null;
		Employee employee = null;
		String query = "select * from employee where name=?";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			rs = preparedStatement.executeQuery();

			while (rs.next()) {

				employee = new Employee();
				employee.setName(rs.getString("name"));
				employee.setEmailId(rs.getString("email_id"));
				employee.setPhoneNo(rs.getString("phone_no"));
			}
		
			return employee;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println("Could not close prepared statement, ["
							+ e.getMessage() + "]");
				}
			}

		}

		return null;

	}

}