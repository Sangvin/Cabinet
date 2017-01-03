package bdd;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class SauverEnBase {

	public static void main(String[] args) {
	String url = "jdbc:mysql://localhost/cabinet";
	String login = "root";
	String passwd = "";
	java.sql.Connection cn = null;
	Statement st = null;
	try {
		cn = bdd.Connection.getInstance();
		st = (Statement) cn.createStatement();
		String sql = "INSERT INTO patient VALUES ("+12+");";
		
		st.executeUpdate(sql);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			cn.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
		
	}

	}


