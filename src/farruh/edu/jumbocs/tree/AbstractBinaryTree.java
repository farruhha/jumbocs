package farruh.edu.jumbocs.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
    @Override
    public Position<E> left(Position<E> p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Position<E> right(Position<E> p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Position<E> siblings(Position<E> p) throws IllegalArgumentException {
        Position<E> parent = parent(p);
        if (parent == null) return null;
        if (p == left(p))
            return right(p);
        else
            return left(p);
    }

    @Override
    public Position<E> root() {
        return null;
    }

    @Override
    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException {
        List<Position<E>> snapshot = new ArrayList<>(2);
        if (left(p) != null){
            snapshot.add(left(p));
        }
        if (right(p) != null){
            snapshot.add(right(p));
        }
        return snapshot;
    }

    @Override
    public int numChildren(Position<E> p) throws IllegalArgumentException {
        int count = 0;
        if (left(p) != null){
            count++;
        }
        if (right(p) != null){
            count++;
        }
        return count;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Iterable<Position<E>> positions() {
        return null;
    }
}
