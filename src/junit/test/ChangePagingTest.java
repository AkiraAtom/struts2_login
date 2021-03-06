package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.action.AD_Paging;
import jp.co.ec_10.action.ChangePaging;
import jp.co.ec_10.dto.AdminDTO;

import org.junit.Before;
import org.junit.Test;

public class ChangePagingTest {

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
	public void testGetChange() {
		String change="logout";
		ChangePaging expected = new ChangePaging();
		expected.setChange("logout");
		assertEquals(change, expected.getChange());
	}

	@Test
	public void testSetChange() {
		String change="edit";
		ChangePaging expected = new ChangePaging();
		expected.setChange("edit");
		String value = expected.getChange();
		assertEquals(value, change);
	}

	@Test
	public void testSetItemselect() {
		String inputid="てすと";
		AdminDTO expected = new AdminDTO();
		expected.setItem_id("てすと");
		String value = expected.getItem_id();
		assertEquals(value, inputid);
	}

}
