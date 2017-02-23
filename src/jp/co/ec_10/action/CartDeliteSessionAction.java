package jp.co.ec_10.action;

import java.util.ArrayList;
import java.util.Map;

import jp.co.ec_10.bean.CartBean;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



/**
 * クラス名：CartDeliteSessionAction
 * クラスの説明：
 * カート内の商品を削除する
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 */
public class CartDeliteSessionAction extends ActionSupport implements SessionAware{


	/**
	 * メソッド名：sessionDelete
	 * メソッドの説明:
	 * カート内の商品を削除する
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param itemlist カートの中身が格納されたリスト
	 * @param item_id 商品ID
	 */
	public int sessionDelete(ArrayList<CartBean> itemlist,int item_id,int total_num){

   	 for (int i = 0; i < itemlist.size(); i++){
   		 int id_in_list= itemlist.get(i).getItem_id();
        	if(id_in_list==item_id){
        		//削除する商品の個数を、総個数から引く
        		int num=itemlist.get(i).getNum();
        		total_num -= num;
        		itemlist.remove(i);
        	}
   	 }
   	 return total_num;
	 }


	 public void setSession(Map<String, Object>  session){
		 }


}