package jp.co.ec_10.action;

import java.util.ArrayList;
import java.util.Map;

import jp.co.ec_10.bean.CartBean;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



/**
 * クラス名：CartCalculateAction
 * クラスの説明：
 * カート内の商品に関する計算を行う
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 */
public class CartCalculateAction extends ActionSupport implements SessionAware{

	private int item_id;
	private int num;
	private int item_price;
	private int flag;
	private int session_ttl;
	private int sub_total;
	private int flag1_flag;


/**
 * メソッド名：sessionTtl
 * メソッドの説明:
 * セッション内に入っているカート内の商品の合計金額を計算する
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @return itemlist カートの中身が格納されたリスト
 */
public int sessionTtl(ArrayList<CartBean> itemlist) {

    	 for (int i = 0; i < itemlist.size(); i++){
 			//セッションのリストのひとつの要素からitem_idを取り出すための処理
 			int part=itemlist.get(i).getItem_id();
         	if(part==item_id){
         		itemlist.remove(i);
         		//リストを削除するとその分繰り返し分が少なくなるためここでiから1ひく
         		i--;
         		flag=1;
         	}

         	//セッション内のリストからそれぞれの商品の小計を取り出し、合計金額に加算していく処理
         	//flagが立っていれば個数と商品との値段を計算し、合計金額に加算する
         	if(flag==0){
            int part2 = itemlist.get(i).getSub_total();
         	session_ttl += part2;
         	}else{
         	sub_total = num * item_price;
         	session_ttl += sub_total;
         	flag1_flag=1;
         	flag=0;
         	}
         	}
    	 if(flag1_flag==1){
    		 flag=1;
    	 }
    	 return session_ttl;
   }


/**
 * メソッド名：sub_total
 * メソッドの説明:
 * カート内の商品の小計金額を計算、取得する
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @return sub_total カート内の商品の小計金額
 */
public int sub_total(){
	//既存の商品をカートに入れた場合、すでにsub_totalの計算は終わっているためif文で分岐させる
	if(flag==0){
		sub_total=num * item_price;
	}
	return sub_total;
}


/**
 * メソッド名：total
 * メソッドの説明:
 * カート内の合計金額を計算する
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @return total カート内の合計金額
 */
public int total(){
		int total;
		//セッションにすでに入っている商品をカートに入れた場合はすでにsession_ttlに合計金額が入っているため
		//if文で分岐させた
		if(flag==1){
			total=session_ttl;
		}else{
		total=sub_total+session_ttl;
		}
		return total;

}

/**
 * メソッド名：totalNum
 * メソッドの説明:
 * カート内の商品の総個数を計算するためのメソッド
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @param itemlist カートの中身が格納されたリスト
 * @param item_id 商品ID
 * @param num 商品の個数
 * @param cart_ttl_num セッション内のカート内の商品の総個数
 * @return total_num 新しく追加された商品を含むカート内の商品の総個数
 */
public int totalNum(ArrayList<CartBean> itemlist, int item_id,int num,int cart_ttl_num) {
	for (int i = 0; i < itemlist.size(); i++){
	 			int part=itemlist.get(i).getItem_id();
	         	if(part==item_id){
	         		cart_ttl_num -= itemlist.get(i).getNum();
	         	}
	}
	int total_num=cart_ttl_num+num;
	return total_num;
}

/**
 * メソッド名：setItem_id
 * メソッドの説明:
 * CartAction内の商品IDを取得する
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
 * メソッド名：getItem_id
 * メソッドの説明:
 * 単体試験のために作成した
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
 * CartAction内の商品の個数を取得する
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
 * メソッド名：getNum
 * メソッドの説明:
 * 単体試験のために作成した
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
 * メソッド名：getItem_price
 * メソッドの説明:
 * 単体試験のために作成した
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @return num 商品の個数
 */
public int getItem_price() {
	return item_price;
}

/**
 * メソッド名：setItem_price
 * メソッドの説明:
 * CartAction内の商品の値段を取得する
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 * @param item_price 商品の値段
 */
public void setItem_price(int item_price) {
	this.item_price = item_price;
}

@Override
public void setSession(Map<String, Object> arg0) {
	// TODO 自動生成されたメソッド・スタブ

}
}
