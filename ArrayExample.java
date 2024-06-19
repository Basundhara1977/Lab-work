package com.example;

import java.util.Scanner;


//Array is a linear data structure which stores values of same kind
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialization of an array
		int arr[ ]= new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter five numbers:");//56 78 90 23 10 arr[0], arr[1], arr[2], arr[4]
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the number you entered:");
		for(i=0;i<5;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}

}
