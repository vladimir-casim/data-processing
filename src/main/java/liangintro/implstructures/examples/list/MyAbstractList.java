package liangintro.implstructures.examples.list;

import liangintro.implstructures.examples.arraylist.MyArrayList;

public abstract class MyAbstractList<E> implements MyList<E> {
    protected int size;

    protected MyAbstractList() {
    }

    protected MyAbstractList(E[] objects) {
        for (E object: objects) {
            add(object);
        }
    }

    @Override
    public void add(E e) {
        add(e, size);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(E e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else {
            return false;
        }
    }

    public boolean addAll(MyList<E> otherList) {
        otherList.forEach(e -> add(e));
        return true;
    }

    public boolean removeAll(MyList<E> otherList) {
        otherList.forEach(e -> remove(e));
        return true;
    }

    public boolean retainAll(MyList<E> otherList) {
        MyList<E> elementsToBeRemained = new MyArrayList<>();
        for (E otherElement: otherList) {
            if (contains(otherElement)) {
                elementsToBeRemained.add(otherElement);
            }
        }
        clear();
        addAll(elementsToBeRemained);
        return true;
    }

}
