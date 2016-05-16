package CodeWars;

/**
 * Created by wangweimin on 16/2/25.
 */
public class NotVisibleCubes {
    public Long notVisibleCubes(Long n) {
        // your code!
        Long inside = n-2;
        return inside * inside * inside;
    }
}
