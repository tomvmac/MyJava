package com.algorithm.questions.arrays;

import com.datastructure.stack.CharStack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        String mySentence = new String ("i am stupid!");
        StringBuffer tmpStringBuffer = new StringBuffer();
        CharStack charStack = new CharStack(mySentence.length());
        char charTmp;

        char [] charArray = mySentence.toCharArray();
        char [] newCharArray  = new char[charArray.length];

        // Iterate through chars of sentence and push to stack
        for (int i=0; i < charArray.length; i++){
            try {
                charStack.push(charArray[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0; i < charArray.length; i++){
            try {
                charTmp = (char) charStack.pop();
                System.out.println(charTmp);
                tmpStringBuffer.append(charTmp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        System.out.println("mySentence = " + mySentence);
        System.out.println("myReverseSentence = " + tmpStringBuffer.toString());

    }


}
