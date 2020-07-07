package converter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConverterTest {

    @Test
    @DisplayName("Converter should return correct ASCII code")
    void test1(){
        //given
        StringConverter converter = StringConverter.getInstance();
        int charCode1 = 'X';
        int charCode2 = 'a';
        int charCode3 = '1';

        //when
        int code1 = converter.convertCharToASCII('X');
        int code2 = converter.convertCharToASCII('a');
        int code3 = converter.convertCharToASCII('1');

        //them
        assertEquals(charCode1, code1);
        assertEquals(charCode2, code2);
        assertEquals(charCode3, code3);
    }

    @Test
    @DisplayName("StringConverter should be singleton")
    void test2(){
        //given
        StringConverter converter2 = StringConverter.getInstance();
        StringConverter converter1 = StringConverter.getInstance();

        //then
        assertSame(converter1, converter2);
    }

    @Test
    @DisplayName("Converter should throw IllegalArgumentException when argument is null")
    void test3(){
        //given
        StringConverter converter = StringConverter.getInstance();

        //then
        assertThrows(IllegalArgumentException.class, () -> converter.convertStringToASCII(null));
    }

    @Test
    @DisplayName("Converter should return correct ASCII text")
    void test4(){
        //given
        StringConverter converter = StringConverter.getInstance();
        String codeString = (int)'A' + " " + (int)'b' + " " + (int)'1';

        //when
        String result = converter.convertStringToASCII("Ab1");

        //then
        assertEquals(codeString, result);
    }
}