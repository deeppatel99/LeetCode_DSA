// { Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}
// } Driver Code Ends


class GfG
{
    int max_sum(int A[], int n)
    {
         int preWsum = 0 , Totsum = 0;
     for(int i=0;i<n;i++){
         preWsum+=A[i]*i;
         Totsum+=A[i];
     }
     int ans = preWsum;
     for(int i=1;i<n;i++){
         int temp = preWsum-(Totsum-A[i-1])+A[i-1]*(n-1);
         ans = Math.max(ans,temp);
         preWsum = temp;
     }
     return ans;
    }	
    
   
}
