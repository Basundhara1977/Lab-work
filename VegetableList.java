package com.test;

import java.util.ArrayList;
import java.util.Iterator; // Import Iterator class

public class VegetableList {
    public static void main(String[] args) {
    	//TODO Auto-generated method stub 
		
        ArrayList<String> vegetables = new ArrayList<>();

        // Add vegetables to the list
        vegetables.add("Carrot");
        vegetables.add("Broccoli");
        vegetables.add("Spinach");
        vegetables.add("Tomato");
        

        System.out.println("Original List of Vegetables:");
        System.out.println(vegetables);
        
     // Iterator operation: Iterate over the elements of the list
        System.out.println("\nIterating over the list using Iterator:");
        Iterator<String> iterator = vegetables.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Get operation: Get the vegetable at index 2
        String str = vegetables.get(2);
        System.out.println("\nVegetable at index 2: " + str);

        // Set operation: Change "Broccoli" to "Cabbage"
        vegetables.set(1, "Cabbage");
        System.out.println("\nAfter set operation:");
        System.out.println(vegetables);

        // Add operation: Add "Lettuce" at index 3
        vegetables.add(3, "Lettuce");
        System.out.println("\nAfter add operation:");
        System.out.println(vegetables);

        
    }
}
