package CodeWars;

/**
 * Created by wangweimin on 16/5/18.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversionTest {

    private Conversion conversion = new Conversion();

    @Test
    public void shouldCovertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
        assertEquals("solution(89) should equal to LXXXIX", "LXXXIX", conversion.solution(89));
        assertEquals("solution(90) should equal to XC", "XC", conversion.solution(90));
        assertEquals("solution(91) should equal to XCI", "XCI", conversion.solution(91));
        assertEquals("solution(900) should equal to CM", "CM", conversion.solution(900));
    }
}

