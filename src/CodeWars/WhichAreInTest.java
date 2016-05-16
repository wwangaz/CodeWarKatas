package CodeWars;

/**
 * Created by wangweimin on 16/2/26.
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class WhichAreInTest {
    @Test
    public void test1() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void test2() {
        String a[] = new String[]{ "arpc", "lived", "stronga" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] {};
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}
