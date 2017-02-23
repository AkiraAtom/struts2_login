package jp.co.ec_10.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jp.co.ec_10.dao.ItemDAO;
import jp.co.ec_10.dao.OrderDAO;
import jp.co.ec_10.dto.AdminDTO;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


/**
 * クラス名：ChangePaging
 * クラスの説明：ad_item_info.jsp(商品一覧画面), ad_order_info.jsp(注文情報一覧画面), ad_item_edit.jsp(商品編集画面),
 * ad_item_register.jsp(商品登録画面), ad_register.jsp(管理者登録画面),
 * ad_login.jsp(管理者ログイン画面), ms_item_info.jsp(マイショップ商品一覧画面)へそれぞれ遷移させる
 *
 * @author Yamanobe
 * @version 1.0
 * @since 1.0
 */
public class ChangePaging extends ActionSupport implements SessionAware{

	String change;
	public List<AdminDTO> itemlist = new ArrayList<AdminDTO>();
	private Map<String, Object>  sessionMap;
	private String itemselect;
	public String msg;
	int list_count;

	/**
	 * メソッド名：changepaging
	 * メソッドの説明：画面を遷移させるだけのメソッド
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return adtop 商品一覧画面へ遷移 adorder 注文情報一覧画面へ遷移 adedit 商品編集画面へ遷移
	 *  aditem 商品登録画面へ遷移 admin 管理者登録画面へ遷移 login 管理者ログイン画面へ遷移 logout マイショップ商品一覧画面へ遷移
	 */

	public String changepaging(){
		OrderDAO odao = new OrderDAO();
		ItemDAO idao = new ItemDAO();

		switch(change){

			case "adtop":

				idao.item_select(0);
				itemlist.addAll(idao.select_ALL());
				idao.item_all();
				list_count = idao.list_count;

				return "adtop";

			case "adorder":

				odao.item_select(0);
				itemlist.addAll(odao.select_ALL());
				odao.item_all();
				list_count = odao.list_count;

				return "adorder";

			case "adedit":

				if(itemselect == null){
					idao.item_select(0);
					itemlist.addAll(idao.select_ALL());
					idao.item_all();
					list_count = idao.list_count;
					msg = "商品が選択されていません";

					return "adtop";
				}

				sessionMap.put("ad_edit_Key", itemselect);
				idao.select_edit(itemselect);
				sessionMap.put("ad_item_Key", idao.item_name);
				sessionMap.put("ad_price_Key", idao.item_price);
				sessionMap.put("ad_stock_Key", idao.item_stock);
				sessionMap.put("ad_img_Key", idao.item_img);

				return "adedit";

			case "aditem":

				return "aditem";

			case "admin":

				return "admin";

			case "login":

				sessionMap.clear();
				return "login";

			default:

				sessionMap.clear();
				return "logout";
		}

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
	 * メソッド名：getChange
	 * メソッドの説明：junit.testのためのメソッド
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return change
	 */
	public String getChange() {
		return change;
	}

	/**
	 * メソッド名：setChange
	 * メソッドの説明：変数changeをJSPから受け取る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param change 画面遷移の基準となる
	 */
	public void setChange(String change) {
		this.change = change;
	}

	/**
	 * メソッド名：setItemselect
	 * メソッドの説明：変数itemselectをJSPから受け取る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param itemselect ad_item_info.jspにて選択された商品ID
	 */
	public void setItemselect(String itemselect) {
		this.itemselect = itemselect;
	}

	/* (非 Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	public void setSession(Map<String, Object>  sessionMap){
		this.sessionMap = sessionMap;
	}

}