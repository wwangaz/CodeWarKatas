package CodeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by wangweimin on 16/2/26.
 */
public class TwoCubeSumsTest {
    @Test
    public void test1(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(1));
    }

    @Test
    public void test2(){
        assertEquals(true, TwoCubeSums.hasTwoCubeSums(1729));
    }

    @Test
    public void test3(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(42));
    }

    @Test
    public void test4(){
        assertEquals(true, TwoCubeSums.hasTwoCubeSums(4104));
    }

    @Test
    public void test5(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(4105));
    }

    @Test
    public void test6(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(46163));
    }

    @Test
    public void test7(){
        assertEquals(true, TwoCubeSums.hasTwoCubeSums(1729));
    }
}
