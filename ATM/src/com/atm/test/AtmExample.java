package com.atm.test;

import java.util.Scanner;

public class AtmExample 
{
	public static void main(String[] args) 
	{
		int balance=10000;
		int deposit,withdrawn;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter 1 for deposit");
			System.out.println("enter 2 for withdrawn");
			System.out.println("enter 3 for balance check");
			System.out.println("enter 4 for exit");
			System.out.println("select any one option");
		
        int option=sc.nextInt();
        
        switch(option)
        {
        case 1:System.out.println("Enter amount to deposit");
         deposit=sc.nextInt();
         balance=balance+deposit;
         System.out.println("deposit succesfull");
         System.out.println();
         break;
        case 2:System.out.println("Enter amount for withdrawn");
        withdrawn=sc.nextInt();
        if(balance>=withdrawn)
        {
        	balance=balance-withdrawn;
        	System.out.println("collect your cash");
        	System.out.println();
        }
        else
        {
        	System.out.println("insufficient amount");
        }
        break;
        case 3:System.out.println("balance ="+balance);
        System.out.println();
        break;
        case 4:System.exit(0);
        break;
        }
		}
	}
}
