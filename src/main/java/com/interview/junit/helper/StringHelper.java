package com.interview.junit.helper;

public class StringHelper {

    public String truncateAInFirst2Positions(String str) {
        if (str.length() <= 2)
            return str.replaceAll("A", "");

        String first2Chars = str.substring(0, 2);
        String stringMinusFirst2Chars = str.substring(2);

        return first2Chars.replaceAll("A", "") 
                + stringMinusFirst2Chars;
    }

    public boolean areFirstAndLastTwoCharactersTheSame(String str) {

        if (str.length() <= 1)
            return false;
        if (str.length() == 2)
            return true;

        String first2Chars = str.substring(0, 2);

        String last2Chars = str.substring(str.length() - 2);

        return first2Chars.equals(last2Chars);
    }


    /** Returns a reversed copy of a non-null String. */
    public static String reverseString(String s) {
        return(new StringBuilder(s).reverse().toString());
      }
      
      /** Checks if a String is a palindrome. Accepts
       *  zero-length or one-length strings, but not null.
       */
      public static boolean isPalindrome(String s) {
        return(s.equalsIgnoreCase(reverseString(s)));
      }


}