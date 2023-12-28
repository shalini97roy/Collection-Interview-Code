package NewProjcetFor_ENITIATE_Collection;

import java.util.ArrayList;

public class ArrayListRemoveElementExample {

	public static void main(String[] args) {
		// Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Index of the element to be removed
        int indexToRemove = 2;

        // Check if the index is valid
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
            // Remove the element at the specified index
            arrayList.remove(indexToRemove);

            // Print the ArrayList after removal
            System.out.println("ArrayList after removing element at index " + indexToRemove + ": " + arrayList);
        } else {
            System.out.println("Invalid index. Element removal failed.");
        }

	}

}
