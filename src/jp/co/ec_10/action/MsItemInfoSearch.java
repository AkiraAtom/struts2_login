package jp.co.ec_10.action;

import java.util.ArrayList;

import jp.co.ec_10.dao.MsItemInfoDAO;
import jp.co.ec_10.dto.ItemDTO;


/**
 * クラス名：MsItemInfoSearch
 * クラスの説明：
 * ms_item_info.jsp（マイショップ商品一覧画面）に商品一覧を表示させる
 *
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 */
public class MsItemInfoSearch {

	private  ArrayList<ItemDTO> itemlist = new ArrayList<ItemDTO>(4);


	/**
	 * メソッド名：execute
	 * メソッドの説明:
	 * トップページに商品一覧を表示させる
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return "success" ms_item_info.jsp（マイショップ商品一覧画面）へ遷移する
	 */
	public String execute() {
        MsItemInfoDAO dao = new MsItemInfoDAO();
        dao.num_search();
        itemlist=dao.getItemlist();

        return "success";
    }

	/**
	 * メソッド名：setItemlist
	 * メソッドの説明:
	 * 単体試験のために作成
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param itemlist データベースのitem_tableから取り出した商品がリストとして格納されている
	 */
	public void setItemlist(ArrayList<ItemDTO> itemlist) {
		this.itemlist = itemlist;
	}

    /**
     * メソッド名：getItemlist
     * メソッドの説明:
     * データベースのitem_tableから取り出した商品がリストとして格納されているitemlistを
     * ms_item_info.jsp（マイショップ商品一覧画面）へ送る
     *
     * @author Watanabe
     * @version 1.0
     * @since 1.0
     * @return itemlist データベースのitem_tableから取り出した商品がリストとして格納されている
     */
    public ArrayList<ItemDTO> getItemlist() {
		return itemlist;
	}


}