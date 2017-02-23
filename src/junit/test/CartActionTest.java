package junit.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import jp.co.ec_10.action.CartAction;
import jp.co.ec_10.bean.CartBean;

import org.junit.Before;
import org.junit.Test;

public class CartActionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetNum() {
		int num=3;
		CartAction expected = new CartAction();
		expected.setNum(num);
		assertEquals(num, expected.getNum());
	}

	@Test
	public void testGetItem_name() {
		String item_name="item_name";
		CartAction expected = new CartAction();
		expected.setItem_name(item_name);
		String value = expected.getItem_name();
		assertEquals(value, item_name);
	}

	@Test
	public void testGetItem_price() {
		int item_price=3;
		CartAction expected = new CartAction();
		expected.setItem_price(item_price);
		assertEquals(item_price, expected.getItem_price());
	}

	@Test
	public void testGetItem_id() {
		int item_id=3;
		CartAction expected = new CartAction();
		expected.setItem_id(item_id);
		assertEquals(item_id, expected.getItem_id());
	}

	@Test
	public void testGetTotal() {
		String total_yen="2,000";
		int total=2000;
		CartAction expected = new CartAction();
		expected.setTotal(total);
		String value = expected.getTotal_yen();
		assertEquals(value, total_yen);
	}

	@Test
	public void testGetItem_price_yen() {
		String item_price_yen="item_price_yen";
		CartAction expected = new CartAction();
		expected.setItem_price_yen(item_price_yen);
		String value = expected.getItem_price_yen();
		assertEquals(value, item_price_yen);
	}

	@Test
	public void testGetTotal_yen() {
		String total_yen="2,000";
		int total=2000;
		CartAction expected = new CartAction();
		expected.setTotal(total);
		String value = expected.getTotal_yen();
		assertEquals(value, total_yen);
	}

	@Test
	public void testGetItemlist() {
		ArrayList<CartBean> itemlist = new ArrayList<CartBean>();
		CartAction expected = new CartAction();
		CartBean bean = new CartBean();
		int item_id=2;
		int num=3;
		String item_name="日本酒";
		int item_price=2000;
		int sub_total=num * item_price;
		bean.setItem_id(item_id);
		bean.setNum(num);
		bean.setItem_name(item_name);
		bean.setItem_price(item_price);
		bean.setSub_total(sub_total);
		itemlist.add(bean);
		expected.setItemlist(itemlist);
		ArrayList<CartBean> value = expected.getItemlist();
		assertEquals(value, itemlist);
	}

	@Test
	public void testGetMax_num_flag() {
		int max_num_flag=1;
		CartAction expected = new CartAction();
		expected.setMax_num_flag(max_num_flag);
		assertEquals(max_num_flag, expected.getMax_num_flag());
	}
	@Test
	public void testSetNum() {
		int num=3;
		CartAction expected = new CartAction();
		expected.setNum(num);
		assertEquals(num, expected.getNum());
	}

	@Test
	public void testSetItem_name() {
		String item_name="item_name";
		CartAction expected = new CartAction();
		expected.setItem_name(item_name);
		String value = expected.getItem_name();
		assertEquals(value, item_name);
	}

	@Test
	public void testSetItem_price() {
		int item_price=3;
		CartAction expected = new CartAction();
		expected.setItem_price(item_price);
		assertEquals(item_price, expected.getItem_price());
	}

	@Test
	public void testSetItem_id() {
		int item_id=3;
		CartAction expected = new CartAction();
		expected.setItem_id(item_id);
		assertEquals(item_id, expected.getItem_id());
	}

	@Test
	public void testSetTotal() {
		String total_yen="2,000";
		int total=2000;
		CartAction expected = new CartAction();
		expected.setTotal(total);
		String value = expected.getTotal_yen();
		assertEquals(value, total_yen);
	}

	@Test
	public void testSetItem_price_yen() {
		String item_price_yen="item_price_yen";
		CartAction expected = new CartAction();
		expected.setItem_price_yen(item_price_yen);
		String value = expected.getItem_price_yen();
		assertEquals(value, item_price_yen);
	}

	@Test
	public void testSetItemlist() {
		ArrayList<CartBean> itemlist = new ArrayList<CartBean>();
		CartAction expected = new CartAction();
		CartBean bean = new CartBean();
		int item_id=2;
		int num=3;
		String item_name="日本酒";
		int item_price=2000;
		int sub_total=num * item_price;
		bean.setItem_id(item_id);
		bean.setNum(num);
		bean.setItem_name(item_name);
		bean.setItem_price(item_price);
		bean.setSub_total(sub_total);
		itemlist.add(bean);
		expected.setItemlist(itemlist);
		ArrayList<CartBean> value = expected.getItemlist();
		assertEquals(value, itemlist);
	}

	@Test
	public void testSetTotal_yen() {
		String total_yen="2,000";
		int total=2000;
		CartAction expected = new CartAction();
		expected.setTotal(total);
		String value = expected.getTotal_yen();
		assertEquals(value, total_yen);
	}

	@Test
	public void testSetMax_num_flag() {
		int max_num_flag=1;
		CartAction expected = new CartAction();
		expected.setMax_num_flag(max_num_flag);
		assertEquals(max_num_flag, expected.getMax_num_flag());
	}
}
