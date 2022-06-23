// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Complete obj = new Complete();
		    arr = obj.Rearrange(arr, sizeOfArray);
		    for(int i=0; i< sizeOfArray;i++){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}


// } Driver Code Ends


//User function Template for Java

            

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] Rearrange (int A[], int n) {
        // Complete the function
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] != -1 && A[i] != i)
            {
                int x = A[i];
 
                // check if desired place
                // is not vacate
                while (A[x] != -1 && A[x] != x)
                {
                    // store the value from
                    // desired place
                    int y = A[x];
 
                    // place the x to its correct
                    // position
                    A[x] = x;
 
                    // now y will become x, now
                    // search the place for x
                    x = y;
                }
 
                // place the x to its correct
                // position
                A[x] = x;
 
                // check if while loop hasn't
                // set the correct value at A[i]
                if (A[i] != i)
                {
                    // if not then put -1 at
                    // the vacated place
                    A[i] = -1;
                }
            }
        }
        return A;
    }
    
    
}


