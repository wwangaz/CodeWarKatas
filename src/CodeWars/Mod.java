package CodeWars;

/**
 * Created by wangweimin on 16/3/1.
 */

import java.util.regex.Pattern;

public class Mod {
    public static Pattern mod4 = Pattern.compile("(\\[)((\\-|\\+)?((\\d*([02468][048]|[13579][26]))|[048]))(\\])");
}
