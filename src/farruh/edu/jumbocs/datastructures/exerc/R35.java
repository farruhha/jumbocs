package farruh.edu.jumbocs.datastructures.exerc;


public class R35<E> {
    
     /*
    * size() Returns the number of elements
    * isEmpty() Returns true if the list is empty and false otherwise
    * first() Returns (but does not remove) the first element in the list
    * last() Returns (but does not remove) the last element in the list
    * addFirst(e) Adds a new element to the front of the list
    * addLast(e) Adds a new element to the end of the list
    * removeFirst() Removes and returns the first element of the list*/

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;

    private int size = 0;

    public R35() {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;

        if (size == 0) {
            tail = null;
        }
        return answer;
    }

    public Node<E> secondToLast() {
        Node<E> newNode = head.getNext();
        return newNode;
    }
}
