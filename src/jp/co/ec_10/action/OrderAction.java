package jp.co.ec_10.action;

import java.util.ArrayList;
import java.util.Map;

import jp.co.ec_10.bean.CartBean;
import jp.co.ec_10.dao.ItemDAO;
import jp.co.ec_10.dao.OrderDAO;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * クラス名：OrderAction
 * クラスの説明：注文内容をDBに登録, 注文した個数だけ商品の在庫を減らす
 *
 * @author mitsuda
 * @version 1.0
 * @since 1.0
 */
public class OrderAction extends ActionSupport implements SessionAware {

	//DBに登録する注文情報
	private String customer_name;
	private String mail;
	private String tel;
	private String post;
	private String destination;
	private Map<String, Object> sessionMap;
	private ArrayList<CartBean> itemlist = new ArrayList<CartBean>();
	private int flg;


	/* (非 Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@SuppressWarnings("unchecked")
	public String execute() throws Exception{

		itemlist=(ArrayList<CartBean>) sessionMap.get("name_key");
		customer_name=(String) sessionMap.get("customer_name_key");
		mail=(String) sessionMap.get("mail_key");
		tel=(String) sessionMap.get("tel_key");
		post=(String) sessionMap.get("post_key");
		destination=(String) sessionMap.get("destination_key");

		if (customer_name==null || mail==null || tel==null || post==null || destination==null || itemlist==null ) {
			flg=2;
			return SUCCESS;
		}else {
		OrderDAO odao = new OrderDAO();
		odao.order_confirm(itemlist, customer_name, post, tel, mail, destination);

		ItemDAO idao = new ItemDAO();
		idao.item_reduce(itemlist);
		flg=idao.flg;
		sessionMap.clear();
		return SUCCESS;
		}

	}

	/* (非 Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	/**
	 * メソッド名： getFlg
	 * メソッドの説明: FlgをJSPに送る
	 *
	 * @author mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @return flg
	 */
	public int getFlg() {
		return flg;
	}

	/**
	 * メソッド名： setFlg
	 * メソッドの説明:
	 *
	 * @author
	 * @version 1.0
	 * @since 1.0
	 * @param flg "0","1","2"のどれかを取得する
	 */
	public void setFlg(int flg) {
		this.flg = flg;
	}
}
