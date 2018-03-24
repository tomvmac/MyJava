package com.algorithm.questions.arrays;

public class ReverseStringUsingArray {


    public static void main(String[] args) {

        String mySentence = new String ("Tom is a good student");

        System.out.println("mySentence = " + mySentence);
        System.out.println("myReverseStrings = " + reverseString(mySentence));

        // reverse words in a sentence
        System.out.println("myReverseSentence = " + reverseWords(mySentence));

    }

    public static String reverseWords(String sentence){
        StringBuffer reverseSentence = new StringBuffer();

        // split sentence into words
        String [] words = sentence.split(" ");

        for (int i=0; i < words.length; i++){
            reverseSentence.append(reverseString(words[i]) + " ");
        }

        return reverseSentence.toString();
    }


    public static String reverseString(String string) {
        char[] cArr = string.toCharArray();
        StringBuffer sb = new StringBuffer();


        for (int i=cArr.length-1; i >= 0; i--){
            sb.append(cArr[i]);
        }

        return sb.toString();
    }

}
