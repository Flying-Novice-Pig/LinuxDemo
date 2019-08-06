package com.xiaohu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyThread extends Thread{

	public void run() {
        System.out.println("========数据转移开始==========");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/coursemanage?characterEncoding=utf8&amp;useSSL=true";
			Connection conn = DriverManager.getConnection(url, "root", "1234");
			Statement stat = conn.createStatement();
			String sql = null;
			ResultSet rs = null;
			while (true) {
				int count=0;
				sql = "select * from account";
				rs = stat.executeQuery(sql);
				while(rs.next()) {
					System.out.println("检测到数据库有数据插入");			
                    count++;
                    break;
				}
				if(count>0) {
					break;
				}
			}
			rs.close();
			stat.close();
			conn.close();
			System.out.println("==========数据转移结束");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
