package junit.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import jp.co.ec_10.dao.ItemSearchPagingDAO;
import jp.co.ec_10.dto.ItemDTO;

import org.junit.Before;
import org.junit.Test;

public class ItemSearchPagingDAOTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetItemlist() {
		ArrayList<ItemDTO> itemlist = new ArrayList<ItemDTO>();
		ItemSearchPagingDAO expected = new ItemSearchPagingDAO();
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
	public void testGetMax_id_flag() {
		int max_id_flag=1;
		ItemSearchPagingDAO  expected = new ItemSearchPagingDAO ();
		expected.setMax_id_flag(max_id_flag);
		assertEquals(max_id_flag, expected.getMax_id_flag());
	}

	@Test
	public void testGetList_count() {
		int list_count=40;
		ItemSearchPagingDAO expected = new ItemSearchPagingDAO();
		expected.setList_count(list_count);
		assertEquals(list_count, expected.getList_count());
	}

	@Test
	public void testGetPaging() {
		int paging=40;
		ItemSearchPagingDAO expected = new ItemSearchPagingDAO();
		expected.setPaging(paging);
		assertEquals(paging, expected.getPaging());
	}

	@Test
	public void testSetItemlist() {
		ArrayList<ItemDTO> itemlist = new ArrayList<ItemDTO>();
		ItemSearchPagingDAO expected = new ItemSearchPagingDAO();
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
	public void testSetMax_id_flag() {
		int max_id_flag=1;
		ItemSearchPagingDAO  expected = new ItemSearchPagingDAO ();
		expected.setMax_id_flag(max_id_flag);
		assertEquals(max_id_flag, expected.getMax_id_flag());
	}

	@Test
	public void testSetList_count() {
		int list_count=40;
		ItemSearchPagingDAO expected = new ItemSearchPagingDAO();
		expected.setList_count(list_count);
		assertEquals(list_count, expected.getList_count());
	}

	@Test
	public void testSetPaging() {
		int paging=40;
		ItemSearchPagingDAO expected = new ItemSearchPagingDAO();
		expected.setPaging(paging);
		assertEquals(paging, expected.getPaging());
	}

}
