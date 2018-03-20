package com.datastructure.stack;

public class StackImpl {

    private int stackSize;
    private char[] stackArr;
    private int top;

    /**
     * constructor to create stack with size
     * @param size
     */
    public StackImpl(int size) {
        this.stackSize = size;
        this.stackArr = new char[stackSize];
        this.top = -1;
    }

    /**
     * This method adds new entry to the top
     * of the stack
     * @param entry
     * @throws Exception
     */
    public void push(char entry) {
        this.stackArr[++top] = entry;
    }

    /**
     * This method removes an entry from the
     * top of the stack.
     * @return
     * @throws Exception
     */
    public char pop() {
        char entry = this.stackArr[top--];
        return entry;
    }

    /**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
    public char peek() {
        return stackArr[top];
    }

    /**
     * This method returns true if the stack is
     * empty
     * @return
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }

    /**
     * This method returns true if the stack is full
     * @return
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
}
