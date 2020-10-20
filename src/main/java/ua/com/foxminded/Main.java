package ua.com.foxminded;

public class Main {

    private static TextReverser textReverser = new TextReverser();
    
    public static void main(String[] args) {
        for (String input : args) {
            String anagramText = textReverser.reverseOnlyLetters(input);

            System.out.println(input + " => " + anagramText);
        }
    }
    
    static void setTextReverser(TextReverser newTextReverser) {
        textReverser = newTextReverser;
    }

}
