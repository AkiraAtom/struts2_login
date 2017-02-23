package jp.co.ec_10.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.ec_10.dao.ItemDAO;
import jp.co.ec_10.dao.OrderDAO;
import jp.co.ec_10.dto.AdminDTO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * クラス名：AD_Paging
 * クラスの説明：ad_itam_info.jsp(), ad_order_info.jsp()にて一覧表示する際の「次ページ」「前ページ」を設定する
 *
 * @author Yamanobe
 * @version 1.0
 * @since 1.0
 */
public class AD_Paging extends ActionSupport{

	public List<AdminDTO> itemlist = new ArrayList<AdminDTO>();
	int paging;
	int paging2;
	String page;
	String select;
	int list_count;
	/**
	 * メソッド名：page
	 * メソッドの説明：page="next"ならば現在のページ数"paging"へ＋10し、page="back"ならば現在のページ数"paging"へ-10する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return order : ad_order_info.jspのページを変更する  item : ad_item_info.jspのページを変更する
	 */
	public String page() {

		if(page.equals("next")){
			paging2 = paging +10;
		}else if(page.equals("back")&&list_count>=10){
			paging2 = paging -10;}

		if(paging2 < 0){
			paging2 = list_count -10;
		}
		if(paging2 >= list_count){
			paging2 = 0;
		}

		if(select.equals("order")){
			OrderDAO odao = new OrderDAO();
			odao.item_select(paging2);
			itemlist.addAll(odao.select_ALL());
			odao.item_all();
			list_count = odao.list_count;

			return "order";
		}else if(select.equals("item")){
			ItemDAO idao = new ItemDAO();
			idao.item_select(paging2);
			itemlist.addAll(idao.select_ALL());
			idao.item_all();
			list_count = idao.list_count;

			return "item";
		}
		return "error";
	}

	/**
	 * メソッド名：getList_count
	 * メソッドの説明：テーブルに格納されている最大値を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return list_count テーブルに格納されている最大値
	 */
	public int getList_count() {
		return list_count;
	}

	/**
	 * メソッド名：setList_count
	 * メソッドの説明：テーブルに格納されている最大値を取得する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param list_count テーブルに格納されている最大値
	 */
	public void setList_count(int list_count) {
		this.list_count = list_count;
	}
	/**
	 * メソッド名：getPage
	 * メソッドの説明：junit.testのためのメソッド
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return page
	 */
	public String getPage() {
		return page;
	}

	/**
	 * メソッド名：setPage
	 * メソッドの説明：「次ページ」へならば"next",「前ページ」へならば"back"を取得する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param page "next","back" どちらかを取得する
	 */
	public void setPage(String page) {
		this.page = page;
	}


	/**
	 * メソッド名：getPaging
	 * メソッドの説明：junit.testのためのメソッド
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return pageing
	 */
	public int getPaging() {
		return paging;
	}

	/**
	 * メソッド名：getPaging2
	 * メソッドの説明：junit.testのためのメソッド
	 *
	 * @author
	 * @version 1.0
	 * @since 1.0
	 * @param paging2
	 */
	public void setPaging2(int paging2) {
		this.paging2 = paging2;
	}

	/**
	 * メソッド名：setPaging
	 * メソッドの説明：現在のページ数を取得する
	 *
	 * @author Yamanboe
	 * @version 1.0
	 * @since 1.0
	 * @param paging 現在のページ数
	 */
	public void setPaging(int paging) {
		this.paging = paging;
	}
	/**
	 * メソッド名：getPaging2
	 * メソッドの説明：paging(現在のページ数)から加減されたページの基準となる値をJSPへ送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return paging2 加減されたページの値
	 */
	public int getPaging2() {
		return paging2;
	}


	/**
	 * メソッド名：setSelect
	 * メソッドの説明：商品一覧画面、注文情報画面のどちらから入ったのかを識別する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param select "order"ならば注文情報画面,"item"ならば商品一覧画面をそれぞれ識別する
	 */
	public void setSelect(String select) {
		this.select = select;
	}

	/**
	 * メソッド名：getSelect
	 * メソッドの説明：junit.testのためのメソッド
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return select
	 */
	public String getSelect() {
		return select;
	}

}
