package liangintro.ch24_implstructures.examples.linkedlist;

public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("America");
        list.add("Canada", 0);
        list.add("Russia");
        list.addLast("France");
        list.add("Norway");
        System.out.println(list);

        MyLinkedList<String> retainList = new MyLinkedList<>();
        retainList.add("Bulgaria");
        retainList.add("Norway");
        retainList.add("France");
        list.retainAll(retainList);

        System.out.println(list);
    }

}
