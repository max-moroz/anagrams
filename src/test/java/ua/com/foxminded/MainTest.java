package ua.com.foxminded;

import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOutput = System.out;
    private final PrintStream originalErr = System.err;

    Main main = new Main();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOutput);
        System.setErr(originalErr);
        Main.setTextReverser(new TextReverser());
    }

    @Test
    void test_ShouldNotInvokeTextReverser_WhenNoArguments() {
        String[] arguments = {};
        TextReverser mockedTextReverser = mock(TextReverser.class);
        Main.setTextReverser(mockedTextReverser);
        Main.main(arguments);
        verify(mockedTextReverser, times(0)).reverseOnlyLetters(anyString());
    }

    @Test
    void test_ShouldInvokeTextReverser_WhenNullArgument() {
        String[] arguments = { null };
        TextReverser mockedTextReverser = mock(TextReverser.class);
        Main.setTextReverser(mockedTextReverser);
        Main.main(arguments);
        verify(mockedTextReverser, times(1)).reverseOnlyLetters(null);
    }

    @Test
    void test_ShouldInvokeTextReverserOnce_WhenOneArguments() {
        String[] arguments = { "abc123" };
        TextReverser mockedTextReverser = mock(TextReverser.class);
        Main.setTextReverser(mockedTextReverser);
        Main.main(arguments);
        verify(mockedTextReverser, times(1)).reverseOnlyLetters("abc123");
    }

}
