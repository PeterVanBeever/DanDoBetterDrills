package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Modified by kristofer 3/4/2024.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String outcome = "Hello World";
        return outcome;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        String outcome = firstSegment + secondSegment;
        return outcome;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String outcome = Integer.toString(firstSegment);
        outcome += secondSegment;
        return outcome;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String outcome ="";
        outcome = input.substring(0,3);
        return outcome;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String outcome ="";
        outcome = input.substring(input.length() -3);
        return outcome;
    }
    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
//        if (new String(inputValue).equals(comparableValue)){
//            Boolean outcome = true;}
            if (inputValue.equals(comparableValue)){
                return true;
            }
            else {
                return false;
            }

    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int lengthOf = inputValue.length();
        System.out.println(inputValue.length());
        int middleOf = lengthOf/2;
        if (middleOf %2 != 0) {
            System.out.println("odd");
            return inputValue.charAt(middleOf);
        }
        else {
            middleOf = lengthOf/2 -1;
            System.out.println("even");
            return inputValue.charAt(middleOf);
        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String[] outcome = spaceDelimitedString.split(" ", 2);
        String first = outcome[0];
        return first;


    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] outcome = spaceDelimitedString.split(" ", 2);
        String first = outcome[1];
        return first;

    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String answer = new StringBuilder(stringToReverse).reverse().toString();
        //        return answer;
        return answer;
    }
}
