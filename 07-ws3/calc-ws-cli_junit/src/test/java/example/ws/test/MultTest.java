package example.ws.test;

import org.junit.*;
import static org.junit.Assert.*;

import calc.*; // classes generated by wsimport from WSDL


/**
 *  Test suite
 */
public class MultTest extends AbstractCalcTest {

    // tests
    // assertEquals(expected, actual);

//      public int sum(int a, int b)

    @Test
    public void test() throws Exception {
        final int result = client.mult(7, 8);
        assertEquals(56, result);
    }

    // ...

}