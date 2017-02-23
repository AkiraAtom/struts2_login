package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.bean.CartBean;

import org.junit.Before;
import org.junit.Test;

public class CartBeanTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetNum() {
		int num=3;
		CartBean expected = new CartBean();
		expected.setNum(num);
		assertEquals(num, expected.getNum());
	}

	@Test
	public void testGetItem_name() {
		String item_name="item_name";
		CartBean expected = new CartBean();
		expected.setItem_name(item_name);
		String value = expected.getItem_name();
		assertEquals(value, item_name);
	}

	@Test
	public void testGetItem_price() {
		int item_price=3;
		CartBean expected = new CartBean();
		expected.setItem_price(item_price);
		assertEquals(item_price, expected.getItem_price());
	}

	@Test
	public void testGetItem_id() {
		int item_id=3;
		CartBean expected = new CartBean();
		expected.setItem_id(item_id);
		assertEquals(item_id, expected.getItem_id());
	}

	@Test
	public void testSetNum() {
		int num=3;
		CartBean expected = new CartBean();
		expected.setNum(num);
		assertEquals(num, expected.getNum());
	}

	@Test
	public void testSetItem_name() {
		String item_name="item_name";
		CartBean expected = new CartBean();
		expected.setItem_name(item_name);
		String value = expected.getItem_name();
		assertEquals(value, item_name);
	}

	@Test
	public void testSetItem_price() {
		int item_price=3;
		CartBean expected = new CartBean();
		expected.setItem_price(item_price);
		assertEquals(item_price, expected.getItem_price());
	}

	@Test
	public void testSetItem_id() {
		int item_id=3;
		CartBean expected = new CartBean();
		expected.setItem_id(item_id);
		assertEquals(item_id, expected.getItem_id());
	}

	@Test
	public void testGetSub_total() {
		int sub_total=2000;
		CartBean expected = new CartBean();
		expected.setSub_total(sub_total);
		assertEquals(sub_total, expected.getSub_total());
	}

	@Test
	public void testSetSub_total() {
		int sub_total=2000;
		CartBean expected = new CartBean();
		expected.setSub_total(sub_total);
		assertEquals(sub_total, expected.getSub_total());
	}

	@Test
	public void testGetSub_total_yen() {
		String sub_total_yen="2,000";
		int sub_total=2000;
		CartBean expected = new CartBean();
		expected.setSub_total(sub_total);
		assertEquals(sub_total_yen, expected.getSub_total_yen());
	}

	@Test
	public void testGetItem_price_yen() {
		String sub_total_yen="2,000";
		int sub_total=2000;
		CartBean expected = new CartBean();
		expected.setSub_total(sub_total);
		assertEquals(sub_total_yen, expected.getSub_total_yen());
	}

}
