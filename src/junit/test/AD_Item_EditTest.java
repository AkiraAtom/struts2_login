package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.action.AD_Item_Edit;
import jp.co.ec_10.action.AD_Paging;
import jp.co.ec_10.dto.AdminDTO;

import org.junit.Before;
import org.junit.Test;

public class AD_Item_EditTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetList_count() {
		int list_count= 10;
		AD_Paging expected = new AD_Paging();
		expected.setList_count( 10);
		assertEquals(list_count, expected.getList_count());
	}

	@Test
	public void testGetInputitem() {
		String inputitem="てすと";
		AD_Item_Edit expected = new AD_Item_Edit();
		expected.setInputitem("てすと");
		assertEquals(inputitem, expected.getInputitem());
	}

	@Test
	public void testGetInputprice() {
		String inputprice= "100";
		AD_Item_Edit expected = new AD_Item_Edit();
		expected.setInputprice( "100");
		assertEquals(inputprice, expected.getInputprice());
	}

	@Test
	public void testGetInputstock() {
		String inputstock= "100";
		AD_Item_Edit expected = new AD_Item_Edit();
		expected.setInputstock( "100");
		assertEquals(inputstock, expected.getInputstock());
	}

	@Test
	public void testSetInputitem() {
		String inputitem="てすと";
		AD_Item_Edit expected = new AD_Item_Edit();
		expected.setInputitem("てすと");
		String value = expected.getInputitem();
		assertEquals(value, inputitem);
	}

	@Test
	public void testSetInputprice() {
		String inputprice= "100";
		AD_Item_Edit expected = new AD_Item_Edit();
		expected.setInputprice( "100");
		String value = expected.getInputprice();
		assertEquals(value, inputprice);
	}

	@Test
	public void testSetInputstock() {
		String inputstock= "100";
		AD_Item_Edit expected = new AD_Item_Edit();
		expected.setInputstock( "100");
		String value = expected.getInputstock();
		assertEquals(value, inputstock);
	}

	@Test
	public void testSetInputimg() {
		String inputimg="てすと";
		AdminDTO expected = new AdminDTO();
		expected.setItem_img("てすと");
		String value = expected.getItem_img();
		assertEquals(value, inputimg);
	}

	@Test
	public void testSetInputid() {
		String inputid="てすと";
		AdminDTO expected = new AdminDTO();
		expected.setItem_id("てすと");
		String value = expected.getItem_id();
		assertEquals(value, inputid);
	}

}
