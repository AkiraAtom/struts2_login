package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.action.OrderAction;

import org.junit.Before;
import org.junit.Test;

public class OrderActionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetFlg() {
		int flg = 1;
		OrderAction expected = new OrderAction();
		expected.setFlg(flg);
		assertEquals(flg, expected.getFlg());
	}

	@Test
	public void testSetFlg() {
		int flg = 1;
		OrderAction expected = new OrderAction();
		expected.setFlg(1);
		int value = expected.getFlg();
		assertEquals(value, flg);
	}

}
