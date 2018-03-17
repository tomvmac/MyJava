package com.algorithm.questions;

import java.util.ArrayList;
public class TitleCaseProblem {

    private static ArrayList<String> lowercaseWordList = new ArrayList<String> ();

    public static String titleCase(String rawTitle){
        String cleanTitle = new String();

        // split rawTitle into words
        String [] words = rawTitle.split(" ");

        // Process first word
        String firstWord = capitalizeWord(words[0]);
        String lastWord = capitalizeWord(words[words.length-1]);

        cleanTitle = firstWord;

        // loop through the 2nd to 2nd last element
        for (int i=1; i < words.length-1; i++){
            if (lowercaseWordList.contains(words[i].toLowerCase())){
                cleanTitle = cleanTitle + " " + lowerCaseWord(words[i]);
            }
            else
            {
                cleanTitle = cleanTitle + " " + capitalizeWord(words[i]);
            }
        }

        // Combine the entire sentence
        cleanTitle = cleanTitle + " " + lastWord;

        return cleanTitle;
    }

    public static String lowerCaseWord(String word){
        return word.toLowerCase();
    }

    public static String capitalizeWord(String word){
        String captializeWord = new String();
        String tempWord = new String();

        // lowercase word first
        tempWord = lowerCaseWord(word);

        String [] tempWordArray = tempWord.split("");

        for (int i=0; i <tempWord.length(); i++){
            if (i == 0){
                captializeWord = captializeWord + tempWordArray[i].toUpperCase();
            }
            else {
                captializeWord = captializeWord + tempWordArray[i];
            }
        }

        return captializeWord;

    }

    public static void main(String[] args){
        // Initialize lowercaseWordList
        lowercaseWordList.add("in");
        lowercaseWordList.add("the");
        lowercaseWordList.add("with");
        lowercaseWordList.add("or");
        lowercaseWordList.add("but");

        String rawTitle = "when bIRDs in THE flight";

        System.out.println("Original Title:");
        System.out.println(rawTitle);

        System.out.println("Title case:");
        System.out.println(titleCase(rawTitle));

    }
}
