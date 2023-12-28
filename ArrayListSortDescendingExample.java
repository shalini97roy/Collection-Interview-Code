package NewProjcetFor_ENITIATE_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDescendingExample {

	public static void main(String[] args) {
		// Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(7);

        // Sort the ArrayList in descending order
        Collections.sort(arrayList, Collections.reverseOrder());

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList in descending order: " + arrayList);
    

	}

}
