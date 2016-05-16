package JavaCore; /**
 * Created by wangweimin on 16/2/24.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IdentifierCheckerTest {
    @Test
    public void testValid() {
        assertEquals(true, IdentifierChecker.isValid("i1"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, IdentifierChecker.isValid("1i"));
    }

    @Test
    public void testInvalid_01() {
        assertEquals(false, IdentifierChecker.isValid("1i ()"));
    }

    @Test
    public void testValid_01() {
        assertEquals(true, IdentifierChecker.isValid("$4dah"));
    }

    @Test
    public void testValid_02() {
        assertEquals(false, IdentifierChecker.isValid("_abc456()"));
    }
}
