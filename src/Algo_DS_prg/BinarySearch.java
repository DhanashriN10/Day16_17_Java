package Algo_DS_prg;

import java.util.Scanner;

public class BinarySearch 
{

    static int binarySearch(String[] words, String word)
    {
        int l = 0, r = words.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int res = word.compareTo(words[m]);
 
            // Check if word is present at mid
            if (res == 0)
                return m;
 
            // If word greater, ignore left half
            if (res > 0)
                l = m + 1;
 
            // If word is smaller, ignore right half
            else
                r = m - 1;
        }
 
        return -1;
    }
 
    // Driver method to test above
    public static void main(String []args)
    {
       
    	Scanner sc = new Scanner(System.in);
 	   int i;  

 	   System.out.println("Enter number of words you wish to input: ");
 	   int n=sc.nextInt();

 	   String[] words= new String[n];

 	   System.out.println("Enter the words");
 	   for ( i = 0; i < words.length; i++)
 	   {
 	       System.out.print("WORD " + (i + 1) + ": ");
 	       words[i] = sc.next();
 	   }

 	   System.out.println("enter the word you want to search for");
 	   String word=sc.next();
 	  int result = binarySearch(words, word);
 	 

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}

