package CodeWars;

/**
 * Created by wangweimin on 16/3/2.
 */
import java.util.regex.Pattern;

public class BinaryRegexp {

    public static Pattern multipleOf3() {
        // Regular expression that matches binary inputs that are multiple of 3
        return Pattern.compile("\\d+");
    }

}
