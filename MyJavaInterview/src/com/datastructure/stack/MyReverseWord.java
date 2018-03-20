package com.datastructure.stack;

public class MyReverseWord {

    public String reverseWord(String word){

        StringBuilder sb = new StringBuilder();
        int size = word.length();
        StackImpl stack = new StackImpl(size);
        for(int i=0;i<size;i++){
            stack.push(word.charAt(i));
        }
        while(!stack.isStackEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public String reverseWordMethod2(String word){
        StringBuilder sb = new StringBuilder();
        int size = word.length();
        StackImpl stack = new StackImpl(size);

        char [] lettersInWord = word.toCharArray();

        for(int i=0;i<lettersInWord.length;i++){
            stack.push(lettersInWord[i]);
        }
        while(!stack.isStackEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String a[]){
        MyReverseWord mwr = new MyReverseWord();
        System.out.println("Java2Novice == "+mwr.reverseWord("Java2Novice"));
        System.out.println("Java == "+mwr.reverseWord("Java"));
        System.out.println("program == "+mwr.reverseWord("program"));


        System.out.println("Java2Novice == "+mwr.reverseWordMethod2("Java2Novice"));
        System.out.println("Java == "+mwr.reverseWordMethod2("Java"));
        System.out.println("program == "+mwr.reverseWordMethod2("program"));




    }
}

