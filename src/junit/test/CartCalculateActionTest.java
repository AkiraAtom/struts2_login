package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.action.CartCalculateAction;

import org.junit.Before;
import org.junit.Test;

public class CartCalculateActionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetItem_id() {
		int item_id=3;
		CartCalculateAction expected = new CartCalculateAction();
		expected.setItem_id(item_id);
		assertEquals(item_id, expected.getItem_id());
	}

	@Test
	public void testGetItem_id() {
		int item_id=3;
		CartCalculateAction expected = new CartCalculateAction();
		expected.setItem_id(item_id);
		assertEquals(item_id, expected.getItem_id());
	}

	@Test
	public void testSetNum() {
		int num=3;
		CartCalculateAction expected = new CartCalculateAction();
		expected.setNum(num);
		assertEquals(num, expected.getNum());
	}

	@Test
	public void testGetNum() {
		int num=3;
		CartCalculateAction expected = new CartCalculateAction();
		expected.setNum(num);
		assertEquals(num, expected.getNum());
	}

	@Test
	public void testGetItem_price() {
		int item_price=3;
		CartCalculateAction expected = new CartCalculateAction();
		expected.setItem_price(item_price);
		assertEquals(item_price, expected.getItem_price());
	}

	@Test
	public void testSetItem_price() {
		int item_price=3;
		CartCalculateAction expected = new CartCalculateAction();
		expected.setItem_price(item_price);
		assertEquals(item_price, expected.getItem_price());
	}

}
