package CodeWars;

/**
 * Created by wangweimin on 16/2/26.
 */
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String[] characters = morseCode.split(" ");
        morseCode = " " + morseCode.replace(" ", "  ") + " ";
        for (String s : characters) {
            if (!s.equals("")) morseCode = morseCode.replace(" " + s + " ", MorseCode.get(s));
        }
        return morseCode.replace("    ", " ").trim();
    }
}
