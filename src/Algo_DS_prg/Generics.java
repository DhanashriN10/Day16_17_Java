package Algo_DS_prg;

import java.util.HashSet;
import java.util.Set;

public class Generics 
{
	
	  // The first type parameter to Map represents the type of the key and
	  // the second type parameter represents the type of the value. In this
	  // case String represents the key type and Integer represents the value
	  // type
	  static boolean find(Set<String> myCollection, String key) {
	    return myCollection.contains(key);
	  }

	  public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]); // parseInt converts String to int
	    
	    // java.util.HashSet is Java's hash table implementation for a set
	    Set<String> searchCollection = new HashSet<String>();
	    int i;

	    // add is the method provided by Set to insert a new key
	    for (i = 0; i < n; i++) {
		searchCollection.add(args[i+1]);
	    }

	    for (i = n+1; i < args.length; i++) {
	      // %b is the formatting string for a boolean
	      System.out.printf("%s %b\n", args[i], find(searchCollection, args[i]));
	    }
	  }
	}


