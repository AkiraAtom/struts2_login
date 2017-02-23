package jp.co.ec_10.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.co.ec_10.dto.ItemDTO;

/**
 * クラス名：ItemSearchDAO
 * クラスの説明：kwd(検索ワード)を取得し、item_tableから商品を検索するDAO
 *
 * @author Kitahara
 * @version 1.0
 * @since 1.0
 */
public class ItemSearchDAO {

	private  ArrayList<ItemDTO> itemlist = new ArrayList<ItemDTO>(5);
	private String sql ;
	private String sql_all;
	private int max_id_flag;
	private int list_count;

	/**
	 * メソッド名：itemsearch
	 * メソッドの説明：kwd(検索ワード)を取得し、20件ずつ表示する
	 * sql(検索ワードを20件まで取得) sql_all(検索ヒット数を取得)
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @param kwd ms_item_info.jspから取得する検索キーワード
	 */
	public void itemsearch(String kwd) {

		sql = "SELECT * FROM item_table WHERE item_name like '%" + kwd + "%' limit 20";
		sql_all = "SELECT count(*) FROM item_table WHERE item_name like '%" + kwd + "%'";

	//DBmanager接続
		Connection con = DBmanager.getConnection();
		java.sql.PreparedStatement ps;
		java.sql.PreparedStatement ps2;
		try {

			//キーワード全件
			ps = con.prepareStatement(sql_all);
			ResultSet rs = ps.executeQuery(sql_all);

				rs.next();
				list_count = rs.getInt(1);


			ps2 = con.prepareStatement(sql);
			ResultSet rs2 = ps2.executeQuery(sql);

				for(int i=1;i<=20;i++){

					if (rs2.isLast()==true) {
						max_id_flag=1;
				        break;
				    }

				rs2.next();
				ItemDTO bean = new ItemDTO();
				bean.setItem_id(rs2.getInt(1));
				bean.setItem_name(rs2.getString(2));
				bean.setItem_price(rs2.getInt(3));
				bean.setItem_stock(rs2.getInt(4));
				bean.setItem_img(rs2.getString(5));
				itemlist.add(bean);
			}
			ps.close();
			ps2.close();

		} catch (SQLException e) {
			max_id_flag=1;
	           e.printStackTrace();
	        } finally {
	           if (con != null) {
	              try {
	                 con.close();
	              } catch (SQLException e) {
	            	  e.printStackTrace();
	              }
	              }
	        }
}


	/**
	 * メソッド名：getMax_id_flag
	 * メソッドの説明：最大まで検索された場合flg 1 を送付
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @return max_id_flag 最大値を取得するフラグ
	 */
	public int getMax_id_flag() {
		return max_id_flag;
	}

	/**
	 * メソッド名：setMax_id_flag
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @param max_id_flag 検索結果の最終行まできたときに立てるフラグ
	 */
	public void setMax_id_flag(int max_id_flag) {
		this.max_id_flag = max_id_flag;
	}


	/**
	 * メソッド名：getList_count
	 * メソッドの説明：検索ワードによりヒットした数を取得
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @return list_count 検索結果の数
	 */
	public int getList_count() {
		return list_count;
	}

	/**
	 * メソッド名：setList_count
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @param list_count 検索でヒットした件数
	 */
	public void setList_count(int list_count) {
		this.list_count = list_count;
	}

//	public int getPaging() {
//		return paging;
//	}

	/**
	 * メソッド名：selectALL
	 * メソッドの説明： item_listへ格納された値を送付
	 *
	 * @author Kitahara
	 *
	 * @version 1.0
	 * @since 1.0
	 * @return itemlist 検索によって取得された商品を格納
	 */
	public ArrayList<ItemDTO> selectALL() {
		return itemlist;
	}
}
