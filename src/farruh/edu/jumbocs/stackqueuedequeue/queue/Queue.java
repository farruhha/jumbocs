package farruh.edu.jumbocs.stackqueuedequeue.queue;

public interface Queue<E> {

    int size();
    boolean isEmpty();

    void enqeueu(E e);

    E first();

    E deqeueu();


}
