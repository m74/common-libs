/*
 * CurrencyFormatTest.java
 * JUnit based test
 *
 * Created on 21 Август 2007 г., 10:43
 */

package mixam.text.format;

import junit.framework.TestCase;

import java.text.Format;

/**
 * @author Максим
 */
public class CurrencyFormatTest extends TestCase {

    public CurrencyFormatTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    private void testFormat(Format frm) {
        long m = System.currentTimeMillis();
        for (double i = 0; i < 1; i += 0.01) {
            System.out.println(frm.format(new Double(i)));
        }
        for (double i = 1; i < 30; i++) {
            System.out.println(frm.format(new Double(i)));
        }
        for (double i = 30; i < 100; i += 10) {
            System.out.println(frm.format(new Double(i)));
        }
        for (double i = 10; i < 1000; i += 100) {
            System.out.println(frm.format(new Double(i)));
        }
        for (double i = 1000; i < 30000; i += 1000) {
            System.out.println(frm.format(new Double(i)));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - m));
    }

    /**
     * Test of format method, of class mixam.text.format.CurrencyFormat.
     */
    public void testFormat() {
        testFormat(CurrencyFormat.getInstance());
        testFormat(new CurrencyFormat(true, true, true));
        testFormat(new CurrencyFormat(true, false, true));
        testFormat(new CurrencyFormat(false, false, false));
    }

    /**
     * Test of parseObject method, of class mixam.text.format.CurrencyFormat.
     */
    // public void testParseObject() throws ParseException {
    // Format frm = CurrencyFormat.getInstance();
    // Object val = new Double(0);
    // String str = frm.format(val);
    // assertEquals(frm.parseObject(str), val);
    // }

    /**
     * Test of getInstance method, of class mixam.text.format.CurrencyFormat.
     */
    public void testGetInstance() {
        CurrencyFormat result = CurrencyFormat.getInstance();
        assertSame(result, CurrencyFormat.getInstance());

    }

    public void testBigNumber() {
        String val = CurrencyFormat.getInstance().format(1111111111.235);
        System.out.print(val);
    }
}
