package br.jp.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryBD {
//?autoReconnect=true&useSSL=false
public Connection getConnection(){
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection(
				"jdbc:mysql://localhost:8080/mydb", "P4PROHEART","p4pro");
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
