package jp.co.ec_10.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.ec_10.dao.ItemDAO;
import jp.co.ec_10.dto.AdminDTO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * クラス名：AD_Item_Del
 * クラスの説明：商品を削除する
 *
 * @author Yamanobe
 * @version 1.0
 * @since 1.0
 */
public class AD_Item_Del extends ActionSupport{

	public List<AdminDTO> itemlist = new ArrayList<AdminDTO>();
	int list_count;
	private String inputid;
	public String msg;

		/**
		 * メソッド名：itemdel
		 * メソッドの説明：選択された商品を削除する
		 *
		 * @author Yamanobe
		 * @version 1.0
		 * @since 1.0
		 * @return success ad_item_info.jsp(商品一覧画面)に遷移する
		 */
		public String itemdel(){
			ItemDAO idao = new ItemDAO();
			idao.item_del(inputid);

			idao.item_select(0);
			itemlist.addAll(idao.select_ALL());
			idao.item_all();
			list_count = idao.list_count;

			msg = "削除完了しました";

			return "success";
		}
		/**
		 * メソッド名：getList_count
		 * メソッドの説明：list_countをJSPに送る
		 *
		 * @author Yamanobe
		 * @version 1.0
		 * @since 1.0
		 * @return list_count (商品情報・注文情報)の各テーブルの総数
		 */
		public int getList_count() {
			return list_count;
		}
		/**
		 * メソッド名：setInputid
		 * メソッドの説明：ad_item_edit.jsp(商品編集画面)にて選択されている商品ID
		 * を、取得する
		 *
		 * @author Yamanobe
		 * @version 1.0
		 * @since 1.0
		 * @param inputid 選択されている商品ID
		 */
		public void setInputid(String inputid) {
			this.inputid = inputid;
		}
}

