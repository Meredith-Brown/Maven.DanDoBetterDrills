package com.zipcodewilmington.danny_do_better_exercises;
import java.lang.String;
import java.lang.reflect.Array;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        return input.substring(0,3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        int i = input.length();
        return input.substring(i-3, i);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        Character middleCharacter = 0;
        int i = 0;
        if (inputValue.length() % 2 == 0) {
            i = inputValue.length()/2 - 1;
        } else if (inputValue.length() % 2 != 0) {
            i = Math.round(inputValue.length()/2);
        }
        middleCharacter = inputValue.charAt(i);
        return middleCharacter;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        int i = spaceDelimitedString.indexOf(' ');
        return spaceDelimitedString.substring(0, i);
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String [] splitString = spaceDelimitedString.split(" ");
        return (String) Array.get(splitString, 1); // index is 1 bc the index for the first word is 0
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        return new StringBuilder(stringToReverse).reverse().toString();
    }
}
