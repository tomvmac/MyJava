package com.algorithm.questions.arrays;

public class ReverseStringUsingArray {


    public static void main(String[] args) {

        String mySentence = new String ("i am stupid!");

        System.out.println("mySentence = " + mySentence);
        System.out.println("myReverseSentence = " + reverseString(mySentence));


    }

    public static String reverseString(String string) {
        char[] cArr = string.toCharArray();
        StringBuffer sb = new StringBuffer();


        for (int i=cArr.length-1; i > 0; i--){
            sb.append(cArr[i]);
        }

        return sb.toString();
    }

}
