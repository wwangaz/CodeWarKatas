package CodeWars;

/**
 * Created by wangweimin on 16/2/26.
 */
public class DigPow {

    public static long digPow(int n, int p) {
        // your code
        char[] numbers = (n+"").toCharArray();
        int values = 0;
        for(char ch : numbers){
            values+= Math.pow(ch - '0', p);
            p++;
        }
        if(values % n == 0) return values / n;
        else return -1;
    }

}

