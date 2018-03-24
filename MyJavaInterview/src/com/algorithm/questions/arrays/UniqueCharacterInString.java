package com.algorithm.questions.arrays;

public class UniqueCharacterInString {


    public static boolean isUniqueChars(String str) {
        if (str.length() > 256) return false;

        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
             //int val = str.charAt(i);
             char val = str.charAt(i);
            if (char_set[val]) { // Already found this char in string
                 return false;
                 }
             char_set[val] = true;
             }
         return true;
         }

    public static void main(String[] args) {
        String stringWithUniqueChars = "hnAda";
        String sStringWithoutUniqueChars = "handa";
        System.out.println(stringWithUniqueChars + " contains unique chars is " + isUniqueChars(stringWithUniqueChars));
        System.out.println(sStringWithoutUniqueChars + " contains unique chars is " + isUniqueChars(sStringWithoutUniqueChars));
    }


}
