package jp.co.ec_10.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jp.co.ec_10.dao.ItemDAO;
import jp.co.ec_10.dao.LoginDAO;
import jp.co.ec_10.dto.AdminDTO;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * クラス名：Login_Action
 * クラスの説明：ログイン処理を行う
 *
 * @author Yamanobe
 * @version 1.0
 * @since 1.0
 */
public class Login_Action extends ActionSupport implements SessionAware{

	private String input_pass;
	private String input_id;
	private Map<String, Object>  sessionMap;
	public List<AdminDTO> itemlist = new ArrayList<AdminDTO>();
	int list_count;
	public String msg;

	/* (非 Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 * 説明：ログイン画面からID,PASSを取得し、管理者テーブルから管理者名を呼び出す
	 * その値がNULLでなければログイン可とする
	 */
	public String execute() {

		LoginDAO ldao = new LoginDAO(input_id, input_pass);

		if(ldao.admin_name == null){
			msg = "IDかPASSが間違っています";
			return "error";
		}else{

			sessionMap.put("ad_name_Key", ldao.admin_name);

			ItemDAO idao = new ItemDAO();
			idao.item_select(0);
			itemlist.addAll(idao.select_ALL());
			idao.item_all();
			list_count = idao.list_count;

			return "success";
		}
	}

	/* (非 Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	public void setSession(Map<String, Object>  sessionMap){
		this.sessionMap = sessionMap;
	}
	/**
	 * メソッド名：setInput_pass
	 * メソッドの説明：入力された管理者PASSを取得
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param input_pass 入力された管理者PASS
	 */
	public void setInput_pass(String input_pass) {
		this.input_pass = input_pass;
	}

	/**
	 * メソッド名：setInput_id
	 * メソッドの説明：入力された管理者IDを取得
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param input_id 入力された管理者ID
	 */
	public void setInput_id(String input_id) {
		this.input_id = input_id;
	}

	/**
	 * メソッド名：getList_count
	 * メソッドの説明：list_countをJSPに送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return list_count 商品情報テーブルの総数
	 */
	public int getList_count() {
		return list_count;
	}


	/**
	 * メソッド名：getInput_pass
	 * メソッドの説明：Login_Action-validation.xmlにて入力チェックを行うため値を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return 入力された管理者PASS
	 */
	public String getInput_pass() {
		return input_pass;
	}


	/**
	 * メソッド名：getInput_id
	 * メソッドの説明：Login_Action-validation.xmlにて入力チェックを行うため値を送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return 入力された管理者ID
	 */
	public String getInput_id() {
		return input_id;
	}

}
