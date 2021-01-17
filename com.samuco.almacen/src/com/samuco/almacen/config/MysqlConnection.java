package com.samuco.almacen.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
	private static Connection conn = null;
	// Constructor
	private MysqlConnection() {

		String url = "jdbc:mysql://localhost:3306/almacen?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String driver = "com.mysql.cj.jdbc.Driver";
		String usuario = "samuco";
		String password = "samucoxd";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	} // Fin constructor


	public static Connection getConnection() {

		if (conn == null) {
			new MysqlConnection();
		}

		return conn;
	} // Fin getConnection
}
