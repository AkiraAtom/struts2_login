package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.action.AD_Paging;

import org.junit.Before;
import org.junit.Test;

public class AD_PagingTest {

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
	public void testSetList_count() {
		int list_count= 10;
		AD_Paging expected = new AD_Paging();
		expected.setList_count( 10);
		int value = expected.getList_count();
		assertEquals(value, list_count);
	}
	@Test
	public void testGetPage() {
		String page= "next";
		AD_Paging expected = new AD_Paging();
		expected.setPage("next");
		assertEquals(page, expected.getPage());
	}

	@Test
	public void testSetPage() {
		String page="back";
		AD_Paging expected = new AD_Paging();
		expected.setPage("back");
		assertEquals(page, expected.getPage());
	}
	@Test
	public void testGetPaging() {
		int paging= 10;
		AD_Paging expected = new AD_Paging();
		expected.setPaging( 10);
		assertEquals(paging, expected.getPaging());
	}

	@Test
	public void testSetPaging() {
		int paging= 10;
		AD_Paging expected = new AD_Paging();
		expected.setPaging( 10);
		int value = expected.getPaging();
		assertEquals(value, paging);
	}

	@Test
	public void testGetPaging2() {
		int paging2= 10;
		AD_Paging expected = new AD_Paging();
		expected.setPaging2( 10);
		assertEquals(paging2, expected.getPaging2());
	}
	@Test
	public void testSetPaging2() {
		int paging2= 10;
		AD_Paging expected = new AD_Paging();
		expected.setPaging2( 10);
		int value = expected.getPaging2();
		assertEquals(value, paging2);
	}

	@Test
	public void testSetSelect() {
		String select="order";
		AD_Paging expected = new AD_Paging();
		expected.setSelect("order");
		assertEquals(select, expected.getSelect());
	}

	@Test
	public void testSelect() {
		String select="item";
		AD_Paging expected = new AD_Paging();
		expected.setSelect("item");
		String value = expected.getSelect();
		assertEquals(value, select);
	}
}
