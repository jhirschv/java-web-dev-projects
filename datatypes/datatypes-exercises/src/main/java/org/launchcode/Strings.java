package org.launchcode;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String passage = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        Integer index = passage.indexOf(word);
        Integer length = word.length();
        System.out.println("Your word is at index "+index+" and has a length of "+length);
        String modifiedPassage = passage.replace(word, "");
        System.out.println(modifiedPassage);
        //boolean containsWord = passage.contains(word);

    }
}
