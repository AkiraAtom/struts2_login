package jp.co.ec_10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class RegistDAO extends ActionSupport{

	Connection con = null;
	String sql = null;
	PreparedStatement ps2 = null;

	public RegistDAO(String ad_ID,String ad_NAME,String ad_PASS){

			con = DBmanager.getConnection();
			sql = "insert into admin_table(admin_id,admin_pass,admin_name) values(?,?,?)";

			try {
				PreparedStatement ps2 = con.prepareStatement(sql);

				ps2.setString(1, ad_ID);
				ps2.setString(2, ad_PASS);
				ps2.setString(3, ad_NAME);
				ps2.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if (con != null) {
		            try {
		               con.close();
		            } catch (Exception e) {
		            }
		         }


			}
	}




}