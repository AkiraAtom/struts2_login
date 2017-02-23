package jp.co.ec_10.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.ec_10.dao.ItemSearchPagingDAO;
import jp.co.ec_10.dto.ItemDTO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * クラス名：ItemSearchPagingAction
 * クラスの説明：
 * ms_item_info.jsp（マイショップ商品一覧画面）でのページングの動作に関する処理をする
 * @author Watanabe
 * @version 1.0
 * @since 1.0
 */
public class ItemSearchPagingAction extends ActionSupport{

	private List<ItemDTO> itemlist = new ArrayList<ItemDTO>();
	private int paging;
	private String page;
	private String kwd;
	private int max_id_flag;
	private int list_count;
	private int min_id_flag;

	/* (非 Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	public String execute(){

		switch (page){
			case "next":
				if(max_id_flag==0){
					paging += 20;}
				break;
			case "back":
				if(paging>20){
					paging -= 20;
				}else if(paging==20){
					paging -= 20;
					min_id_flag=1;
				}else{
					min_id_flag=1;
				}
				break;
		}



		ItemSearchPagingDAO dao = new ItemSearchPagingDAO();
		dao.paging(kwd,paging);
		itemlist.addAll(dao.getItemlist());
		max_id_flag=dao.getMax_id_flag();
		list_count=dao.getList_count();

		return "success";
	}


	/**
	 * メソッド名：setMax_id_flag
	 * メソッドの説明:
	 * 検索結果が最後であれば 1を取得
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param max_id_flag 検索結果の最後を取得
	 */
	public void setMax_id_flag(int max_id_flag) {
		this.max_id_flag = max_id_flag;
	}
	/**
	 * メソッド名：getMax_id_flag()
	 * メソッドの説明:
	 * 検索結果が最後であれば 1を送る
	 *
	 * @author Watanabe
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
	 * 検索ワードにヒットした商品が item_table内に何件あるかを取得
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param list_count 検索ヒットした件数
	 */
	public void setList_count(int list_count) {
		this.list_count = list_count;
	}
	/**
	 * メソッド名：getList_count
	 * メソッドの説明:
	 * 検索ワードにヒットした商品が item_table内に何件あるかを送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return list_count 検索ヒットした件数
	 */
	public int getList_count() {
		return list_count;
	}



	/**
	 * メソッド名：getItemlist
	 * メソッドの説明:
	 * ms_item_info_after.jsp（マイショップ商品一覧画面（after））へ、データベースから取り出した商品データを格納したitemlistを送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return itemlist データベースから取り出した商品データが格納されている
	 */
	public List<ItemDTO> getItemlist() {
		return itemlist;
	}


	/**
	 * メソッド名：setPaging
	 * メソッドの説明:
	 * ms_item_info.jsp（マイショップ商品一覧画面）、ms_item_info.jsp_after（マイショップ商品一覧画面（after））から
	 * ページング処理に必要な値が格納されたpagingを取得する
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param paging ページング処理のための値
	 */
	public void setPaging(int paging) {
		this.paging = paging;
	}

	/**
	 * メソッド名：getPaging
	 * メソッドの説明:
	 * ms_item_info.jsp_after（マイショップ商品一覧画面（after））へ、ページング処理に必要な値が格納されたpagingを送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return ページング処理のための値
	 */
	public int getPaging() {
		return paging;
	}


	/**
	 * メソッド名：setPage
	 * メソッドの説明:
	 * ms_item_info_after.jsp（マイショップ商品一覧画面（after））にて「次の20件」ボタンを押下すると
	 * "next"を、「前の20件」ボタンを押下すると"back"を取得する、
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param page
	 * ms_item_info_after.jsp（マイショップ商品一覧画面（after））にて「次の20件」ボタンを押下すると
	 * "next"が、「前の20件」ボタンを押下すると"back"がItemSearchPagingActionへ送られ、pageに格納される
	 */
	public void setPage(String page) {
		this.page = page;
	}


	/**
	 * メソッド名：getKwd
	 * メソッドの説明:
	 * ms_item_info.jsp_after(マイショップ商品一覧画面（after）)へ検索ワードを送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return kwd 検索ワード
	 */
	public String getKwd() {
		return kwd;
	}


	/**
	 * メソッド名：setKwd
	 * メソッドの説明:
	 * ms_item_info.jsp_after(マイショップ商品一覧画面（after）)から検索ワードを取得する
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param kwd 検索ワード
	 */
	public void setKwd(String kwd) {
		this.kwd = kwd;
	}


	/**
	 * メソッド名：getMin_id_flag
	 * メソッドの説明:
	 *  ms_item_info_after.jsp（マイショップ商品一覧画面（after））にて「前の20件」ボタンを表示させない
	 *  ために立てるフラグを送る
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return min_id_flag 検索件数を遡ることができないときに立てるフラグ
	 */
	public int getMin_id_flag() {
		return min_id_flag;
	}


	/**
	 * メソッド名：setMin_id_flag
	 * メソッドの説明:
	 * ms_item_info_after.jsp（マイショップ商品一覧画面（after））にて「前の20件」ボタンを表示させない
	 * ために立てるフラグを取得する
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param min_id_flag 検索件数を遡ることができないときに立てるフラグ
	 */
	public void setMin_id_flag(int min_id_flag) {
		this.min_id_flag = min_id_flag;
	}


	//単体試験のために作成
	/**
	 * メソッド名：getPage
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @return page
	 *  ms_item_info_after.jsp（マイショップ商品一覧画面（after））にて「次の20件」ボタンを押下すると
	 * "next"が、「前の20件」ボタンを押下すると"back"がItemSearchPagingActionへ送られ、pageに格納される
	 */
	public String getPage() {
		return page;
	}

	/**
	 * メソッド名：setItemlist
	 * メソッドの説明:
	 * 単体試験のために作成した
	 *
	 * @author Watanabe
	 * @version 1.0
	 * @since 1.0
	 * @param itemlist データベースから取り出した商品データが格納されている
	 */
	public void setItemlist(List<ItemDTO> itemlist) {
		this.itemlist = itemlist;
	}





}
