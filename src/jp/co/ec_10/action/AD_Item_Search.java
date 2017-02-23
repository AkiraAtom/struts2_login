package jp.co.ec_10.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.ec_10.dao.ItemDAO;
import jp.co.ec_10.dto.AdminDTO;

import com.opensymphony.xwork2.ActionSupport;

public class AD_Item_Search  extends ActionSupport{

	public List<AdminDTO> itemlist = new ArrayList<AdminDTO>();
	public String kwd;

	public String Item_Search(){

		ItemDAO idao = new ItemDAO();
		idao.item_search_like(kwd);
		itemlist.addAll(idao.select_ALL());
		idao.item_all();

		return "success";

	}

	/**
	 * @param kwd セットする kwd
	 */
	public void setKwd(String kwd) {
		this.kwd = kwd;
	}

}
