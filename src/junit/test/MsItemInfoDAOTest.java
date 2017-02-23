package junit.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import jp.co.ec_10.dao.MsItemInfoDAO;
import jp.co.ec_10.dto.ItemDTO;

import org.junit.Before;
import org.junit.Test;

public class MsItemInfoDAOTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetItemlist() {
		ArrayList<ItemDTO> itemlist = new ArrayList<ItemDTO>();
		MsItemInfoDAO expected = new MsItemInfoDAO();
		ItemDTO bean = new ItemDTO();
		int item_id=2;
		String item_name="日本酒";
		int item_price=2000;
		int item_stock=5;
		String Item_img="img/noimage.jpg";
		bean.setItem_id(item_id);
		bean.setItem_name(item_name);
		bean.setItem_price(item_price);
		bean.setItem_stock(item_stock);
		bean.setItem_img(Item_img);
		itemlist.add(bean);
		expected.setItemlist(itemlist);
		ArrayList<ItemDTO> value = expected.getItemlist();
		assertEquals(value, itemlist);
	}

	@Test
	public void testGetItemlist() {
		ArrayList<ItemDTO> itemlist = new ArrayList<ItemDTO>();
		MsItemInfoDAO expected = new MsItemInfoDAO();
		ItemDTO bean = new ItemDTO();
		int item_id=2;
		String item_name="日本酒";
		int item_price=2000;
		int item_stock=5;
		String Item_img="img/noimage.jpg";
		bean.setItem_id(item_id);
		bean.setItem_name(item_name);
		bean.setItem_price(item_price);
		bean.setItem_stock(item_stock);
		bean.setItem_img(Item_img);
		itemlist.add(bean);
		expected.setItemlist(itemlist);
		ArrayList<ItemDTO> value = expected.getItemlist();
		assertEquals(value, itemlist);
	}

}
