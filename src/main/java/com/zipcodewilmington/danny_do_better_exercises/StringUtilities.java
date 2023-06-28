package com.zipcodewilmington.danny_do_better_exercises;

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
        return input.substring(input.length() - 3);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        Boolean bigBool = true;

        if (inputValue.length() == comparableValue.length()) {
            for (int i=0; i < inputValue.length(); i++){
                if (inputValue.charAt(i) == inputValue.charAt(i)){
                    bigBool = true;
                }
                else {
                    bigBool = false;
                    break;
                }
            }
        }
        else {
            bigBool = false;
        }
        return bigBool;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        char midChar;

        if (inputValue.length() % 2 == 0){
            midChar = inputValue.charAt((inputValue.length() / 2) - 1);
        }
        else {
            midChar = inputValue.charAt((inputValue.length() / 2));
        }

        return midChar;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String tempString = "";
        int i;

        for (i=0; i < spaceDelimitedString.length(); i++){
            if (spaceDelimitedString.charAt(i) == ' '){
                break;
            }
            else {
                tempString += spaceDelimitedString.charAt(i);
            }
        }
        return tempString;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String tempString = "";

        tempString = spaceDelimitedString.split(" ")[1];

        return tempString;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String tempString = "";
        int i;

        for (i = (stringToReverse.length() - 1); i > -1; i--) {
            tempString += stringToReverse.charAt(i);
        }

        return tempString;
    }
}
