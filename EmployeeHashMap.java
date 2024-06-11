package com.example;

import java.util.HashMap;

public class EmployeeHashMap  {

    public static void main(String[] args) {
        // Creating a HashMap to store employee ID and employee name mappings
        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();

        //Insert elements to the Hashmap for the Employee
        employeeMap.put(1001, "Swati");
        employeeMap.put(1002, "Swapnil");
        employeeMap.put(1003, "Basundhara");
        employeeMap.put(1004, "Rohan");
        employeeMap.put(1004, "Piya");

        // Displaying the HashMap
        System.out.println("Employee HashMap: " + employeeMap);
        
       //Access keys of the map
      		System.out.println("Keys: " + employeeMap.keySet());
      		
       //Access values of the map
      		System.out.println("Values: " + employeeMap.values());
      		
      //Access entries of the map
      		System.out.println("Entries: " + employeeMap.entrySet());
      		
    }
}


