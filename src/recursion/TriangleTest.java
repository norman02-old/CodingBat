package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
    private static Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTrivial() {
        assertEquals(0, triangle.triangle(0));
    }
    @Test
    public void testComputeRows() {
        assertEquals(1, triangle.triangle(1));
        assertEquals(3, triangle.triangle(2));
        assertEquals(6, triangle.triangle(3));
    }
    

}
