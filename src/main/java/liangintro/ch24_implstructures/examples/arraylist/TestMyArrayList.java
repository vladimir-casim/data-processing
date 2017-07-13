package liangintro.ch24_implstructures.examples.arraylist;

import liangintro.ch24_implstructures.examples.list.MyList;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<String>();

        list.add("America");
        System.out.println("(1) " + list);

        list.add("Canada", 0); // Add it to the beginning of the arraylist
        System.out.println("(2) " + list);

        list.add("Russia"); // Add it to the end of the arraylist
        System.out.println("(3) " + list);

        list.add("France"); // Add it to the end of the arraylist
        System.out.println("(4) " + list);

        list.add("Germany", 2); // Add it to the arraylist at index 2
        System.out.println("(5) " + list);

        list.add("Norway", 5); // Add it to the arraylist at index 5
        System.out.println("(6) " + list);

        // Remove elements from the arraylist
        list.remove("Canada"); // Same as arraylist.remove(0) in this case
        System.out.println("(7) " + list);

        list.remove(2); // Remove the element at index 2
        System.out.println("(8) " + list);

        list.remove(list.size() - 1); // Remove the last element
        System.out.print("(9) " + list + "\n(10) ");

        for (String s: list)
            System.out.print(s.toUpperCase() + " ");
    }
}
