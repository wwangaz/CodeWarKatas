package CodeWars;

/**
 * Created by wayne on 2017/5/4.
 */

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MorseCodeDecodeAdvanceTest {
    @Test
    public void testCalculateMin() throws Exception {
        assertEquals(2, MorseCodeDecoderAdvance.calculateMinUnit("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"));
        assertEquals(3, MorseCodeDecoderAdvance.calculateMinUnit("111"));
        assertEquals(2, MorseCodeDecoderAdvance.calculateMinUnit("11"));
        assertEquals(1, MorseCodeDecoderAdvance.calculateMinUnit("1"));
    }

    @Test
    public void testExtrasZeros() throws Exception {
        assertThat(MorseCodeDecoderAdvance.decodeMorse(MorseCodeDecoderAdvance.decodeBits("000000011001100110011000000110000001111110011001111110011111100000000000000110011111100111111001111110000001100110011111100000011111100110011000000110000000")), is("HEY JUDE"));
    }

    @Test
    public void testExampleFromDescription() throws Exception {
        assertThat(MorseCodeDecoderAdvance.decodeMorse(MorseCodeDecoderAdvance.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")), is("HEY JUDE"));
    }

    @Test
    public void testBitsToMorseCode() throws Exception {
        assertThat(MorseCodeDecoderAdvance.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"), is(".... . -.--   .--- ..- -.. ."));
    }

    @Test
    public void testLongParagraph() throws Exception {
        assertThat(MorseCodeDecoderAdvance.decodeMorse(MorseCodeDecoderAdvance.decodeBits("1110001010101000100000001110111010111000101011100010100011101011101000111010111000000011101010100010111010001110111011100010111011100011101000000010101110100011101110111000111010101110000000101110111011100010101110001110111000101110111010001010100000001110111011100010101011100010001011101000000011100010101010001000000010111010100010111000111011101010001110101110111000000011101010001110111011100011101110100010111010111010111")), is("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
    }

    @Test
    public void testSingleCharacter() throws Exception {
        assertThat(MorseCodeDecoderAdvance.decodeMorse(MorseCodeDecoderAdvance.decodeBits("1")), is("E"));
        assertThat(MorseCodeDecoderAdvance.decodeMorse(MorseCodeDecoderAdvance.decodeBits("11")), is("E"));
        assertThat(MorseCodeDecoderAdvance.decodeMorse(MorseCodeDecoderAdvance.decodeBits("111")), is("E"));
    }
}
