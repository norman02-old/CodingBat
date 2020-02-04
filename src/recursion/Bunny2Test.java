package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Bunny2Test {
    private static Bunny2 b;

    @Before
    public void setUp() throws Exception {
        b = new Bunny2();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testNoBunny() {      
        assertEquals(0, b.bunnyEars2(0));
    }
    @Test 
    public void testOddBunny() {
        assertEquals(2, b.bunnyEars2(1));
    }
    @Test
    public void testEvenBunny() {
        assertEquals(5, b.bunnyEars2(2));
    }

}
