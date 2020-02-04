package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    private static Fibonacci f;

    @Before
    public void setUp() throws Exception {
        f = new Fibonacci();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTrivial() {
        
        assertEquals(0, f.fibonacci(0));
        assertEquals(1, f.fibonacci(1));
        assertEquals(1, f.fibonacci(2));
    }
    @Test
    public void testSequence() {
        assertEquals(2, f.fibonacci(3));
    }

}
