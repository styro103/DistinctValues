/*
 * The class that finds the number of distinct values in an array using counters.
 * This has a time complexity of O(N)
 */

class DistinctCounters
{
    public int getCount(int[] A) 
    {
        if (A.length<2) //If Less Than Two Elements
            return A.length; //Return Number of Elements
        
        //int M; //For Range of Elements
        int dc = 0; //Number of Distinct Values
        int N = A.length; //Length of Array
        int min = A[0]; //Minimum Value in Array
        int max = A[0]; //Maximum Value in Array
        int [] count; //Array of Counters
        
        for (int i=1; i<N; i++) //Loop Through Array, Get Minimum and Max
        {
            if (A[i]<min)
                min = A[i];
            else if (A[i]>max)
                max = A[i];
        }
        
        count = new int[max-min+1]; //Set Size of Counters Array to Range of Elements
        //M = count.length; //Length of Counters Array
        
        for (int i=0; i<N; i++) //Loop through Array A
        {
            int tmp = ++count[A[i]-min]; //Increment Count of Number in Respective Position in Counters
            ///*
            if (tmp==1) //If Count of Current Element is 1 (Was Zero Before)
                dc++; //New Distinct Element, Increment Counter of Distinct Elements
            //*/
        }
        /*
        for (int i=0; i<M; i++) //Loop Through Array of Counters, This Would Make the Runtime O(N+M)
        {
            if (count[i]!=0) //If Count of Element Isn't Zero
                dc++; //New Distinct Element, Increment Counter of Distinct Elements
        }
        */
        return dc; //Return Count of Distinct Elements
        
    }
}