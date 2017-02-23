package jp.co.ec_10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * クラス名：LoginDAO
 * クラスの説明：ログインするためにadmin_table(管理者テーブル)に接続する
 *
 * @author Yamanobe
 * @version 1.0
 * @since 1.0
 */
public class LoginDAO {
	Connection con = null;
	public String admin_name;

	/**
	 * @param input_id ログイン画面で入力された管理者ID
	 * @param input_pass ログイン画面で入力された管理者PASSWORD
	 */
	public LoginDAO(String input_id, String input_pass) {

			try{
				con = (Connection) DBmanager.getConnection();
				String sql = "SELECT * FROM admin_table WHERE admin_id = ? AND admin_pass = ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, input_id);
				pstmt.setString(2, input_pass);
				ResultSet res = pstmt.executeQuery();
				while(res.next()){
					admin_name = res.getString("admin_name");
				}
				pstmt.close();
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
		}
	}

}

