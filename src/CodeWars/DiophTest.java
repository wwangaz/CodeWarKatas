package CodeWars;

/**
 * Created by wangweimin on 16/2/29.
 */
import static org.junit.Assert.*;
import org.junit.Test;


public class DiophTest {

    @Test
    public void test1() {
        assertEquals("[[3, 1]]", Dioph.solEquaStr(5));
    }
    @Test
    public void test2() {
        assertEquals("[[4, 1]]", Dioph.solEquaStr(12));
    }
    @Test
    public void test3() {
        assertEquals("[[7, 3]]", Dioph.solEquaStr(13));
    }
    @Test
    public void test4() {
        assertEquals("[[4, 0]]", Dioph.solEquaStr(16));
    }
    @Test
    public void test5() {
        assertEquals("[[45003, 22501], [9003, 4499], [981, 467], [309, 37]]", Dioph.solEquaStr(90005));
    }
    @Test
    public void test6() {
        assertEquals("[]", Dioph.solEquaStr(90002));
    }
    @Test
    public void test7() {
        assertEquals("[[450001, 225000]]", Dioph.solEquaStr(900001));
    }
    @Test
    public void test8() {
        assertEquals("[[450000005, 225000002], [150000003, 75000000]]", Dioph.solEquaStr(900000009L));
    }

    @Test
    public void test9() {
        assertEquals("[4500000021, 2250000010], []155172429, 77586200]", Dioph.solEquaStr(9000000041L));
    }
}
