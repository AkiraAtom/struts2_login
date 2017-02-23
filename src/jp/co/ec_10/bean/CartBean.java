package jp.co.ec_10.bean;

import java.text.NumberFormat;


/**
 * クラス名：CartBean
 * クラスの説明：itemlistの管理で使うGET,SETの集合体
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 */
public class CartBean{

	private int num;
	private String item_name;
	private int item_price;
	private int item_id;
	private int sub_total;

	//げったーせったー
	/**
	 * メソッド名：getNum
	 * メソッドの説明:
	 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)にて
	 * 入力された商品の個数を送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return num 商品の個数
	 */
	public int getNum() {
		return num;
	}
	/**
	 * メソッド名：getItem_name
	 * メソッドの説明:
	 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)から
	 * 取得した商品名を送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return item_name 商品名
	 */
	public String getItem_name() {
		return item_name;
	}
	/**
	 * メソッド名：getItem_price
	 * メソッドの説明:
	 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)から
	 * 取得した商品の値段を送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return item_price 商品の値段
	 */
	public int getItem_price() {
		return item_price;
	}
	/**
	 * メソッド名：getItem_id
	 * メソッドの説明:
	 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)から
	 * 取得した商品IDを送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return item_id 商品ID
	 */
	public int getItem_id() {
		return item_id;
	}
	/**
	 * メソッド名：setNum
	 * メソッドの説明:
	 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)から
	 * 取得した商品の個数をもらう
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param num 商品の個数
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * メソッド名：setItem_name
	 * メソッドの説明:
	 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)から
	 * 取得した商品名をもらう
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param item_name 商品名
	 */
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	/**
	 * メソッド名：setItem_price
	 * メソッドの説明:
	 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)から
	 * 取得した商品の値段をもらう
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param item_price 商品の値段
	 */
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	/**
	 * メソッド名：setItem_id
	 * メソッドの説明:
	 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)から
	 * 取得した商品IDをもらう
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param item_id 商品ID
	 */
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	/**
	 * メソッド名：getSub_total()
	 * メソッドの説明:
	 * CartCalculateActionで計算した商品の小計を送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return sub_total 商品の小計
	 */
	public int getSub_total() {
		return sub_total;
	}
	/**
	 * メソッド名：setSub_total
	 * メソッドの説明:
	 * CartCalculateActionで計算した商品の小計をもらう
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param sub_total 商品の小計
	 */
	public void setSub_total(int sub_total) {
		this.sub_total = sub_total;
	}

	/**
	 * メソッド名：getSub_total_yen
	 * メソッドの説明:
	 * CartCalculateActionで計算した商品の小計(メンバ変数のsub_total)を3桁ごとにコンマをつけて送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return sub_total_yen.format(sub_total) 3桁ごとにコンマがついた商品の小計
	 */
	public String getSub_total_yen() {
		NumberFormat sub_total_yen = NumberFormat.getNumberInstance();
		return sub_total_yen.format(sub_total);
	}

	/**
	 * メソッド名：getItem_price_yen
	 * メソッドの説明:
	 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)から
	 * 取得した商品の値段(メンバ変数のitem_price)を3桁ごとにコンマをつけて送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return sub_total_yen.format(item_price) 3桁ごとにコンマがついた商品の小計
	 */
	public String getItem_price_yen() {
		NumberFormat item_price_yen = NumberFormat.getNumberInstance();
		return item_price_yen.format(item_price);
	}


}