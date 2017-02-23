package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.action.CartDeleteAction;

import org.junit.Before;
import org.junit.Test;

public class CartDeleteActionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetItem_id() {
		int item_id=3;
		CartDeleteAction expected = new CartDeleteAction();
		expected.setItem_id(item_id);
		assertEquals(item_id, expected.getItem_id());
	}

	@Test
	public void testSetItem_id() {
		int item_id=3;
		CartDeleteAction expected = new CartDeleteAction();
		expected.setItem_id(item_id);
		assertEquals(item_id, expected.getItem_id());
	}

}
