package farruh.edu.jumbocs.stackqueuedequeue.queue;

import farruh.edu.jumbocs.datastructures.singlylinkedlist.SinglyLinkedList;

public class LinkedListQueue<E> implements Queue<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public LinkedListQueue() {

    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqeueu(E e) {
        list.addLast(e);
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public E deqeueu() {
        return list.removeFirst();
    }
}
