package jp.co.ec_10.action;


import java.sql.SQLException;
import java.util.ArrayList;

import jp.co.ec_10.dao.ItemSearchDAO;
import jp.co.ec_10.dto.ItemDTO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * クラス名：ItemSearchAction
 * クラスの説明：ms_item_info.jsp（マイショップ商品一覧画面）にてkwd（検索ワード）を取得し、
 * ms_item_info_after.jsp（マイショップ商品一覧画面（after））にて20件ごとに表示する
 *
 * @author Kitahara
 * @version 1.0
 * @since 1.0
 */
public class ItemSearchAction extends ActionSupport{

	private String kwd;
	private int max_id_flag;
	private int list_count;
	private int paging;
	private int min_id_flag=1;

	public ArrayList<ItemDTO> itemlist = new ArrayList<ItemDTO>();

    public String execute() throws SQLException {

    	ItemSearchDAO itemsearchDao =new ItemSearchDAO();
    	itemsearchDao.itemsearch(kwd);
        itemlist.addAll( itemsearchDao.selectALL() );

        max_id_flag=itemsearchDao.getMax_id_flag();
        list_count=itemsearchDao.getList_count();

        return SUCCESS;

    }

    /**
     * メソッド名：setKwd
     * メソッドの説明：ms_item_info.jspから検索ワードを取得
     *
     * @author Kitahara
     * @version 1.0
     * @since 1.0
     * @param kwd 検索のキーワード
     */
    public void setKwd(String kwd) {
		this.kwd = kwd;
	}


	/**
	 * メソッド名：getKwd
	 * メソッドの説明：ms_item_info.jspへ検索ワードを送付
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @return kwd 検索のキーワード
	 */
	public String getKwd() {
		return kwd;
	}

	/**
	 * メソッド名：setMax_id_flag
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @param max_id_flag 検索結果の最終行まできたときに立てるフラグ
	 */
	public void setMax_id_flag(int max_id_flag) {
		this.max_id_flag = max_id_flag;
	}

    /**
     * メソッド名：getMax_id_flag
     * メソッドの説明：検索結果が最後であれば 1を取得
     *
     * @author Yamanobe
     * @version 1.0
     * @since 1.0
     * @return max_id_flag 検索結果の最後を取得
     */
    public int getMax_id_flag() {
		return max_id_flag;
	}

    /**
	 * メソッド名：setList_count
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @param list_count 検索でヒットした件数
	 */
	public void setList_count(int list_count) {
		this.list_count = list_count;
	}

    /**
     * メソッド名：getList_count
     * メソッドの説明：検索ワードにヒットした商品が item_table内に何件あるかを取得
     *
     * @author Kitahara
     * @version 1.0
     * @since 1.0
     * @return list_count 検索ヒットした件数
     */
    public int getList_count() {
		return list_count;
	}

    /**
	 * メソッド名：setPaging
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @param paging ページング処理のための値
	 */
	public void setPaging(int paging) {
		this.paging = paging;
	}


    /**
	 * メソッド名：getPaging
	 * メソッドの説明：ms_item_info_after.jspへ検索結果ページの初期値として利用
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @return 初期値 0
	 */
	public int getPaging() {
		return paging;
	}


	//単体試験のために作成
	/**
	 * メソッド名：setItemlist
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @param itemlist データベースから取り出した商品データが格納されている
	 */
	public void setItemlist(ArrayList<ItemDTO> itemlist) {
		this.itemlist = itemlist;
	}


	/**
     * メソッド名：getItemlist
     * メソッドの説明：ItemSearchDAOからitemlistを取得し、ms_item_info_after.jspへ展開する
     *
     * @author Kitahara
     * @version 1.0
     * @since 1.0
     * @return itemlist 検索結果を取得したリスト
     */
    public ArrayList<ItemDTO> getItemlist() {
    	// jspから<s:property value="itemlist" />で参照可能。
    	return itemlist;
    }


    /**
	 * メソッド名：setMin_id_flag
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @param min_id_flag 検索結果の最終行まできたときに立てるフラグ
	 */
	public void setMin_id_flag(int min_id_flag) {
		this.min_id_flag = min_id_flag;
	}

	/**
	 * メソッド名：getMin_id_flag 検索結果が最後であれば 1を送付
	 * メソッドの説明：
	 *
	 * @author Kitahara
	 * @version 1.0
	 * @since 1.0
	 * @return min_id_flag 検索結果が最後であれば 1を送付
	 */
	public int getMin_id_flag() {
		return min_id_flag;
	}


}