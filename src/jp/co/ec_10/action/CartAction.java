package jp.co.ec_10.action;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Map;

import jp.co.ec_10.bean.CartBean;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



/**
 * クラス名：CartAction
 * クラスの説明：カートに商品をいれ、ms_cart.jsp（カートの中身表示画面）でカートの中身をリストとして表示する
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 */
public class CartAction extends ActionSupport implements SessionAware{

	private int num;
	private String item_name;
	private int item_price;
	private int item_id;
	private int sub_total;
	private int total;
	private int total_num;
	private String item_price_yen;
	private int max_num_flag;

	private ArrayList<CartBean> itemlist = new ArrayList<CartBean>();

    private Map<String, Object> sessionMap;

/* (非 Javadoc)
 * @see com.opensymphony.xwork2.ActionSupport#execute()
 */
@SuppressWarnings("unchecked")
public String execute() {


	//計算処理のためのクラスをインスタンス化
	CartCalculateAction ca =new CartCalculateAction();
	//セッションに商品がセットされていればここでitemlistにつめる。また、セッション内の総個数を取り出す
	if(sessionMap.containsKey("name_key")) {
    	itemlist=(ArrayList<CartBean>) sessionMap.get("name_key");
    	int cart_ttl_num=(int) sessionMap.get("cart_ttl_num");
    	total_num=ca.totalNum(itemlist,item_id,num,cart_ttl_num);
		}else{
			total_num += num;
}

	//もしカート内の個数が100個以上だとエラーページに飛ぶ
	if(100<total_num){
	    total=ca.sessionTtl(itemlist);
	    max_num_flag=1;
		return "success";

	}

	sessionMap.put("cart_ttl_num", total_num);

	//カートに何も入っていなければエラーページに飛ぶ
		if(item_id==0 && itemlist.size()==0){
			return "success";
		}

	    //商品の個数・値段を入れる
	    ca.setNum(num);
	    ca.setItem_price(item_price);

		if(sessionMap.containsKey("name_key")) {
    	ca.setItem_id(item_id);
    	//セッション内の商品の合計金額を計算
    	ca.sessionTtl(itemlist);
		}
		sub_total=ca.sub_total();
		//合計金額を計算
		total=ca.total();
		//合計金額に3桁ごとにコンマをつける処理
		NumberFormat nfttl = NumberFormat.getNumberInstance();
		sessionMap.put("cart_ttl",nfttl.format(total));


		//イテレーターでjspにリスト化するためにオブジェクトに値を詰める
		if(item_id!=0 && num!=0){
		CartBean bean=new CartBean();
		bean.setItem_id(item_id);
		bean.setNum(num);
		bean.setItem_name(item_name);
		bean.setItem_price(item_price);
		bean.setSub_total(sub_total);
		itemlist.add(bean);
		sessionMap.put("name_key",itemlist);
		}
		return "success";
   }




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
 * メソッド名：getTotal
 * メソッドの説明:
 * CartCalculateActionで計算したカート内の全商品の合計金額を送る
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @return total カート内の全商品の合計金額
 */
public int getTotal() {
	return total;
}




/**
 * メソッド名：getItem_price_yen
 * メソッドの説明:
 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)から
 * 取得した3桁ごとにコンマをつけた商品の値段を送る
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @return item_price_yen 3桁ごとにコンマをつけた商品の値段
 */
public String getItem_price_yen() {
	return item_price_yen;
}




/**
 * メソッド名：getTotal_yen
 * メソッドの説明:
 * CartCalculateActionで計算したカート内の全商品の合計金額(メンバ変数のtotal)を3桁ごとにコンマをつけて送る
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @return total_yen.format(total) 3桁ごとにコンマをつけたカート内の全商品の合計金額
 */
public String getTotal_yen() {
	NumberFormat total_yen = NumberFormat.getNumberInstance();
	return total_yen.format(total);
}



/**
 * メソッド名：getItemlist
 * メソッドの説明:
 * itemlistに格納されたカートの中身をms_cart.jsp（カートの中身表示画面）に送る
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @return itemlist カートの中身が格納されたリスト
 */
public ArrayList<CartBean> getItemlist() {
	return itemlist;
}




public Map<String, Object> getSession() {
	return sessionMap;
}




/**
 * メソッド名：getMax_num_flag
 * メソッドの説明:
 * max_num_flagを送る
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @return max_num_flag 総個数が制限以上になったときに1になる
 */
public int getMax_num_flag() {
	return max_num_flag;
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
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @param item_id 商品ID
 */
public void setItem_id(int item_id) {
	this.item_id = item_id;
}




/**
 * メソッド名：setTotal
 * メソッドの説明:
 * 単体試験のために作成した
 *
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @param total カート内の全商品の合計金額
 */
public void setTotal(int total) {
	this.total = total;
}




/**
 * メソッド名：setItem_price_yen
 * メソッドの説明:
 * ms_item_info.jsp(マイショップ商品一覧画面),ms_item_info_after.jsp(マイショップ商品一覧画面)から
 * 取得した3桁ごとにコンマをつけた商品の値段をもらう
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @param item_price_yen 3桁ごとにコンマをつけた商品の値段
 */
public void setItem_price_yen(String item_price_yen) {
	this.item_price_yen = item_price_yen;
}




/**
 * メソッド名：setItemlist
 * メソッドの説明:
 * 単体試験のために作成した
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @param itemlist カートの中身が格納されたリスト
 */
public void setItemlist(ArrayList<CartBean> itemlist) {
	this.itemlist = itemlist;
}




/**
 * メソッド名：setTotal_yen
 * メソッドの説明:
 * 単体試験のために作成した
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @param total カート内の全商品の合計金額
 */
public void setTotal_yen(int total) {
	NumberFormat total_yen = NumberFormat.getNumberInstance();
	total_yen.format(total);
}




public void setSession(Map<String, Object>  session){
this.sessionMap = session;
}




/**
 * メソッド名：setMax_num_flag
 * メソッドの説明:
 * max_num_flagを取得する
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @param max_num_flag 総個数が制限以上になったときに1になる
 */
public void setMax_num_flag(int max_num_flag) {
	this.max_num_flag = max_num_flag;
}



}



