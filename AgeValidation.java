package com.test;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);
    }
}
public class AgeValidation {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age cannot be zero or negative");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int userInput = scanner.nextInt();

        try {
            validateAge(userInput);
            System.out.println("Age is valid: " + userInput);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}





