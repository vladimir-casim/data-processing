package liangintro.ch24_implstructures.examples.stack_queue;

import ch23_sorting.examples.Heap;

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
