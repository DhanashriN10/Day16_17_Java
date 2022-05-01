package Algo_DS_prg;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_sort 
{
		public static void main(String[] args) 
		{	
			//Utility u=new Utility();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter no. of words to be printed: ");
			int n=s.nextInt();
			 
			//create string array
			String array[]=new String[n];
			System.out.println();	
			System.out.println("Enter the words to be printed: ");

			for(int i=0;i<array.length;i++)
			{
				array[i]=s.next();
			}
			System.out.println();
		       
			//sort string array using Arrays.sort method
			System.out.println("Sorted order is: ");
			for(int i=0;i<array.length;i++)
			{
				Arrays.sort(array);
				System.out.println(array[i]);
			}
		}
	}

