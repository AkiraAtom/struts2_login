package jp.co.ec_10.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * クラス名：OrderCheckAction
 * クラスの説明：お客様情報をセッションに保持する
 *
 * @author Mitsuda
 * @version 1.0
 * @since 1.0
 */
public class OrderCheckAction extends ActionSupport implements SessionAware{

	//お客様情報の項目
	private String customer_name;
	private String mail;
	private String mail_check;
	private String tel;
	private String post;
	private String ken;
	private String address;
	private String destination;
	private String ret;
	private String mailerror;

	private Map<String, Object> sessionMap;

public String execute() throws Exception{

	//メールアドレスの内容一致をチェック

		mailerror=null;
		ret = SUCCESS;

		sessionMap.put("customer_name_key",customer_name);
		sessionMap.put("mail_key",mail);
		sessionMap.put("tel_key",tel);
		sessionMap.put("post_key",post);
		sessionMap.put("ken_key",ken);
		sessionMap.put("address_key",address);

		if (!(mail.equals(mail_check))) {
			mailerror = "メールアドレスの内容が一致していません";
			ret=ERROR;
			return ret;
		}
		sessionMap.put("mail_check_key",mail);
		destination = ken + address;
		sessionMap.put("destination_key",destination);

		return ret;
}

	//setter getter
	/**
	 * メソッド名：getCustomer_name
	 * メソッドの説明: JUnitテストのために設置
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @return customer_name
	 */
	public String getCustomer_name() {
		return customer_name;
	}
	/**
	 * メソッド名：setCustomer_name
	 * メソッドの説明: ms_customer.jsp(お客様情報入力画面)で入力された
	 * 名前を取得する
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param customer_name 入力された名前
	 */
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	/**
	 * メソッド名：getMail
	 * メソッドの説明:JUnitテストのために設置
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * メソッド名：setMail
	 * メソッドの説明 : ms_customer.jsp(お客様情報入力画面)で入力された
	 * メールアドレスを取得する
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param mail 入力されたメールアドレス
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * メソッド名：getMail_check
	 * メソッドの説明:JUnitテストのために設置
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @return mail_check
	 */
	public String getMail_check() {
		return mail_check;
	}
	/**
	 * メソッド名：setMail_check
	 * メソッドの説明 : ms_customer.jsp(お客様情報入力画面)で入力された
	 * メールアドレス(確認用)を取得する
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param mail_check 入力されたメールアドレス(確認用)
	 */
	public void setMail_check(String mail_check) {
		this.mail_check = mail_check;
	}
	/**
	 * メソッド名：getTel
	 * メソッドの説明:JUnitテストのために設置
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * メソッド名：setTel
	 * メソッドの説明 : ms_customer.jsp(お客様情報入力画面)で入力された
	 * 電話番号を取得する
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param tel 入力された電話番号
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * メソッド名：getPost
	 * メソッドの説明:JUnitテストのために設置
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @return post
	 */
	public String getPost() {
		return post;
	}
	/**
	 * メソッド名：setPost
	 * メソッドの説明 : ms_customer.jsp(お客様情報入力画面)で入力された
	 * 郵便番号を取得する
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param post 入力された郵便番号
	 */
	public void setPost(String post) {
		this.post = post;
	}
	/**
	 * メソッド名：getKen
	 * メソッドの説明:JUnitテストのために設置
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @return ken
	 */
	public String getKen() {
		return ken;
	}
	/**
	 * メソッド名：setken
	 * メソッドの説明 : ms_customer.jsp(お客様情報入力画面)で選択された
	 * 都道府県を取得する
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param ken 選択された都道府県
	 */
	public void setKen(String ken) {
		this.ken = ken;
	}
	/**
	 * メソッド名：getAddress
	 * メソッドの説明:JUnitテストのために設置
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * メソッド名：setAddress
	 * メソッドの説明 : ms_customer.jsp(お客様情報入力画面)で入力された
	 * 住所を取得する
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param address 入力された住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * メソッド名：getMailerror
	 * メソッドの説明:JUnitテストのために設置
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @return mailerror
	 */
	public String getMailerror() {
		return mailerror;
	}

	/**
	 * メソッド名：setMailerror
	 * メソッドの説明 : JUnitテストのために設置
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param mailerror 代入されたメッセージ
	 */
	public void setMailerror(String mailerror) {
		this.mailerror = mailerror;
	}

	/**
	 * メソッド名：getDestination
	 * メソッドの説明: destinationをOrderAction.javaに送る
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @return mail
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * メソッド名：setDestination
	 * メソッドの説明 : JUnitテストのために設置
	 *
	 * @author Mitsuda
	 * @version 1.0
	 * @since 1.0
	 * @param destination kenとaddressを組み合わせた届け先
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/* (非 Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	/* (非 Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;

	}

}
