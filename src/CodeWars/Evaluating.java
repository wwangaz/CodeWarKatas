package CodeWars;

import java.util.Stack;

/**
 * Created by wangweimin on 16/5/11.
 */
public class Evaluating {
    public double evaluate(String expr) {
        if (expr.length() == 0)
            return 0;
        Stack<Double> calculate = new Stack<>();
        String[] chars = expr.split(" ");
        for (String s : chars) {
            if (s.matches("[0-9/.]*"))
                calculate.push(Double.parseDouble(s + ""));
            else switch (s) {
                case "+":
                    calculate.push(calculate.pop() + calculate.pop());
                    break;
                case "-":
                    calculate.push(-calculate.pop() + calculate.pop());
                    break;
                case "*":
                    calculate.push(calculate.pop() * calculate.pop());
                    break;
                case "/":
                    calculate.push(1 / calculate.pop() * calculate.pop());
                    break;
            }
        }
        return calculate.pop();
    }
}
