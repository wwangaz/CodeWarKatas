package CodeWars; /**
 * Created by wangweimin on 16/2/24.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BlockTest {
    @Test
    public void testBasicBlock() throws Exception {
        Block b = new Block(new int[]{2,2,2});
        assertEquals(2,b.getWidth());
        assertEquals(2,b.getLength());
        assertEquals(2,b.getHeight());
        assertEquals(8,b.getVolume());
        assertEquals(24,b.getSurfaceArea());
    }
}
