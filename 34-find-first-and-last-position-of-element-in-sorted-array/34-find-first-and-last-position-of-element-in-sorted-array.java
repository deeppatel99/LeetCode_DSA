class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int[] res = {-1,-1};
        
        // left position
        while(i <= j){
            int mid = (i + j)/2;
            if(nums[mid] >= target){
                j = mid - 1;   
            }else{
                i = mid + 1;
            }
            
            if(nums[mid] == target)
                res[0] = mid;             
        }
        
        // right position
        i = 0;
        j = n  -1;
        while(i <= j){
            int mid = (i + j)/2;
            if(nums[mid] <= target){
                i = mid + 1;   
            }else{
                j = mid - 1;
            }
            
            if(nums[mid] == target)
              res[1] = mid; 
        }

        return res;
    }
}