package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CountEightTest {
    private static CountEight e;

    @Before
    public void setUp() throws Exception {
        e = new CountEight();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTrivial() {
        
        assertEquals(0, e.count8(0));
        assertEquals(1, e.count8(8));
    }
    @Test
    public void testComplex() {
        assertEquals(2, e.count8(818));
        assertEquals(3, e.count8(81818));
    }
    @Test
    public void testDoubleEight() {
        assertEquals(3, e.count8(88));
    }
    
//    @Test
//    public void testRightDigit() {
//        assertEquals(2, e.rightDigit(22));
//        assertEquals(3, e.rightDigit(31));
//    }

}
