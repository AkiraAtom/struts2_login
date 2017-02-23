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
 * クラス名：ItemDAO
 * クラスの説明：item_table(商品情報テーブル)に接続する
 *
 * @author Yamanobe
 * @version 1.0
 * @since 1.0
 */
public class ItemDAO {
	Connection con = null;
	String sql = null;
	String sql2 = null;
	PreparedStatement pstmt = null;
	PreparedStatement pstmt2 = null;
	ResultSet res = null;
	public int list_count;
	public String item_name;
	public String item_price;
	public String item_stock;
	public String item_img;
	public int flg = 0;
	public List<AdminDTO> itemlist = new ArrayList<AdminDTO>();

	/**
	 * メソッド名：item_all
	 * メソッドの説明 : 商品の総数を調べる
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 */

	public void item_all(){

		try{
			con = DBmanager.getConnection();
			sql = "SELECT COUNT(*) FROM item_table";
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
	 * メソッドの説明：item_tableから商品を5件づつ表示させる
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param paging2 ページ移動をするための基準(paging2 から 10件)
	 */
	public void item_select(int paging2){

		try{
			con = DBmanager.getConnection();
			sql = "SELECT * FROM item_table LIMIT "+paging2+" ,10";
			pstmt = con.prepareStatement(sql);
			res = pstmt.executeQuery();
			while(res.next()){
				AdminDTO Adto = new AdminDTO();
				Adto.setItem_id(res.getString("item_id"));
				Adto.setItem_name(res.getString("item_name"));
				Adto.setItem_price(res.getString("item_price"));
				Adto.setItem_stock(res.getString("item_stock"));
				Adto.setItem_img(res.getString("item_img"));
				itemlist.add(Adto);
			}
			pstmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	public void item_search_like(String kwd){

		try{
			con = DBmanager.getConnection();
			sql = "SELECT * FROM item_table WHERE item_name like '%" + kwd + "%'";
			pstmt = con.prepareStatement(sql);
			res = pstmt.executeQuery();
			while(res.next()){
				AdminDTO Adto = new AdminDTO();
				Adto.setItem_id(res.getString("item_id"));
				Adto.setItem_name(res.getString("item_name"));
				Adto.setItem_price(res.getString("item_price"));
				Adto.setItem_stock(res.getString("item_stock"));
				Adto.setItem_img(res.getString("item_img"));
				itemlist.add(Adto);
			}
			pstmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}


	/**
	 * メソッド名：select_edit
	 * メソッドの説明：ad_item_info.jsp(商品一覧画面)で選択されたIDで商品を検索する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param itemselect ad_item_info.jspで選択された商品ID
	 */
	public void select_edit(String itemselect) {

		try{
			con = DBmanager.getConnection();
			sql = "SELECT * FROM item_table WHERE item_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, itemselect);
			res = pstmt.executeQuery();
			while(res.next()){
				item_name = res.getString("item_name");
				item_price = res.getString("item_price");
				item_stock = res.getString("item_stock");
				item_img = res.getString("item_img");
			}
			pstmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	/**
	 * メソッド名：item_edit
	 * メソッドの説明：商品名,値段,在庫数,画像パスを変更する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param inputitem ad_item_edit.jsp(商品編集画面)にて入力された商品名
	 * @param inputprice ad_item_edit.jspにて入力された値段
	 * @param inputstock ad_item_edit.jspにて入力された在庫
	 * @param inputimg ad_item_edit.jspにて入力された画像パス
	 * @param inputid 変更するための基準となる商品ID
	 */
	public void item_edit(String inputitem, String inputprice,
				String inputstock, String inputimg, String inputid) {

		try{
			// 商品の変更
			con = DBmanager.getConnection();
			sql = "UPDATE item_table SET item_name=?, item_price=?, item_stock=?, item_img=? WHERE item_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, inputitem);
			pstmt.setString(2, inputprice);
			pstmt.setString(3, inputstock);
			pstmt.setString(4, inputimg);
			pstmt.setString(5, inputid);

			pstmt.executeUpdate();

			pstmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	/**
	 * メソッド名：item_del
	 * メソッドの説明：商品を削除する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param inputid ad_item_info.jsp(商品一覧画面)にて選択された商品ID(削除の基準とする)
	 */
	public void item_del(String inputid){

		try{
			// 商品の削除
			con = DBmanager.getConnection();
			sql = "DELETE FROM item_table WHERE item_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, inputid);

			pstmt.executeUpdate();

			pstmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	/**
	 * メソッド名：item_reg
	 * メソッドの説明：新商品を登録する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param inputitem ad_item_register.jsp(商品登録画面)にて入力された商品名
	 * @param inputprice ad_item_register.jspにて入力された値段
	 * @param inputstock ad_item_register.jspにて入力された在庫
	 * @param inputimg ad_item_register.jspにて入力された画像パス
	 */
	public void item_reg(String inputitem, String inputprice,
			String inputstock, String inputimg) {

		try{
			// 商品の登録
			con = DBmanager.getConnection();
			sql = "INSERT INTO item_table (item_name, item_price, item_stock, item_img) "
					+ "VALUES (?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, inputitem);
			pstmt.setString(2, inputprice);
			pstmt.setString(3, inputstock);
			pstmt.setString(4, inputimg);

			pstmt.executeUpdate();

			pstmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}

	}

	/**
	 * メソッド名：item_reduce
	 * メソッドの説明: 注文数だけ商品の出荷
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param itemlist
	 */
	public void item_reduce(ArrayList<CartBean> itemlist){

		try {
			//注文された数だけ商品テーブルの在庫を減らす
			con = DBmanager.getConnection();
			for (int i = 0; i < itemlist.size(); i++) {

				int item_id;
				int num;

				item_id = itemlist.get(i).getItem_id();
				num = itemlist.get(i).getNum();

				sql = "SELECT * FROM item_table WHERE item_id ="+item_id;

				pstmt = con.prepareStatement(sql);
				res = pstmt.executeQuery();

				while (res.next()) {
					item_stock = res.getString("item_stock");
				}
				pstmt.close();
				int stock = Integer.parseInt(item_stock);

				//注文個数に対して在庫があるかのチェック
				if (num <= stock) {
					int newstock =stock-num;

					sql2 ="UPDATE item_table SET item_stock=? WHERE item_id = ?";

					pstmt2 = con.prepareStatement(sql2);
					pstmt2.setInt(1,newstock);
					pstmt2.setInt(2,item_id);
					pstmt2.executeUpdate();
					pstmt2.close();

				}else if(num > stock && stock >= 1){

					flg = 1;

					sql2 ="UPDATE item_table SET item_stock=? WHERE item_id = ?";

					pstmt2 = con.prepareStatement(sql2);
					pstmt2.setInt(1,0);
					pstmt2.setInt(2,item_id);
					pstmt2.executeUpdate();
					pstmt2.close();

				}else{
					flg = 1;
				}
			}
				con.close();

			} catch (Exception e) {
				e.printStackTrace();
				flg = 2;
			}
	}

	// リストを返す
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

