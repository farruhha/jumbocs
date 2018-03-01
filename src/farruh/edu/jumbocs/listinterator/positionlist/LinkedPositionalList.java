package farruh.edu.jumbocs.listinterator.positionlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedPositionalList<E> implements PositionalList<E>, Iterable<Position<E>> {

    @Override
    public Iterator<Position<E>> iterator() {
        return null;
    }

    private static class Node<E> implements Position<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> pre, Node<E> n) {
            element = e;
            prev = pre;
            next = n;

        }

        @Override
        public E getElement() throws IllegalStateException {
            return null;
        }

        public void setElement(E e) {
            this.element = e;
        }


        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    // header sentinel
    private Node<E> header;
    //trailer sentinel
    private Node<E> trailer;
    // number of elements
    private int size = 0;

    public LinkedPositionalList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    private Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");

        Node<E> node = (Node<E>) p;

        if (node.getNext() == null) {
            throw new IllegalArgumentException("p is no longer in the list");
        }
        return node;
    }

    private Position<E> position(Node<E> node) {
        if (node == header || node == trailer) {
            return null;
        }
        return node;
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
    public Position<E> first() {
        return position(header.getNext());
    }

    @Override
    public Position<E> last() {
        return trailer.getPrev();
    }

    @Override
    public Position<E> before(Position<E> position) throws IllegalStateException {
        Node<E> node = validate(position);
        return position(node.getPrev());
    }

    @Override
    public Position<E> after(Position<E> after) throws IllegalStateException {
        Node<E> node = validate(after);
        return position(node.getNext());
    }

    private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
        Node<E> newest = new Node<>(e, pred, succ);
        pred.setNext(newest);
        succ.setPrev(newest);
        size++;
        return newest;
    }

    @Override
    public Position<E> addFirst(E e) {
        return addBetween(e, header, header.getNext());
    }

    @Override
    public Position<E> addLast(E e) {
        return addBetween(e, trailer.getPrev(), trailer);
    }

    @Override
    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return addBetween(e, node.getPrev(), node);
    }

    @Override
    public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return addBetween(e, node, node.getNext());
    }

    @Override
    public E set(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        E answer = node.getElement();
        node.setElement(e);
        return answer;
    }

    @Override
    public E remove(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        E answer = node.getElement();
        node.setElement(null);
        node.setNext(null);
        node.setPrev(null);
        return answer;
    }

    private class PositionIterator implements Iterator<Position<E>> {
        private Position<E> cursor = first();
        private Position<E> recent = null;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public Position<E> next() throws NoSuchElementException {
            if (cursor == null) throw new NoSuchElementException("nothing self");
            recent = cursor;
            cursor = after(cursor);
            return recent;
        }

        @Override
        public void remove() {

            if (recent == null) throw new IllegalStateException("nothing to remove");
            LinkedPositionalList.this.remove(recent);
            recent = null;
        }
    }

    private class PositionIterable implements Iterable<Position<E>> {

        @Override
        public Iterator<Position<E>> iterator() {
            return new PositionIterator();
        }
    }

    public Iterable<Position<E>> positions() {
        return new PositionIterable();
    }

    private class ElementIterator implements Iterator<E> {
        Iterator<Position<E>> positionIterator = new PositionIterator();

        public boolean hasNext() {
            return positionIterator.hasNext();
        }


        @Override
        public E next() {
            return positionIterator.next().getElement();
        }

        public void remove() {
            positionIterator.remove();
        }
    }
}
