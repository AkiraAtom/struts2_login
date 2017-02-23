package junit.test;

import static org.junit.Assert.*;
import jp.co.ec_10.action.OrderCheckAction;

import org.junit.Before;
import org.junit.Test;

public class OrderCheckActionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetCustomer_name() {
		String customer_name = "田中 太郎";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setCustomer_name(customer_name);
		assertEquals(customer_name, expected.getCustomer_name());

	}

	@Test
	public void testSetCustomer_name() {
		String customer_name = "田中 太郎";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setCustomer_name("田中 太郎");
		String value = expected.getCustomer_name();
		assertEquals(value, customer_name);
	}

	@Test
	public void testGetMail() {
		String mail = "abc@kodomo.co.jp";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setMail(mail);
		assertEquals(mail, expected.getMail());
	}

	@Test
	public void testSetMail() {
		String mail = "abc@kodomo.co.jp";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setMail("abc@kodomo.co.jp");
		String value = expected.getMail();
		assertEquals(value, mail);
	}

	@Test
	public void testGetMail_check() {
		String mail_check = "abc@kodomo.co.jp";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setMail_check(mail_check);
		assertEquals(mail_check, expected.getMail_check());
	}

	@Test
	public void testSetMail_check() {
		String mail_check = "abc@kodomo.co.jp";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setMail_check("abc@kodomo.co.jp");
		String value = expected.getMail_check();
		assertEquals(value,mail_check );
	}

	@Test
	public void testGetTel() {
		String tel = "09012345678";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setTel(tel);
		assertEquals(tel, expected.getTel());
	}

	@Test
	public void testSetTel() {
		String tel = "09012345678";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setTel("09012345678");
		String value = expected.getTel();
		assertEquals(value, tel);
	}

	@Test
	public void testGetPost() {
		String post = "1760001";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setPost(post);
		assertEquals(post, expected.getPost());
	}

	@Test
	public void testSetPost() {
		String post = "1760001";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setPost("1760001");
		String value = expected.getPost();
		assertEquals(value, post);
	}

	@Test
	public void testGetKen() {
		String ken = "東京都";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setKen(ken);
		assertEquals(ken, expected.getKen());
	}

	@Test
	public void testSetKen() {
		String ken = "東京都";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setKen("東京都");
		String value = expected.getKen();
		assertEquals(value, ken);
	}

	@Test
	public void testGetAddress() {
		String address = "文京区後楽1-1-1";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setAddress(address);
		assertEquals(address, expected.getAddress());
	}

	@Test
	public void testSetAddress() {
		String address = "文京区後楽1-1-1";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setAddress("文京区後楽1-1-1");
		String value = expected.getAddress();
		assertEquals(value, address);

	}

	@Test
	public void testGetMailerror() {
		String mailerror = "メールアドレスが一致してません";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setMailerror(mailerror);
		assertEquals(mailerror, expected.getMailerror());
	}

	@Test
	public void testSetMailerror() {
		String mailerror = "メールアドレスが一致してません";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setMailerror("メールアドレスが一致してません");
		String value = expected.getMailerror();
		assertEquals(value, mailerror);
	}

	@Test
	public void testGetDestination() {
		String destination = "東京都文京区後楽1-1-1";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setDestination(destination);
		assertEquals(destination, expected.getDestination());
	}

	@Test
	public void testSetDestination() {
		String destination = "東京都文京区後楽1-1-1";
		OrderCheckAction expected = new OrderCheckAction();
		expected.setDestination("東京都文京区後楽1-1-1");
		String value = expected.getDestination();
		assertEquals(value, destination);
	}

}
