package liangintro.implstructures.examples.linkedlist;

import liangintro.implstructures.examples.list.MyAbstractList;

import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList<E> {
    Node<E> head = null;
    Node<E> tail = null;

    public MyLinkedList() {
    }

    public MyLinkedList(E[] elements) {
        super(elements);
    }

    @Override
    public void add(E e, int index) { // Implemented in Section 24.4.3.3
        if(index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else {
            Node<E> newNode = new Node<>(e);
            Node<E> current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node<E> temp = current.next;
            current.next = newNode;
            newNode.next = temp;
            size++;
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
    public E set(int index, E element) {
        System.out.println("Implementation left as an exercise");
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        E oldElement = current.element;
        current.element = element;
        return oldElement;
    }

    @Override
    public E get(int index) {
        System.out.println("Implementation left as an exercise");
        if (index >= size) index = size - 1;
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public E getFirst() {
        if (size == 0)
            return null;
        else
            return head.element;
    }

    public E getLast() {
        if (size == 0)
            return null;
        else
            return tail.element;
    }

    @Override
    public int indexOf(E e) {
        System.out.println("indexOf implementation left as an exercise");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (e.equals(current.element)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        System.out.println("lastIndexOf Implementation left as an exercise");
        Node<E> current = head;
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if (e.equals(current.element)) {
                lastIndex = i;
            }
            current = current.next;
        }

        return lastIndex;
    }

    @Override
    public boolean contains(E e) {
        System.out.println("contains implementation left as an exercise");
        Iterator listIterator = iterator();
        while (listIterator.hasNext()) {
            if (e.equals(listIterator.next())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }

    @Override
    public E remove(int index) { // Implemented earlier in Section 24.4.3.6
        if (index < 0 || index >= size) return null;
        else if (index == 0) return removeFirst();
        else if (index == size - 1) return removeLast();
        else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    public E removeFirst() { // Implemented in Section 24.4.3.4
        if (size == 0) return null;
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return temp.element;
        }
    }

    public E removeLast() { // Implemented in Section 24.4.3.5
        if (size == 0) return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++)
                current = current.next;
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", ");
            } else {
                result.append("]");
            }
        }

        return result.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        @Override
        public void remove() {
            System.out.println("Implementation left as an exercise");
        }
    }

    // This class is only used in LinkedList, so it is private.
    // This class does not need to access any
    // instance members of LinkedList, so it is defined static.
    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

}
