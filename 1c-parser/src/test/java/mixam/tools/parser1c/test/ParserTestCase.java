package mixam.tools.parser1c.test;

import junit.framework.TestCase;
import mixam.tools.parser1c.DocumentWorker;
import mixam.tools.parser1c.Parser;
import mixam.tools.parser1c.stubs.Variables;
import mixam.webtools.Logger;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ParserTestCase extends TestCase {
	Parser parser;

	public ParserTestCase(String testName) {
		super(testName);
	}

	protected void setUp() throws Exception {
		parser = new Parser();
	}

	public void testMultiAccounts() throws Exception {
		parser.parse(getClass().getResourceAsStream("multi-acc.txt"));

		Variables v = parser.getVariables();
		Assert.assertArrayEquals(v.accountNumber, new String[] { "40702810338000037920", "40702810938000037922" });
	}

	public void testVariables() throws Exception {
		parser.parse(getClass().getResourceAsStream("variables.txt"));
		Variables v = parser.getVariables();

		assertEquals(v.startAt, java.sql.Date.valueOf("2010-07-15"));
		Assert.assertArrayEquals(v.accountNumber, new String[] { "40702978338030201736" });
		assertEquals(v.version, "1.01");
		assertEquals(v.encoding, "Windows");
		assertEquals(v.recipier, "1Cv77");
		assertEquals(v.createDate, java.sql.Date.valueOf("2010-07-29"));
		assertEquals(v.createTime, "14:29:32");
		assertEquals(v.startAt, java.sql.Date.valueOf("2010-07-15"));
		assertEquals(v.endAt, java.sql.Date.valueOf("2010-07-29"));

		assertEquals(v.startAt.getClass(), java.sql.Date.class);
	}

	public void testPeriods() throws Exception {
		parser.parse(getClass().getResourceAsStream("variables.txt"));

		assertEquals(parser.getAccounts().size(), 2);
		assertEquals(parser.getAccounts().get(0).getAccount(), "40702810538030101736");
		assertEquals(parser.getAccounts().get(0).getBegin(), java.sql.Date.valueOf("2010-07-15"));
		assertEquals(parser.getAccounts().get(0).getEnd(), java.sql.Date.valueOf("2010-07-28"));
		assertEquals(parser.getAccounts().get(0).getBefore(), 75371.15);
		assertEquals(parser.getAccounts().get(0).getAfter(), 226809.14);
		assertEquals(parser.getAccounts().get(0).getIn(), 374820.57);
		assertEquals(parser.getAccounts().get(0).getOut(), 223382.58);

	}

	public void testPayments() throws Exception {
		final List<Payment> list = new ArrayList<Payment>();
		parser.put(new DocumentWorker<Payment>() {
			@Override
			protected void commitEntity(Payment entity) throws Exception {
				Logger.debug("payments", "commit: " + entity);
				list.add(entity);
			}
		});
		parser.parse(getClass().getResourceAsStream("variables.txt"));

		assertEquals(list.size(), 50);

		Payment payment = list.get(0);

		assertEquals(payment.getNumber(), "176");
		assertEquals(payment.getDate(), java.sql.Date.valueOf("2010-07-15"));
		assertEquals(payment.getSum(), 14800.0);
		assertEquals(payment.getPayerInn(), "7801443409");
		assertEquals(payment.getPayerBik(), "44030893");
		assertEquals(payment.getPayerTitle(), "ООО \"Студия Силк Вэй Синема\"");
	}
}
