package farruh.edu.jumbocs.stackqueuedequeue.stack;

public class ArrayReverse {

    public static <E> void reverse(E[] a) {
        Stack<E> buffer = new ArrayStack<>(a.length);

        for (int i = 0; i < a.length; i++) {
            buffer.push(a[i]);
        }

        for (int i = 0; i < a.length; i++){
            a[i] = buffer.pop();
        }

    }
}
