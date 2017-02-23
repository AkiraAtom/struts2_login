package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.dto.ItemDTO;

import org.junit.Before;
import org.junit.Test;

public class ItemDTOTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetItem_id() {
		int item_id=3;
		ItemDTO expected = new ItemDTO();
		expected.setItem_id(item_id);
		assertEquals(item_id, expected.getItem_id());
	}

	@Test
	public void testGetItem_name() {
		String item_name="item_name";
		ItemDTO expected = new ItemDTO();
		expected.setItem_name(item_name);
		String value = expected.getItem_name();
		assertEquals(value, item_name);
	}

	@Test
	public void testGetItem_price() {
		int item_price=3;
		ItemDTO expected = new ItemDTO();
		expected.setItem_price(item_price);
		assertEquals(item_price, expected.getItem_price());
	}

	@Test
	public void testGetItem_stock() {
		int item_stock=3;
		ItemDTO expected = new ItemDTO();
		expected.setItem_stock(item_stock);
		assertEquals(item_stock, expected.getItem_stock());
	}

	@Test
	public void testGetItem_img() {
		String item_img="img/noimage.jpg";
		ItemDTO expected = new ItemDTO();
		expected.setItem_name(item_img);
		String value = expected.getItem_name();
		assertEquals(value, item_img);
	}

	@Test
	public void testSetItem_id() {
		int item_id=3;
		ItemDTO expected = new ItemDTO();
		expected.setItem_id(item_id);
		assertEquals(item_id, expected.getItem_id());
	}

	@Test
	public void testSetItem_name() {
		String item_name="item_name";
		ItemDTO expected = new ItemDTO();
		expected.setItem_name(item_name);
		String value = expected.getItem_name();
		assertEquals(value, item_name);
	}

	@Test
	public void testSetItem_price() {
		int item_price=3;
		ItemDTO expected = new ItemDTO();
		expected.setItem_price(item_price);
		assertEquals(item_price, expected.getItem_price());
	}

	@Test
	public void testSetItem_stock() {
		int item_stock=3;
		ItemDTO expected = new ItemDTO();
		expected.setItem_stock(item_stock);
		assertEquals(item_stock, expected.getItem_stock());
	}

	@Test
	public void testSetItem_img() {
		String item_img="img/noimage.jpg";
		ItemDTO expected = new ItemDTO();
		expected.setItem_name(item_img);
		String value = expected.getItem_name();
		assertEquals(value, item_img);
	}

	@Test
	public void testGetItem_price_yen() {
		String item_price_yen="2,000";
		int item_price=2000;
		ItemDTO expected = new ItemDTO();
		expected.setItem_price(item_price);
		assertEquals(item_price_yen, expected.getItem_price_yen());
	}

	@Test
	public void testSetItem_price_yen() {
		String item_price_yen="2,000";
		int item_price=2000;
		ItemDTO expected = new ItemDTO();
		expected.setItem_price(item_price);
		assertEquals(item_price_yen, expected.getItem_price_yen());
	}

}
