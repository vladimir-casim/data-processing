package arrays;

import java.util.HashSet;

/*
There are many methods through which you can find the duplicate elements in the given array.
 1) Using Brute Force Method :
In this method, we compare each element of an array with other elements. If any two elements are found equal,
we declare them as duplicates. The performance of this method is very low if an array contains lots of elements.
Therefore, this method is not recommended in real time. It gives time complexity of O(n^2).

 2) Using HashSet :
This method is better than the Brute Force method. It gives O(n) performance. You know that HashSet holds only
unique elements. It never allows duplicate elements. We use this property of HashSet to find duplicates in an array.
What we do is we try to add each element of an array into HashSet using add() method. This method adds only unique
elements into HashSet. If you try to add duplicate element, it will return false.
 */
public class DuplicatesInArray {

    static void method1() {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if( (strArray[i].equals(strArray[j])) && (i != j) ) {
                    System.out.println("Duplicate Element is : " + strArray[j]);
                }
            }
        }
    }

    static void method2() {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
        HashSet<String> set = new HashSet<String>();

        for (String arrayElement : strArray) {
            if(!set.add(arrayElement)) {
                System.out.println("Duplicate Element is : " + arrayElement);
            }
        }
    }

    public static void main(String[] args) {
        method1();
        method2();
    }

}
