package CodeWars;

/**
 * Created by wangweimin on 16/2/26.
 */
public class MorseCode {
    private static String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " " };
    private static String[] dottie = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "|" };

    public static String get(String code){
        int i = 0;
        for(String s : dottie){
            if(code.equals(s))
                return alpha[i];
            i++;
        }
        return "";
    }
}
