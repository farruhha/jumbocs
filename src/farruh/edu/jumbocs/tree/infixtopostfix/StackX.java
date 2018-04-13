package farruh.edu.jumbocs.tree.infixtopostfix;

import farruh.edu.jumbocs.stackqueuedequeue.stack.Stack;

public class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public char peekN(int n){
        return stackArray[n];
    }
}
