package CodeWars;

import java.util.Arrays;

/**
 * Created by wayne on 2017/5/4.
 */
public class MorseCodeDecoderAdvance {

    public static int calculateMinUnit(String bits) {
        int min = Integer.MAX_VALUE;
        int current = 0;
        char previous = bits.charAt(0);
        for (char c : bits.toCharArray()) {
            if (c == previous) {
                current++;
            } else {
                if (current < min) {
                    min = current;
                }
                current = 1;
            }
            previous = c;
        }
        if (current < min) {
            min = current;
        }
        return min;
    }

    public static String decodeBits(String bits) {

        if (bits.startsWith("0")) {
            bits = bits.substring(bits.indexOf("1"));
        }

        if (bits.endsWith("0")) {
            bits = bits.substring(0, bits.lastIndexOf("1") + 1);
        }

        int minUnit = calculateMinUnit(bits);

        char[] wordSeparatorChar = new char[minUnit * 7];
        Arrays.fill(wordSeparatorChar, '0');

        String wordSeparator = new String(wordSeparatorChar);
        String characterSeparator = wordSeparator.substring(0, minUnit * 3);
        String dash = characterSeparator.replace("0", "1");
        String dot = dash.substring(0, minUnit);
        String elise = dot.replace("1", "0");

        return bits
                .replace(wordSeparator, "   ")
                .replace(characterSeparator, " ")
                .replace(dash, "-")
                .replace(dot, ".")
                .replace(elise, "").trim();
    }

    public static String decodeMorse(String morseCode) {
        return MorseCodeDecoder.decode(morseCode);
    }
}
