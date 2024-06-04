package com.test;

import java.util.Scanner;

public class HomeLoan implements LoanCalculate {

    double princiAmt, loanAmount, roi = 8.5;
    int years;
    Scanner sc = new Scanner(System.in);

    @Override
    public void acceptPrinciAmt() {
    	//TODO Auto-generated method stub 
    	
        System.out.println("Enter principal amount:");
        princiAmt = sc.nextDouble();
        System.out.println("Enter no. of years:");
        years = sc.nextInt();
    }

    @Override
    public void calculate() {
    	//TODO Auto-generated method stub 
    	
        loanAmount = (princiAmt * years * roi) / 100;
        System.out.println("Your interest for " + years + " years is: " + loanAmount);
    }

    public static void main(String[] args) {
    	//TODO Auto-generated method stub 
    	
        HomeLoan obj = new HomeLoan();
        obj.acceptPrinciAmt();
        obj.calculate();
    }
}


