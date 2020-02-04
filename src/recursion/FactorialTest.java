package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
    protected static Factorial f;

    @Before
    public void setUp() throws Exception {
        f = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testComputeBase() {
        
        assertEquals(1, f.factorial(0));
        assertEquals(1, f.factorial(1));
    }
    @Test
    public void testNumbers() {
        assertEquals(2, f.factorial(2));
        assertEquals(6, f.factorial(3));
    }

}
