import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListExample {
    
    public static void main(String[] args) {

        // uninitialized array list of strings 
        ArrayList<String> uninitialized;
        // initialized array list of 0 size
        ArrayList<Integer> initialized = new ArrayList<>();
        // initialized array list with integer values
        ArrayList<Integer> initializedWithValues = new ArrayList<>(Arrays.asList(1, 2, 3));

        // add an integer to an empty array list
        initialized.add(1);
        // print to console the value of the integer at index 0
        System.out.println(initialized.get(0)); // 1
        
        // change the value at index 0 to 2 (was 1)
        initialized.set(0, 2);
        // print to console the value of the integer at index 0
        System.out.println(initialized.get(0)); // 2

        // remove the value at index 0
        initialized.remove(0);

        // store value representing the number of items (i.e., length, size) of the initialized array list
        int numItems = initialized.size();
        // print to console the number of items within the array list
        System.out.println(numItems); // 0

        // store value representing if array list is empty
        boolean isEmpty = initialized.isEmpty();
        System.out.println(isEmpty); // true

        // sorting an array using a comparator in descending order (O(n * log(n)) complexity due to comparison)
        initializedWithValues.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer anInt, Integer t1) {
                return t1-anInt;
            }
        });
        // print to console the sorted array list
        System.out.println(initializedWithValues); // [3, 2, 1]

        // check if an item is within the array list (O(n) complexity due to iteration)
        boolean containsValueZero = initializedWithValues.contains(0);
        // print to console if array list contains the value zero
        System.out.println(containsValueZero); // false

        // index of an item within the array list, if any (O(n) complexity due to iteration
        int indexOfTwo = initializedWithValues.indexOf(2);
        // print to console the index where the value of 2 is stored
        System.out.println(indexOfTwo); // 1

    }  

}