package liangintro.implstructures.examples.list;

public interface MyList<E> extends Iterable<E> {

    /** Add a new element at the end of this arraylist */
    public void add(E e);

    /** Add a new element at the specified index in this arraylist */
    public void add(E e, int index);

    /** Replace the element at the specified position in this arraylist
     * with the specified element and return the old element.
     */
    public Object set(int index, E e);

    /** Return the element from this arraylist at the specified index */
    public E get(int index);

    /** Clear the arraylist */
    public void clear();

    /** Return true if this arraylist contains the element */
    public boolean contains(E e);

    /** Return the index of the first matching element in this arraylist.
     * Return -1 if no match.
     */
    public int indexOf(E e);

    /** Return the index of the last matching element in this arraylist
     * Return -1 if no match.
     */
    public int lastIndexOf(E e);

    /** Return true if this arraylist doesn't contain any elements */
    public boolean isEmpty();

    /** Remove the first occurrence of the element e from this arraylist.
     * Shift any subsequent elements to the left.
     * Return true if the element is removed.
     */
    public boolean remove(E e);

    /** Remove the element at the specified position in this arraylist.
     * Shift any subsequent elements to the left.
     * Return the element that was removed from the arraylist. */
    public E remove(int index);

    /** Return the number of elements in this arraylist */
    public int size();

    /** Adds the elements in otherList to this list.
     * Returns true if this list changed as a result of the call */
    public boolean addAll(MyList<E> otherList);

    /** Removes all the elements in otherList from this list
     * Returns true if this list changed as a result of the call */
    public boolean removeAll(MyList<E> otherList);

    /** Retains the elements in this list that are also in otherList
     * Returns true if this list changed as a result of the call */
    public boolean retainAll(MyList<E> otherList);

}
