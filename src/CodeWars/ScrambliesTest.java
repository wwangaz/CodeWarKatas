package CodeWars;

/**
 * Created by wangweimin on 16/3/1.
 */

import static org.junit.Assert.*;

import org.junit.Test;


public class ScrambliesTest {

    private static void testing(String s1, String s2, boolean expected) {
        boolean actual = Scramblies.scramble(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests scramble");
        testing("rkqodlw", "world", true);
        testing("cedewaraaossoqqyt", "codewars", true);
        testing("katas", "steak", false);
        testing("scriptjavx", "javascript", false);
        testing("scriptingjava", "javascript", true);
        testing("scriptsjava", "javascripts", true);
        testing("javscripts", "javascript", false);
        testing("aabbcamaomsccdd", "commas", true);
        testing("commas", "commas", true);
        testing("sammoc", "commas", true);
    }
}
