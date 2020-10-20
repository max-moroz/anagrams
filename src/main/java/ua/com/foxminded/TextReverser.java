package ua.com.foxminded;

import java.util.StringJoiner;

public class TextReverser {

    public String reverseOnlyLetters(String sentence) {
        String words[] = sentence.split(" ");
        StringJoiner anagram = new StringJoiner(" ");

        for (int i = 0; i < words.length; i++) {

            anagram.add(reverseSeparateWord(words[i]));
        }
        return anagram.toString();
    }

    
    private String reverseSeparateWord(String word) {

        char sentencePart[] = new char[word.length()];
        sentencePart = word.toCharArray();

        int firstIndex = 0;
        int lastIndex = sentencePart.length - 1;

        for (int i = 0; i < sentencePart.length; i++) {

            char symbolToBeSwapped = sentencePart[lastIndex];

            if (firstIndex < lastIndex) {

                if (!Character.isLetter(sentencePart[firstIndex])) {
                    firstIndex++;

                } else {
                    if (!Character.isLetter(symbolToBeSwapped)) {
                        lastIndex--;
                        symbolToBeSwapped = sentencePart[lastIndex];

                    } else {
                        sentencePart[lastIndex] = sentencePart[firstIndex];
                        sentencePart[firstIndex] = symbolToBeSwapped;

                        firstIndex++;
                        lastIndex--;

                        symbolToBeSwapped = sentencePart[lastIndex];
                    }
                }
            }
        }
        return new String(sentencePart);
    }
}
