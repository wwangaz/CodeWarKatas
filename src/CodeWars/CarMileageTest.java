package CodeWars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wangweimin on 16/5/19.
 */
public class CarMileageTest {
    @Test
    public void testTooSmall() {
        assertEquals(0, CarMileage.isInteresting(3, new int[]{1337, 256}));
    }

    @Test
    public void testUpcomingBigNumbers() {
        assertEquals(1, CarMileage.isInteresting(98, new int[]{101, 256}));
    }

    @Test
    public void testUpcomingPhrases() {
        assertEquals(1, CarMileage.isInteresting(80083, new int[]{80084, 100, 256}));
    }

    @Test
    public void testUpcomingMonotone() {
        assertEquals(1, CarMileage.isInteresting(109, new int[]{256}));
    }

    @Test
    public void testAlmostAwesome() {
        assertEquals(1, CarMileage.isInteresting(1336, new int[]{1337, 256}));
    }

    @Test
    public void testAwesome() {
        assertEquals(2, CarMileage.isInteresting(1337, new int[]{1337, 256}));
    }

    @Test
    public void testFarNotInteresting() {
        assertEquals(0, CarMileage.isInteresting(11208, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostInteresting() {
        assertEquals(1, CarMileage.isInteresting(11209, new int[]{1337, 256}));
    }

    @Test
    public void testInteresting() {
        assertEquals(2, CarMileage.isInteresting(11211, new int[]{1337, 256}));
    }
}
