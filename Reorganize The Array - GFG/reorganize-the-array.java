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
    public static int[] Rearrange (int arr[], int n) {
        // Complete the function
        
        // Method - 1: T(n) - O(n) S(n) - O(1)
        
        for (int i = 0; i < arr.length;)
        {
            if (arr[i] >= 0 && arr[i] != i)
            {
                int ele = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = ele;
            }
            else
            {
                i++;
            }
        }
        
        return arr;
        
        // Method - 2: T(n) - O(nlogn) S(n) - O(n)
        
        
        // Set<Integer> s = new HashSet<>();
        // for (int i = 0; i < A.length; i++)
        // {
        //     s.add(A[i]);
        // }
        
        // for(int i = 0; i < A.length; i++){
        //     if(s.contains(i)){
        //         A[i] = i;
        //     }else{
        //         A[i] = -1;
        //     }
        // }
        // return A;
    }
    
    
}


