package farruh.edu.jumbocs.tree;

public interface BinaryTree<E>  extends TreeADT<E>{

    Position<E> left(Position<E> p) throws IllegalArgumentException;

    Position<E> right(Position<E> p) throws IllegalArgumentException;

    Position<E> siblings(Position<E> p) throws IllegalArgumentException;
}
