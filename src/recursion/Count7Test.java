package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Count7Test {
    private static Count7 c;

    @Before
    public void setUp() throws Exception {
        c = new Count7();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTrivial() {
        assertEquals(0, c.count7(0));
        assertEquals(1, c.count7(7));
    }
    @Test
    public void testComplex() {
        assertEquals(2, c.count7(77));
    }
    

}
