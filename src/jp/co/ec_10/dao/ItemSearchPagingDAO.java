package jp.co.ec_10.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.co.ec_10.dto.ItemDTO;

/**
 * クラス名：ItemSearchPagingDAO
 * クラスの説明：
 * ページング処理を行うためのDAO
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 */
public class ItemSearchPagingDAO {

	private  ArrayList<ItemDTO> itemlist = new ArrayList<ItemDTO>(5);
	private String sql;
	private String sql_all;
	private int paging;
	private int max_id_flag;
	private int list_count;

	/**
	 * メソッド名：paging
	 * メソッドの説明:
	 * ページング処理を行う
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param kwd 検索ワード
	 * @param paging ページング処理のための値
	 */
	public void paging(String kwd,int paging) {

		sql = "SELECT * FROM item_table WHERE item_name like '%" + kwd + "%' limit "+paging+ ",20";
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

			if(list_count-(paging+20)==0){
				max_id_flag=1;
			}

			ps.close();
			ps2.close();

		} catch (SQLException e) {
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
	 * メソッド名：getItemlist
	 * メソッドの説明:
	 * データベースのitem_tableから取り出した商品データを格納したitemlistをItemSearchPagingActionに送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return itemlist データベースから取り出した商品データが格納されている
	 */
	public ArrayList<ItemDTO> getItemlist() {
		return itemlist;
	}
	/**
	 * メソッド名：getMax_id_flag
	 * メソッドの説明:
	 * 検索結果の最終行まできた際、フラグを立てms_item_info.jsp_after(マイショップ商品一覧画面（after）)に
	 * 「次の20件」ボタンが表示されないようにする
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return max_id_flag 検索結果の最終行まできたときに立てるフラグ
	 */
	public int getMax_id_flag() {
		return max_id_flag;
	}
	/**
	 * メソッド名：getList_count
	 * メソッドの説明:
	 * 検索ワードにヒットした商品が item_table内に何件あるかを送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return list_count 検索でヒットした件数
	 */
	public int getList_count() {
		return list_count;
	}
	/**
	 * メソッド名：getPaging
	 * メソッドの説明:
	 * ページング処理に必要な値が格納されたpagingを送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return paging ページング処理のための値
	 */
	public int getPaging() {
		return paging;
	}


	//単体試験のために作成
	/**
	 * メソッド名：setItemlist
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param itemlist データベースから取り出した商品データが格納されている
	 */
	public void setItemlist(ArrayList<ItemDTO> itemlist) {
		this.itemlist = itemlist;
	}

	/**
	 * メソッド名：setMax_id_flag
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param max_id_flag 検索結果の最終行まできたときに立てるフラグ
	 */
	public void setMax_id_flag(int max_id_flag) {
		this.max_id_flag = max_id_flag;
	}

	/**
	 * メソッド名：setList_count
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param list_count 検索でヒットした件数
	 */
	public void setList_count(int list_count) {
		this.list_count = list_count;
	}

	/**
	 * メソッド名：setPaging
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param paging ページング処理のための値
	 */
	public void setPaging(int paging) {
		this.paging = paging;
	}

}
