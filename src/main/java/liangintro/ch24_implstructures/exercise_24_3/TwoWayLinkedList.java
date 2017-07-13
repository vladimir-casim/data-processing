package liangintro.ch24_implstructures.exercise_24_3;


import ch24_implstructures.examples.list.MyList;

import java.util.Iterator;

public class TwoWayLinkedList<E> implements MyList<E> {
    protected int size;
    Node<E> head = null;
    Node<E> tail = null;

    public TwoWayLinkedList() {}

    public TwoWayLinkedList(E[] elements) {
        for (E element: elements)
            add(element);
    }

    @Override
    public void add(E e) {
        add(e, size);
    }

    @Override
    public void add(E e, int index) {
        if (index == 0) addFirst(e);
        if (index >= size) addLast(e);
        else {

        }
    }

    public void addFirst(E e) { // Implemented in Section 24.4.3.1
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }

    public void addLast(E e) { // Implemented in Section 24.4.3.2
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    @Override
    public Object set(int index, E e) {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean addAll(MyList<E> otherList) {
        return false;
    }

    @Override
    public boolean removeAll(MyList<E> otherList) {
        return false;
    }

    @Override
    public boolean retainAll(MyList<E> otherList) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    public class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;

        public Node(E e) {
            element = e;
        }
    }

}
