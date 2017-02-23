package jp.co.ec_10.action;

import java.util.ArrayList;
import java.util.Map;

import jp.co.ec_10.bean.CartBean;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



/**
 * クラス名：CartDeleteAction
 * クラスの説明：
 * カート内の商品を削除する
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 */
public class CartDeleteAction extends ActionSupport implements SessionAware{

	 private Map<String, Object> sessionMap;
	 private int item_id;
	 private int total_num;

	private ArrayList<CartBean> itemlist = new ArrayList<CartBean>();


	/* (非 Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@SuppressWarnings("unchecked")
	public String execute(){
		itemlist=(ArrayList<CartBean>) sessionMap.get("name_key");
		total_num=(int) sessionMap.get("cart_ttl_num");
		CartDeliteSessionAction cdsa =new CartDeliteSessionAction();

		total_num=cdsa.sessionDelete(itemlist,item_id,total_num);
		sessionMap.put("cart_ttl_num",total_num);

		 return "success";
	 }


	 public void setSession(Map<String, Object>  session){
		 this.sessionMap = session;
		 }

	 /**
	 * メソッド名：Item_id
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
	 * メソッド名：setItem_id
	 * メソッドの説明:
	 * ms_cart.jsp(カートの中身表示画面)から商品IDを取得する
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param item_id 商品ID
	 */
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	 	 }


}