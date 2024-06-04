package com.test;

import java.util.Scanner;

public class CarLoan implements LoanCalculate {

    double princiAmt, loanAmount, roi = 7.5; // Assuming 7.5% interest rate for car loans
    int years;
    Scanner sc = new Scanner(System.in);

    @Override
    public void acceptPrinciAmt() {
    	//TODO Auto-generated method stub 
    	
        System.out.println("Enter principal amount for car loan:");
        princiAmt = sc.nextDouble();
        System.out.println("Enter no. of years for car loan:");
        years = sc.nextInt();
    }

    @Override
    public void calculate() {
    	//TODO Auto-generated method stub 
    	
        loanAmount = (princiAmt * years * roi) / 100;
        System.out.println("Your interest for a car loan of " + years + " years is: " + loanAmount);
    }

    public static void main(String[] args) {
    	//TODO Auto-generated method stub 
    	
        CarLoan obj = new CarLoan();
        obj.acceptPrinciAmt();
        obj.calculate();
    }

}

