package JavaCore;

import java.util.regex.Pattern;

/**
 * Created by wangweimin on 16/2/24.
 */
public class IdentifierChecker {
    public static boolean isValid(String idn) {
        // here's your code...
        Pattern pattern = Pattern.compile("(^([A-Za-z_]|\\$))(\\w*)");
        return pattern.matcher(idn).matches();
    }
}
