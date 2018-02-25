package farruh.edu.jumbocs.stackqueuedequeue.exercises;

import farruh.edu.jumbocs.stackqueuedequeue.stack.Stack;

public class R65 {

    public Stack<Integer> removeAllElements(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return stack;
        } else {
            stack.pop();
            return removeAllElements(stack);
        }
    }
}
