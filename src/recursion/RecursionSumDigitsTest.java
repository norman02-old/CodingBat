package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecursionSumDigitsTest {
    private static SumDigits s;

    @Before
    public void setUp() throws Exception {
        s = new SumDigits();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTrivial() {
        assertEquals(0, s.sumDigits(0));  
        assertEquals(1, s.sumDigits(1));
        assertEquals(2, s.sumDigits(2));
    }
    @Test
    public void testSumDigits() {        
        assertEquals(3, s.sumDigits(12));
//        assertEquals(13, s.sumDigits(49));
    }

}
