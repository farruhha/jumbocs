package farruh.edu.jumbocs.stackqueuedequeue.queue;

public class JosephusProblem {

    public static <E> E Josephis(CircularQueue<E> queue, int k){
        if (queue.isEmpty()) return null;
        while (queue.size() > 1){
            for (int i = 0; i < k - 1 ; i++) {
                queue.rotate();
            }
            E e = queue.deqeueu();
            System.out.println(" " +e+"is out");
        }
        return queue.deqeueu();
    }


}
