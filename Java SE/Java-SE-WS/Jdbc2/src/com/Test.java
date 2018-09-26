package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		Connection con = DBUtils.getConnection("oracle");
		try {

			Statement stmt = con.createStatement();
			String qry = "select * from product";

			ResultSet rs = stmt.executeQuery(qry);
			//rs.absolute(3);

			while (rs.next()) {
				System.out.println("Id: " + rs.getInt("id"));
				System.out.println("Name: " + rs.getString("name"));
				System.out.println("Price: " + rs.getFloat("price"));
				System.out.println("---------------------------");

		}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}

	}

}
