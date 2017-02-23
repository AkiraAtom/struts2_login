package jp.co.ec_10.dto;

/**
 * クラス名：AdminDTO
 * クラスの説明：itemlistの管理で使うGET,SETの集合体
 *
 * @author Yamanobe
 * @version 1.0
 * @since 1.0
 */
public class AdminDTO {

	private String admin_id;
	private String admin_pass;
	private String admin_name;

	private String item_id;
	private String item_name;
	private String item_price;
	private String item_stock;
	private String item_img;

	private String order_id;
	private String order_count;
	private String order_customer;
	private String order_post;
	private String order_mail;
	private String order_phone;
	private String order_destination;
	private String order_day;

	/**
	 * メソッド名：getAdmin_id
	 * メソッドの説明：管理者テーブルの管理者IDを送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return admin_id 管理者ID
	 */
	public  String getAdmin_id() {
		return admin_id;
	}
	/**
	 * メソッド名：getAdmin_pass
	 * メソッドの説明：管理者テーブルの管理者PASSを送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return admin_pass 管理者PASS
	 */
	public String getAdmin_pass() {
		return admin_pass;
	}
	/**
	 * メソッド名：getAdmin_name
	 * メソッドの説明：管理者テーブルの管理者名を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return admin_name 管理者名
	 */
	public String getAdmin_name() {
		return admin_name;
	}

	/**
	 * メソッド名：getItem_id
	 * メソッドの説明：商品テーブルの商品IDを送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return item_id 商品ID
	 */
	public String getItem_id() {
		return item_id;
	}
	/**
	 * メソッド名：getItem_name
	 * メソッドの説明：商品テーブルの商品名を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return item_name 商品名
	 */
	public String getItem_name() {
		return item_name;
	}
	/**
	 * メソッド名：getItem_price
	 * メソッドの説明：商品テーブルの値段を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return item_price 値段
	 */
	public String getItem_price() {
		return item_price;
	}
	/**
	 * メソッド名：getItem_stock
	 * メソッドの説明：商品テーブルの在庫を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return item_stock 在庫
	 */
	public String getItem_stock() {
		return item_stock;
	}
	/**
	 * メソッド名：getItem_img
	 * メソッドの説明：商品テーブルの画像パスを送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return item_img 画像パス
	 */
	public String getItem_img() {
		return item_img;
	}

	/**
	 * メソッド名：getOrder_id
	 * メソッドの説明：注文情報テーブルの注文IDを送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return order_id 注文ID
	 */
	public String getOrder_id() {
		return order_id;
	}
	/**
	 * メソッド名：getOrder_count
	 * メソッドの説明：注文情報テーブルの注文された商品の個数を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return order_count 注文された商品の個数
	 */
	public String getOrder_count() {
		return order_count;
	}
	/**
	 * メソッド名：getOrder_customer
	 * メソッドの説明：注文情報テーブルの購入者名を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return order_customer 購入者名
	 */
	public String getOrder_customer() {
		return order_customer;
	}
	/**
	 * メソッド名：getOrder_post
	 * メソッドの説明：注文情報テーブルの郵便番号を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return order_post 郵便番号
	 */
	public String getOrder_post() {
		return order_post;
	}
	/**
	 * メソッド名：getOrder_mail
	 * メソッドの説明：注文情報テーブルのメールアドレスを送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return order_mail メールアドレス
	 */
	public String getOrder_mail() {
		return order_mail;
	}
	/**
	 * メソッド名：getOrder_destination
	 * メソッドの説明：注文情報テーブルの購入者の住所を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return order_destination 購入者の住所
	 */
	public String getOrder_destination() {
		return order_destination;
	}
	/**
	 * メソッド名：getOrder_phone
	 * メソッドの説明：注文情報テーブルの電話番号を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return order_phone 電話番号
	 */
	public String getOrder_phone() {
		return order_phone;
	}
	/**
	 * メソッド名：getOrder_day
	 * メソッドの説明：注文情報テーブルの購入日を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return order_day 購入日
	 */
	public String getOrder_day() {
		return order_day;
	}


	/**
	 * メソッド名：setAdmin_id
	 * メソッドの説明：管理者テーブルの管理者IDをもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param admin_id 管理者ID
	 */
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	/**
	 * メソッド名：setAdmin_pass
	 * メソッドの説明：管理者テーブルの管理者PASSをもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param admin_pass 管理者パス
	 */
	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}
	/**
	 * メソッド名：setAdmin_nambe
	 * メソッドの説明：管理者テーブルの管理者名をもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param admin_name 管理者名
	 */
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	/**
	 * メソッド名：setItem_id
	 * メソッドの説明：商品テーブルの商品IDをもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param item_id 商品ID
	 */
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	/**
	 * メソッド名：setItem_name
	 * メソッドの説明：商品テーブルの商品名をもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param item_name 商品名
	 */
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	/**
	 * メソッド名：setItem_price
	 * メソッドの説明：商品テーブルの値段をもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param item_price 値段
	 */
	public void setItem_price(String item_price) {
		this.item_price = item_price;
	}
	/**
	 * メソッド名：setItem_stock
	 * メソッドの説明：商品テーブルの在庫をもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param item_stock 在庫
	 */
	public void setItem_stock(String item_stock) {
		this.item_stock = item_stock;
	}
	/**
	 * メソッド名：setItem_img
	 * メソッドの説明：商品テーブルの画像パスをもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param item_img 画像パス
	 */
	public void setItem_img(String item_img) {
		this.item_img = item_img;
	}

	/**
	 * メソッド名：setOrder_id
	 * メソッドの説明：注文情報テーブルから注文IDをもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param order_id 注文ID
	 */
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	/**
		 * メソッド名：setOrder_count
	 * メソッドの説明：注文情報テーブルから注文数をもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param order_count 注文数
	 */
	public void setOrder_count(String order_count) {
		this.order_count = order_count;
	}
	/**
	 * メソッド名：setOrder_customer
	 * メソッドの説明：注文情報テーブルから購入者をもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param order_customer 購入者
	 */
	public void setOrder_customer(String order_customer) {
		this.order_customer = order_customer;
	}
	/**
	 * メソッド名：setOrder_post
	 * メソッドの説明：注文情報テーブルから郵便番号をもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param order_post 郵便番号
	 */
	public void setOrder_post(String order_post) {
		this.order_post = order_post;
	}
	/**
	 * メソッド名：setOrder_mail
	 * メソッドの説明：注文情報テーブルからメールアドレスをもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param order_mail メールアドレス
	 */
	public void setOrder_mail(String order_mail) {
		this.order_mail = order_mail;
	}
	/**
	 * メソッド名：setOrder_destination
	 * メソッドの説明：注文情報テーブルから購入者の住所をもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param order_destination 購入者の住所
	 */
	public void setOrder_destination(String order_destination) {
		this.order_destination = order_destination;
	}
	/**
	 * メソッド名：setOrder_day
	 * メソッドの説明：注文情報テーブルから購入日をもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param order_day 購入日
	 */
	public void setOrder_day(String order_day) {
		this.order_day = order_day;
	}
	/**
	 * メソッド名：setOrder_phone
	 * メソッドの説明：注文情報テーブルから電話番号をもらう
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param order_phone 電話番号
	 */
	public void setOrder_phone(String order_phone) {
		this.order_phone = order_phone;
	}


}
