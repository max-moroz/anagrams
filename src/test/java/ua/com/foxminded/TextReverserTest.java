package ua.com.foxminded;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextReverserTest {

    TextReverser textReverser = new TextReverser();

    
    @Test
    void test_ReverseOnlyLetters_ShouldThrowException_WhenInputIsNull() {
        assertThrows(NullPointerException.class, () -> textReverser.reverseOnlyLetters(null));
    }
    

    @Test
    void test_ReverseOnlyLetters_ShouldReturnEmptyString_WhenInputIsEmptyString() {
        assertEquals("", textReverser.reverseOnlyLetters(""));
    }
    

    @Test
    void test_ReverseOnlyLetters_ShouldReturnEmptyString_WhenInputIsWhitespases() {
        assertAll(
                () -> assertEquals("", textReverser.reverseOnlyLetters(" ")),
                () -> assertEquals("", textReverser.reverseOnlyLetters("  "))
                );
    }

    
    @Test
    void test_ReverseOnlyLetters_ShouldReturnTheSameSymbol_WhenInputIsOneSymbolOnly() {
        assertAll(
                () -> assertEquals("a", textReverser.reverseOnlyLetters("a")),
                () -> assertEquals("A", textReverser.reverseOnlyLetters("A")),
                () -> assertEquals("1", textReverser.reverseOnlyLetters("1"))
                );
    }
    

    @Test
    void test_ReverseOnlyLetters_ShouldReturnTheSameStringAsInput_WhenInputConsistsOfTheOnlyOneSymbolRepeated() {
        assertAll(
                () -> assertEquals("aaaaaaa", textReverser.reverseOnlyLetters("aaaaaaa")),
                () -> assertEquals("AAA", textReverser.reverseOnlyLetters("AAA")),
                () -> assertEquals("1111", textReverser.reverseOnlyLetters("1111"))
                );
    }
    

    @Test
    void test_ReverseOnlyLetters_ShouldReturnFullyReversedString_WhenInputIsLettersOnly() {
      assertAll(
               () -> assertEquals("edcba", textReverser.reverseOnlyLetters("abcde")),
               () -> assertEquals("EDCBA", textReverser.reverseOnlyLetters("ABCDE"))
               );
    }
    
    
    @Test
    void test_ReverseOnlyLetters_ShouldReturnReversedString_WhenInputConsistsOfTheSameLetterRepeatedInDifferentCases() {
        assertEquals("AaaAa",textReverser.reverseOnlyLetters("aAaaA"));
    }
    
    
    @Test
    void test_ReverseOnlyLetters_ShouldReturnTheSameStringAsInput_WhenInputIsNonLetterSymbolsOnly() {
        assertEquals("123!7@", textReverser.reverseOnlyLetters("123!7@"));
    }

    
    @Test
    void test_ReverseOnlyLetters_ShouldReturnLettersReversedStringOnly_WhenInputIsStringOfLettersAndNonLetterSymbols() {
        assertEquals("123cba", textReverser.reverseOnlyLetters("123abc"));
    }
    
    
    @Test
    void test_ReverseOnlyLetters_ShouldReturnLettersReversedStringOnly_WhenInputIsStringOfLettersAndNonLetterSymbolsDividedBySpaces() {
        assertAll(
                () -> assertEquals("123cba 98qwer!", textReverser.reverseOnlyLetters("123abc 98rewq!")),
                () -> assertEquals("krv1,@da 98rewq! $89fad&", textReverser.reverseOnlyLetters("adv1,@rk 98qwer! $89daf&"))
                );
    }
    
    @Test
    void test_ReverseOnlyLetters_ShouldReturnSpecialSymbols_WhenInputIsSpecialSymbols() {
        assertEquals("\b\t\n\r\f\'\\\"", textReverser.reverseOnlyLetters("\b\t\n\r\f\'\\\""));
    }
  }
