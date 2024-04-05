package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Studio {
    public static void main(String[] args) {
        HashMap<Character,Integer> numOfCharacters = new HashMap<>();
        String testString = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics" +
                " into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that," +
                " it’s pretty straightforward from there.";
        char[] charactersInString = testString.toCharArray();
        for(char character : charactersInString) {
            Integer occurances = 0;
            for(int i=0; i < charactersInString.length; i++) {
                if(charactersInString[i] == character) {
                    occurances ++;
                }
                numOfCharacters.put(character, occurances);
            }
        }
        for(Map.Entry<Character,Integer> charAndOccur : numOfCharacters.entrySet()) {
            System.out.println(charAndOccur.getKey()+": "+charAndOccur.getValue());
        }


    }
}
