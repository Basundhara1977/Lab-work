package com.example;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//Initialization of an array
				int arr[ ]= new int[5];
				int i,min;
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter five numbers:");//67 54 34 43 87 arr[0], arr[1], arr[2], arr[4]
				for(i=0;i<5;i++)
				{
					arr[i]=sc.nextInt();
				}
				
				min=arr[0];
				for(i=0;i<5;i++)
				{
					if(arr[i]<min) 
					{
						min=arr[i];
					}
					System.out.println("The minimum value is:" +min);
				}

	}

}
