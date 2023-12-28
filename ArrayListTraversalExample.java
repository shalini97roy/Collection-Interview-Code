package NewProjcetFor_ENITIATE_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversalExample {

	public static void main(String[] args) {
		// Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Method 1: Using Enhanced For Loop
        System.out.println("Traversing ArrayList using Enhanced For Loop:");
        for (Integer element : arrayList) {
            System.out.println(element);
        }

        // Method 2: Using Iterator
        System.out.println("\nTraversing ArrayList using Iterator:");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }

}
