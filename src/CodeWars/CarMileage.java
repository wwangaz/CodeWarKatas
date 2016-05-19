package CodeWars;

/**
 * Created by wangweimin on 16/5/19.
 *
 * http://www.codewars.com/kata/52c4dd683bfd3b434c000292/solutions/solutions
 */
public class CarMileage {
    public static int isInteresting(int number, int[] awesomePhrases) {
        //Go to town
        int returnNumber = 0;
        if (number < 98) return 0;

        for (int i : awesomePhrases)
            System.out.println();

        if (isInterest(number, awesomePhrases) && number > 99) returnNumber = 2;

        else if (isInterest(number + 1, awesomePhrases) || isInterest(number + 2, awesomePhrases)) returnNumber = 1;
        return returnNumber;
    }

    public static boolean isInterest(int number, int[] numbers) {
        for (int n : numbers) {
            if (n == number) return true;
        }

        return isIncrease(number) || isDecrease(number) || isLeadingZero(number) || isSame(number) || isPalindrome(number);
    }

    public static boolean isIncrease(int n) {
        return "1234567890".contains(n + "");
    }

    public static boolean isDecrease(int n) {
        return "9876543210".contains(n + "");
    }

    public static boolean isSame(int n) {
        int last = n % 10;
        while (n != 0) {
            if (n % 10 != last) return false;
            n = n / 10;
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        return new StringBuilder(n + "").reverse().toString().equals(n + "");
    }

    public static boolean isLeadingZero(int n) {
        while (n % 10 == 0) {
            n = n / 10;
        }
        return n < 10;
    }

}
