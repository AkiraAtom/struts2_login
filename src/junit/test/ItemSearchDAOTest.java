package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.dao.ItemSearchDAO;

import org.junit.Before;
import org.junit.Test;

public class ItemSearchDAOTest {


	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testGetMax_id_flag() {
		int max_id_flag=1;
		ItemSearchDAO  expected = new ItemSearchDAO ();
		expected.setMax_id_flag(max_id_flag);
		assertEquals(max_id_flag, expected.getMax_id_flag());
	}

	@Test
	public void testSetMax_id_flag() {
		int max_id_flag=1;
		ItemSearchDAO  expected = new ItemSearchDAO ();
		expected.setMax_id_flag(max_id_flag);
		assertEquals(max_id_flag, expected.getMax_id_flag());
	}

	@Test
	public void testGetList_count() {
		int list_count=30;
		ItemSearchDAO expected = new ItemSearchDAO();
		expected.setList_count(list_count);
		assertEquals(list_count, expected.getList_count());
	}

	@Test
	public void testSetList_count() {
		int list_count=30;
		ItemSearchDAO expected = new ItemSearchDAO();
		expected.setList_count(list_count);
		assertEquals(list_count, expected.getList_count());
	}

}
