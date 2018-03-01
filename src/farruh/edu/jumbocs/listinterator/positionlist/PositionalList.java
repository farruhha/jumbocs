package farruh.edu.jumbocs.listinterator.positionlist;

import javafx.geometry.Pos;

public interface PositionalList<E> {

    int size();

    boolean isEmpty();

    Position<E> first();

    Position<E> last();


    Position<E> before(Position<E> position) throws IllegalStateException;

    Position<E> after(Position<E> after) throws IllegalStateException;

    Position<E> addFirst(E e);

    Position<E> addLast(E e);

    Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;

    Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;

    E set(Position<E> p, E e) throws IllegalArgumentException;

    E remove(Position<E> p) throws IllegalArgumentException;

}
