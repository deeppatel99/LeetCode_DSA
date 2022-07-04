// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    
  // METHOD - 1 T(n) = O(nlogn)
    // int maxTripletSum(int a[], int n)
    // {
    //     // Complete the function
        
    //     Arrays.sort(a);
        
    //     return a[n-1]+a[n-2]+a[n-3];
    // }
    

 // METHOD - 2  T(n) = O(n)
    
    int maxTripletSum(int a[], int n)
    {
        // Complete the function
        int maxA = -100000000, maxB = -100000000, maxC = -100000000;
        
        for(int i = 0; i < n; i++){
            if(a[i] > maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = a[i];
            }else if(a[i] > maxB){
                maxC = maxB;
                maxB = a[i];
            }else if(a[i] > maxC){
                maxC = a[i];
            }
        }
        
        return (maxA + maxB + maxC);
    }
  
    
}


// { Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.maxTripletSum(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}

  // } Driver Code Ends