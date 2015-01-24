package com.nhnent.board.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class MysqlConnection implements IMakeConnection{
//	String driverClassName = "com.mysql.jdbc.Driver";
//	String url = "jdbc:mysql://127.0.0.1:3306/board?useUnicode=true&characterEncoding=euckr";
//	String username = "root";
//	String password = "0415";
	@Value("${jdbc.driverClassName}") String driverClassName;
	@Value("${jdbc.url}") String url;
	@Value("${jdbc.username}") String username;
	@Value("${jdbc.password}") String password;
	@Override
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driverClassName);
			con = DriverManager
					.getConnection(
							url,
							username, password);
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
