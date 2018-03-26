package farruh.edu.jumbocs.tree;

public abstract class AbstractTree<T> implements TreeADT<T> {

    public boolean isInternal(Position<T> p) {
        return numChildren(p) > 0;
    }

    public boolean isExternal(Position<T> p) {
        return numChildren(p) == 0;
    }

    public boolean isRoot(Position<T> p) {
        return p == root();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int depth(Position<T> p) {
        if (isRoot(p)) {
            return 0;
        } else {
            return 1 + depth(parent(p));
        }
    }

    private int heightBad() {
        int h = 0;
        for (Position<T> p : positions()) {
            if (isExternal(p)) {
                h = Math.max(h, depth(p));
            }
        }
        return h;
    }

    public int height(Position<T> p) {
        int h = 0;
        for (Position<T> o : children(p)) {
            h = Math.max(h, 1 + height(o));
        }
        return h;
    }
}
