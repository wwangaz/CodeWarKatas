package CodeWars;

import java.util.Arrays;

/**
 * Created by wangweimin on 16/5/18.
 */
public class Conversion {
    public static final char[] unitsChar = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        char[] numbers = String.valueOf(n).toCharArray();
        for (int i = 0; i < numbers.length; i++) {
            int index = (numbers.length - i - 1) * 2;
            switch (numbers[i]) {
                case '9':
                    sb.append(unitsChar[index]).append(unitsChar[index + 2]);
                    break;
                case '4':
                    sb.append(unitsChar[index]).append(unitsChar[index + 1]);
                    break;
                default:
                    int count = Character.getNumericValue(numbers[i]);
                    if (count >= 5) {
                        sb.append(unitsChar[index + 1]);
                        count -= 5;
                    }
                    char[] fill = new char[count];
                    Arrays.fill(fill, unitsChar[index]);
                    sb.append(fill);
                    break;
            }
        }
        return sb.toString();
    }


    /**
     * best answer
     */
    //    public class Conversion {
    //
    //        public String solution(int number) {
    //            String romanNumbers[] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    //            int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    //            StringBuilder result = new StringBuilder();
    //            int i = 0;
    //            while (number > 0 || arab.length == (i - 1)) {
    //                while ((number - arab[i]) >= 0) {
    //                    number -= arab[i];
    //                    result.append(romanNumbers[i]);
    //                }
    //                i++;
    //            }
    //            return result.toString();
    //        }
    //    }
}
