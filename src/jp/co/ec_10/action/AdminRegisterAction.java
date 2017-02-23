package jp.co.ec_10.action;

import java.sql.SQLException;

import jp.co.ec_10.dao.CountDAO;
import jp.co.ec_10.dao.RegistDAO;

import com.opensymphony.xwork2.ActionSupport;

public class AdminRegisterAction extends ActionSupport  {

	//基本フィールド
	private String ad_ID;
	private String ad_NAME;
	private String ad_PASS;
	private String ad_PASS2;

	public int ad_list_count;

	//エラーフィールド
	private String passerror;
	private String duplication_ad_ID;
	private String IDPASS_check;

	public String execute() throws SQLException{
		setPasserror(null);

		CountDAO cDAO = new CountDAO(ad_ID);
		ad_list_count = cDAO.ad_list_count;

		//確認パスワードが一致されていない場合エラー出力
		if(!(ad_PASS.equals(ad_PASS2))){
			setPasserror("※パスワードが一致していません");
			return "error";

		//管理者IDが重複した場合エラー出力
		}else if(cDAO.ad_list_count == 1){
			setDuplication_ad_ID("※この管理者IDはすでに使用されています");
			return "error";

		//管理者IDとパスワードが同値の場合エラー出力
		}else if(ad_ID.equals(ad_PASS2)){
			setIDPASS_check("※管理者IDとパスワードは同じものを使えません");
			return "error";
		}

		//RegistDAOをインスタンス化し、即実行
		RegistDAO rDAO = new RegistDAO(ad_ID,ad_NAME,ad_PASS);


		return "success";
	}


	public String getAd_ID() {
		return ad_ID;
	}

	public void setAd_ID(String ad_ID) {
		this.ad_ID = ad_ID;
	}

	public String getAd_NAME() {
		return ad_NAME;
	}

	public void setAd_NAME(String ad_NAME) {
		this.ad_NAME = ad_NAME;
	}

	public String getAd_PASS() {
		return ad_PASS;
	}

	public void setAd_PASS(String ad_PASS) {
		this.ad_PASS = ad_PASS;
	}

	public String getAd_PASS2() {
		return ad_PASS2;
	}

	public void setAd_PASS2(String ad_PASS2) {
		this.ad_PASS2 = ad_PASS2;
	}


	public String getPasserror() {
		return passerror;
	}


	public void setPasserror(String passerror) {
		this.passerror = passerror;
	}


	public String getDuplication_ad_ID() {
		return duplication_ad_ID;
	}


	public void setDuplication_ad_ID(String duplication_ad_ID) {
		this.duplication_ad_ID = duplication_ad_ID;
	}


	public String getIDPASS_check() {
		return IDPASS_check;
	}

	public void setIDPASS_check(String iDPASS_check) {
		IDPASS_check = iDPASS_check;
	}

	//setget
	public int getad_list_count() {
		return ad_list_count;
	}

	public void setad_list_count(int ad_list_count) {
		this.ad_list_count = ad_list_count;
	}

}
