package liangintro.implstructures.examples.stack_queue;

import liang.examples.Heap;

public class MyPriorityQueue<E extends Comparable<E>>  {
    private Heap<E> heap = new Heap<E>();

    public void enqueue(E newObject) {
        heap.add(newObject);
    }

    public E dequeue() {
        return heap.remove();
    }

    public int getSize() {
        return heap.getSize();
    }
}
