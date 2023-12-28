package NewProjcetFor_ENITIATE_Collection;

import java.util.ArrayList;

public class ArrayListContainsExample {

	public static void main(String[] args) {
		// Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Element to check for existence
        int elementToCheck = 3;

        // Check if the element exists in the ArrayList
        boolean isElementPresent = arrayList.contains(elementToCheck);

        // Print the result
        if (isElementPresent) {
            System.out.println("The element " + elementToCheck + " exists in the ArrayList.");
        } else {
            System.out.println("The element " + elementToCheck + " does not exist in the ArrayList.");
        }
    
	}

}
