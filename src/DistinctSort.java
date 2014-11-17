/*
 * The class that finds the number of distinct values in an array using sorting.
 * This has a time complexity of O(N*log(N))
 */
import java.util.Arrays; //For Using Built In Sorting Function

class DistinctSort 
{
    public int getCount(int[] A) 
    {
        int N = A.length; //Length of Array
        int dc = 1; //Count of Distinct Elements
        
        if (N<2) //If Less Than Two Elements
			return N; //Return Number of Elements
            
        Arrays.sort(A); //Sort Array
        
        for (int i=1; i<N; i++) //Loop Through Sorted Array
        {
            if (A[i]!=A[i-1]) //If Element Is Not the Same As Previous
                dc++; //That Means New Distinct Element
        }
        
        return dc; //Return Count of Distinct Elements
    }
}