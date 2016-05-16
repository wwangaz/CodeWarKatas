package CodeWars;

/**
 * Created by wangweimin on 16/3/1.
 */
import static org.junit.Assert.*;
import org.junit.Test;


public class SuiteTest {

    private static final double DELTA = 1e-10;

    @Test
    public void test1() {
        assertEquals(1.275, Suite.going(5), DELTA);
    }
    @Test
    public void test2() {
        assertEquals(1.2125, Suite.going(6), DELTA);
    }
    @Test
    public void test3() {
        assertEquals(1.173214, Suite.going(7), DELTA);
    }
    @Test
    public void test4() {
        assertEquals(1, Suite.going(1), DELTA);
    }
    @Test
    public void test5() {
        assertEquals(1.5, Suite.going(2), DELTA);
    }
    @Test
    public void test6() {
        assertEquals(1.0009, Suite.going(10000), DELTA);
    }

}
