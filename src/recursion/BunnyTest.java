package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BunnyTest {
    private static Bunny b;

    @Before
    public void setUp() throws Exception {
        b = new Bunny();
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testNoBunnies() {
        assertEquals(0, b.bunnyEars(0));
    }
    @Test
    public void testBunnies() {
        
        assertEquals(0, b.bunnyEars(0));
        assertEquals(2, b.bunnyEars(1));
        assertEquals(4, b.bunnyEars(2));
    }

}
