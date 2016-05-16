package CodeWars;

/**
 * Created by wangweimin on 16/2/23.
 */
public class MoneyMoneyMoney {
    private final static double Principal = 1000.00;
    private final static double Interest_Rate = 0.05;
    private final static double Tax_Rate = 0.18;

    public int YearToWait(double principal, double interest, double tax, double desiredSum) {
        int yearToWait = 0;
        double principalNow = principal;
        while (principalNow < desiredSum) {
            principalNow = principalNow * (1 + tax - tax * interest);
            yearToWait++;
        }
        return yearToWait;
    }
}
