class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            int remainingSum = target - nums[i];
            if(map.containsKey(remainingSum)){
                res[1] = i;
                res[0] = map.get(remainingSum);
                
                return res;
            }
            map.put(nums[i], i);
        }
        
        return res;
    }
}