package Algo_DS_prg;

public class Permutation_string 
{

	   
	    private void permute(String str, int l, int r)
	    {
	        if (l == r)
	            System.out.println(str);
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                str = swapping(str,l,i);
	                permute(str, l+1, r);
	                str = swapping(str,l,i);
	            }
	        }
	    }
	 
	  
	    public String swapping(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
	    
	    public static void main(String[] args)
	    {
	        String str = "ABC";
	        int n = str.length();
	        Permutation_string  permutation = new Permutation_string ();
	        permutation.permute(str, 0, n-1);
	    }
	 
	 
	}
	 
	
