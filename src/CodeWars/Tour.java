package CodeWars;

/**
 * Created by wangweimin on 16/3/2.
 */
import java.util.Map;


public class Tour {

    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        // your code
        double before = 0;
        double distance = 0;
        for (String s : arrFriends) {
            for (int i = 0; i < ftwns.length; i++) {
                if (s.equals(ftwns[i][0])){
                    double distanceThis = h.get(ftwns[i][1]);
                    distance += Math.sqrt(distanceThis * distanceThis - before * before);
                    before = distanceThis;
                }
            }
        }
        return (int) Math.floor(distance + before);
    }
}
