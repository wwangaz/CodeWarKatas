package CodeWars;

/**
 * Created by wangweimin on 16/3/1.
 */

import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> permutation = new ArrayList<>();
        ArrayList<T> myList = new ArrayList<>(items);
        int position = 0;
        while(myList.size() > 0) {
            position = (position + k - 1) % myList.size();
            permutation.add(myList.remove(position));
        }
        return permutation;
    }
}
