package com.neusoft.wuyemis.admin.factory;

import java.sql.Connection;
import java.sql.DriverManager;

//使用传统的JDBC直接连接方式的Connection工厂
public class ConnectionFactoryWithJDBC {
	
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/propertymanagement?serverTimezone=GMT%2B8","root","root");
		return cn;
	}

}
