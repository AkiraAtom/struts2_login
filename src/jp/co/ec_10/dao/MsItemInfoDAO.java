package jp.co.ec_10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.co.ec_10.dto.ItemDTO;

/**
 * クラス名：MsItemInfoDAO
 * クラスの説明：
 * データベースから取得した商品をリストとしてMsItemInfoSearchへ送る
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 */
public class MsItemInfoDAO {
	private Connection con = null;
	private String sql = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private  ArrayList<ItemDTO> itemlist = new ArrayList<ItemDTO>(4);

	public void num_search(){
		try{
			con = DBmanager.getConnection();
			sql = "SELECT * FROM item_table limit 20";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ItemDTO dto = new ItemDTO();
				dto.setItem_id(rs.getInt(1));
				dto.setItem_name(rs.getString(2));
				dto.setItem_price(rs.getInt(3));
				dto.setItem_stock(rs.getInt(4));
				dto.setItem_img(rs.getString(5));
				itemlist.add(dto);
			}
			ps.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	/**
	 * メソッド名：setItemlist
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param itemlist データベースのitem_tableから取り出した商品がリストとして格納されている
	 */
	public void setItemlist(ArrayList<ItemDTO> itemlist) {
		this.itemlist = itemlist;
	}

	/**
	 * メソッド名：getItemlist
	 * メソッドの説明:
	 * データベースのitem_tableから取り出した商品がリストとして格納されているitemlistを
	 * MsItemInfoSearchへ送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return itemlist データベースのitem_tableから取り出した商品がリストとして格納されている
	 */
	public ArrayList<ItemDTO> getItemlist() {
		return itemlist;
	}
	}
