package jp.co.ec_10.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.ec_10.dao.ItemDAO;
import jp.co.ec_10.dto.AdminDTO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * クラス名：AD_Item_Edit
 * クラスの説明：商品の変更と登録を行う
 *
 * @author Yamanobe
 * @version 1.0
 * @since 1.0
 */
public class AD_Item_Edit extends ActionSupport{

	public List<AdminDTO> itemlist = new ArrayList<AdminDTO>();
	int list_count;

	private String inputitem;
	private String inputprice;
	private String inputstock;
	private String inputimg;
	private String inputid;
	public String msg;

	/**
	 * メソッド名：itemedit
	 * メソッドの説明：ad_item_info.jsp(商品一覧画面)で選択された商品を変更する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return success ad_item_info.jspへ遷移する
	 */
	public String itemedit() {

		if(inputprice.equals("0")){
			msg = "値段は 1以上を入力してください";
			return "error";
		}

		if(inputimg.equals("") || inputimg.equals(null)){
			inputimg = "img/noimage.jpg";
		}
		if(!(inputimg.startsWith("img/"))){
			inputimg = "img/" +inputimg;
		}
		if(!(inputimg.endsWith(".jpg"))){
			inputimg +=".jpg";
		}

		ItemDAO idao = new ItemDAO();
		idao.item_edit(inputitem, inputprice, inputstock, inputimg, inputid);

		idao.item_select(0);
		itemlist.addAll(idao.select_ALL());
		idao.item_all();
		list_count = idao.list_count;
		msg = "編集完了しました";
		return "success";
	}

		/**
		 * メソッド名：itemreg
		 * メソッドの説明：商品を登録する
		 *
		 * @author Yamanobe
		 * @version 1.0
		 * @since 1.0
		 * @return success ad_item_register.jsp(商品登録画面)へ遷移する
		 */
		public String itemreg(){

			if(inputprice.equals("0")){
				msg = "値段は 1以上を入力してください";
				return "error";
			}

			if(inputimg.equals("") || inputimg.equals(null)){
				inputimg = "img/noimage.jpg";
			}
			if(!(inputimg.startsWith("img/"))){
				inputimg = "img/" +inputimg;
			}
			if(!(inputimg.endsWith(".jpg"))){
				inputimg +=".jpg";
			}

			ItemDAO idao = new ItemDAO();
			idao.item_reg(inputitem, inputprice, inputstock, inputimg);

			msg = "登録完了しました";
			return "success";
		}


	/**
	 * メソッド名：getList_count
	 * メソッドの説明：list_countをJSPに送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return list_count (商品情報・注文情報)の各テーブルの総数
	 */
	public int getList_count() {
		return list_count;
	}

	/**
	 * メソッド名：getInputitem
	 * メソッドの説明：ad_item_edit.jsp(商品編集画面),ad_item_register.jsp(商品登録画面)にて入力された商品名
	 * を、AD_Item_Edit-validation.xmlによってエラーチェックを行うために送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return inputitem 入力された商品名
	 */
	public String getInputitem() {
		return inputitem;
	}
	/**
	 * メソッド名：getInputprice
	 * メソッドの説明：ad_item_edit.jsp(商品編集画面),ad_item_register.jsp(商品登録画面)にて入力された値段
	 * を、AD_Item_Edit-validation.xmlによってエラーチェックを行うために送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return inputitem 入力された値段
	 */
	public String getInputprice() {
		return inputprice;
	}
	/**
	 * メソッド名：getInputstock
	 * メソッドの説明：ad_item_edit.jsp(商品編集画面),ad_item_register.jsp(商品登録画面)にて入力された在庫
	 * を、AD_Item_Edit-validation.xmlによってエラーチェックを行うために送る
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @return inputitem 入力された在庫
	 */
	public String getInputstock() {
		return inputstock;
	}
	/**
	 * メソッド名：setInputitem
	 * メソッドの説明：ad_item_edit.jsp(商品編集画面),ad_item_register.jsp(商品登録画面)にて入力された商品名
	 * を、取得する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param inputitem 入力された商品名
	 */
	public void setInputitem(String inputitem) {
		this.inputitem = inputitem;
	}

	/**
	 * メソッド名：setInputprice
	 * メソッドの説明：ad_item_edit.jsp(商品編集画面),ad_item_register.jsp(商品登録画面)にて入力された値段
	 * を、取得する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param inputprice 入力された値段
	 */
	public void setInputprice(String inputprice) {
		this.inputprice = inputprice;
	}

	/**
	 * メソッド名：setInputstock
	 * メソッドの説明：ad_item_edit.jsp(商品編集画面),ad_item_register.jsp(商品登録画面)にて入力された在庫
	 * を、取得する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param inputstock 入力された在庫
	 */
	public void setInputstock(String inputstock) {
		this.inputstock = inputstock;
	}

	/**
	 * メソッド名：setInputimg
	 * メソッドの説明：ad_item_edit.jsp(商品編集画面),ad_item_register.jsp(商品登録画面)にて入力された画像パス
	 * を、取得する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param inputimg 入力された画像パス(default "img/noimage.jpg")
	 */
	public void setInputimg(String inputimg) {
		this.inputimg = inputimg;
	}

	/**
	 * メソッド名：setInputid
	 * メソッドの説明：ad_item_edit.jsp(商品編集画面)にて選択されている商品ID
	 * を、取得する
	 *
	 * @author Yamanobe
	 * @version 1.0
	 * @since 1.0
	 * @param inputid 選択されている商品ID
	 */
	public void setInputid(String inputid) {
		this.inputid = inputid;
	}

}
