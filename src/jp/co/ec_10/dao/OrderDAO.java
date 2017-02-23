package jp.co.ec_10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.ec_10.bean.CartBean;
import jp.co.ec_10.dto.AdminDTO;

/**
 * クラス名：OrderDAO
 * @author Yamanobe
 * クラスの説明：order_table(注文情報テーブル)に接続する
 * @version 1.0
 * @since 1.0
 */
public class OrderDAO {
	Connection con = null;
	String sql = null;
	PreparedStatement pstmt = null;
	ResultSet res = null;
	public List<AdminDTO> itemlist = new ArrayList<AdminDTO>();
	public int list_count;
	public int item_id;
	public int num;
	public String customer_name;
	public String post;
	public String tel;
	public String mail;
	public String destination;

	/**
	 * メソッド名：item_all
	 * メソッドの説明：商品の総数を調べる
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 */
	public void item_all(){

		try{
			con = DBmanager.getConnection();
			sql = "SELECT COUNT(*) FROM order_table";
			pstmt = con.prepareStatement(sql);
			res = pstmt.executeQuery();

			while(res.next()){
			list_count = res.getInt(1);
			}

			pstmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	/**
	 * メソッド名：item_select
	 * メソッドの説明：item_tableから商品を10件づつ表示させる
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param paging2 ページ移動をするための基準(paging2 から 10件)
	 */
	public void item_select(int paging2){

		try{
			con = DBmanager.getConnection();
			sql = "SELECT * FROM order_table JOIN item_table ON order_table.item_id = item_table.item_id LIMIT "+paging2+" , 10";
			pstmt = con.prepareStatement(sql);
			res = pstmt.executeQuery();
			while(res.next()){
				AdminDTO Adto = new AdminDTO();
				Adto.setOrder_id(res.getString("order_id"));
				Adto.setItem_name(res.getString("item_name"));
				Adto.setOrder_count(res.getString("order_count"));
				Adto.setItem_price(res.getString("item_price"));
				Adto.setOrder_customer(res.getString("order_customer"));
				Adto.setOrder_mail(res.getString("order_mail"));
				Adto.setOrder_phone(res.getString("order_phone"));
				Adto.setOrder_post(res.getString("order_post"));
				Adto.setOrder_destination(res.getString("order_destination"));
				Adto.setOrder_day(res.getString("order_day"));

				itemlist.add(Adto);
			}
			pstmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}


	/**
	 * メソッド名：order_confirm
	 * メソッドの説明: ご注文内容とお客様情報の登録
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param itemlist
	 * @param customer_name
	 * @param post
	 * @param tel
	 * @param mail
	 * @param destination
	 */
	public void order_confirm(ArrayList<CartBean> itemlist,
			String customer_name,String post,String tel,String mail,String destination){

		try {
			con = DBmanager.getConnection();
			for (int i = 0; i < itemlist.size(); i++) {

				int item_id = itemlist.get(i).getItem_id();
				int num = itemlist.get(i).getNum();

				sql = "INSERT INTO order_table (item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) "
						+ "VALUES (?,?,?,?,?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1,item_id);
				pstmt.setInt(2,num);
				pstmt.setString(3,customer_name);
				pstmt.setString(4,post);
				pstmt.setString(5,tel);
				pstmt.setString(6,mail);
				pstmt.setString(7,destination);

				pstmt.executeUpdate();
				pstmt.close();
				}
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	/**
	 * メソッド名：select_ALL
	 * メソッドの説明：item_selectメソッドにて格納されたitemlistを送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return itemlist item_selectメソッドにて格納されたリスト
	 */
	public List<AdminDTO> select_ALL(){

		return itemlist;
	}
}
