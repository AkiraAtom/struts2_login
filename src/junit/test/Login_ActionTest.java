package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.action.AD_Paging;
import jp.co.ec_10.action.Login_Action;

import org.junit.Before;
import org.junit.Test;

public class Login_ActionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetInput_pass() {
		String input_pass="てすと";
		Login_Action expected = new Login_Action();
		expected.setInput_pass("てすと");
		String value = expected.getInput_pass();
		assertEquals(value, input_pass);
	}

	@Test
	public void testSetInput_id() {
		String input_id="てすと";
		Login_Action expected = new Login_Action();
		expected.setInput_id("てすと");
		String value = expected.getInput_id();
		assertEquals(value, input_id);
	}

	@Test
	public void testGetList_count() {
		int list_count= 10;
		AD_Paging expected = new AD_Paging();
		expected.setList_count( 10);
		assertEquals(list_count, expected.getList_count());
	}

	@Test
	public void testGetInput_pass() {
		String input_pass="てすと";
		Login_Action expected = new Login_Action();
		expected.setInput_pass("てすと");
		assertEquals(input_pass, expected.getInput_pass());
	}

	@Test
	public void testGetInput_id() {
		String input_id="てすと";
		Login_Action expected = new Login_Action();
		expected.setInput_id("てすと");
		assertEquals(input_id, expected.getInput_id());
	}

}
