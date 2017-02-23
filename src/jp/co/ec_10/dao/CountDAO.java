package jp.co.ec_10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class CountDAO extends ActionSupport {

	Connection con = null;
	String sql = null;
	PreparedStatement pstmt = null;
	ResultSet res = null;

	public int ad_list_count;

		public CountDAO(String ad_ID) throws SQLException{
			con = DBmanager.getConnection();
			sql = "select count(*) from admin_table where admin_id = ?;";

			try{
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, ad_ID);

			res = pstmt.executeQuery();

			while(res.next()){
				ad_list_count = (res.getInt(1));

			}

			con.close();

		}catch (SQLException e){
			e.printStackTrace();
		}
	}



}