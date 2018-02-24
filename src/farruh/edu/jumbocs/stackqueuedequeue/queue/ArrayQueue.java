package farruh.edu.jumbocs.stackqueuedequeue.queue;

public class ArrayQueue<E> implements Queue<E> {
    private E[] data;
    private int f = 0;
    private int size = 0;
    private int CAPACITY = 1000;


    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqeueu(E e) throws IllegalStateException {
        if (size == data.length) throw new IllegalStateException("Queue is full");
        int available = (f + size) % data.length;
        data[available] = e;
        size++;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }

    @Override
    public E deqeueu() {
        if (isEmpty()) return null;
        E answer = data[f];
        data[f] = null;

        f = (f + 1) % data.length;
        size--;
        return answer;
    }
}
